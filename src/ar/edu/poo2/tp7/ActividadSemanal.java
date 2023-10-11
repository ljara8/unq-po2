package ar.edu.poo2.tp7;

public class ActividadSemanal {

	private int dificultad;
	private DiaDeLaSemana dia;
	private int horaInicio;
	private int duracion;
	private Deporte deporte;

	public int getCoste() {
		return this.costeHoraSegunDia() + this.costeSegunComplejidad();

	}

	public int costeHoraSegunDia() {
		int coste = 0;
		if (dia.values().toString().startsWith("L") || dia.values().toString().startsWith("M")) {
			coste = 500;
		} else {
			coste = 1000;
		}
		return coste;
	}

	public int costeSegunComplejidad() {
		return deporte.getComplejidad() * 200;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public boolean deporteEsFutbol() {
		return this.getDeporte().toString() == "FUTBOL";
		
	}
	
	public boolean esMismoDeporte(Deporte dep) {
		return this.getDeporte() == dep;
	}
	

}