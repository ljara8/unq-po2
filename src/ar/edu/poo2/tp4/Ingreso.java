package ar.edu.poo2.tp4;

public class Ingreso {
	private String mes;
	private String concepto;
	protected double monto;

	public Ingreso(String mes, String concep, double monto) {
		this.mes = mes;
		this.concepto = concep;
		this.monto = monto;
	}

	public double getMontoImponible() {
		return monto;
	}

	public double getMonto() {
		return monto;
	}

}
