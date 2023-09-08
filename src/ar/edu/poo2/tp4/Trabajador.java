package ar.edu.poo2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();

	public void guardarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}

	public double getTotalPercibido() {
		double cant = 0;
		for (Ingreso ingreso : ingresos) {
			cant += ingreso.getMonto();
		}
		return cant;
	}

	public double getMontoImponible() {
		double cant = 0;
		for (Ingreso ingreso : ingresos) {
			cant += ingreso.getMontoImponible();
		}
		return cant;

	}

	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.2;
	}

}
