package ar.edu.poo2.tp7;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecretariaDeportes {
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();

	public List<ActividadSemanal> getActividadesFutbol() {
		return actividades.stream().filter(s -> s.deporteEsFutbol()).toList();
	}

	public List<ActividadSemanal> getActividadesComplejidad(int n) {
		return actividades.stream().filter(act -> act.getDeporte().getComplejidad() == n).toList();
	}

	public ActividadSemanal getActividadMenorCosto(ActividadSemanal actividad) {
		return this.actividadesDeDeporte(actividad.getDeporte()).stream().filter(act -> act.getCoste() == this.getMenorCosteDeActividad(Deporte d));
	}

	public List<ActividadSemanal> actividadesDeDeporte(Deporte d) {
		return actividades.stream().filter(s -> s.getDeporte() == d).toList();
	}
	
	public ActividadSemanal actividadMenorCoste(Deporte d) {
		return this.actividadesDeDeporte(d).stream().min(Comparator.comparing(act -> act.getCoste())));
	}
	
	
	public int getMinimoDeActividadesDeporte(Deporte deporte) {
		return this.actividadesDeDeporte(deporte).stream().map(act -> act.getCoste()).min(Comparator.naturalOrder()).get();
	}

	public List<ActividadSemanal> actividadMenorCostoDeporte(Deporte deporte) {
		return this.actividadesDeDeporte(deporte).stream().filter(act -> act.getCoste() == this.getMinimoDeActividadesDeporte(deporte)).toList();
	}
}
