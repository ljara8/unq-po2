package ar.edu.poo2.tp5;

public class Impuesto implements Pagable {
	private double tasa;

	public Impuesto(double tasa) {
		this.tasa = tasa;
	}

	@Override
	public double registrado() {
		return this.getTasa();
	}

	public double getTasa() {
		return tasa;
	}
}
