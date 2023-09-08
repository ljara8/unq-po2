package ar.edu.poo2.tp4;

public class IngresoHorasExtras extends Ingreso {
	private int horasExtras;

	public IngresoHorasExtras(String mes, String concep, double monto, int hrsExtra) {
		super(mes, concep, monto);
		this.horasExtras = hrsExtra;
	}

	@Override
	public double getMontoImponible() {
		return 0;
	}
}
