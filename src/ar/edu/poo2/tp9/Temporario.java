package ar.edu.poo2.tp9;

public class Temporario extends Empleado{
	private boolean estaCasadoOTieneHijos;
	private int sueldoBasico = 1000;
	private int cantidadHoras;

	public Temporario(String n, int c, boolean estaCasadoOHijos, int sb, int ch) {
		super(n, c);
		this.estaCasadoOTieneHijos = estaCasadoOHijos;
		this.sueldoBasico = sb;
		this.cantidadHoras = ch;
	}

	@Override
	public double getSueldoBruto() {
		return this.getSueldoBasico() + this.cantidadHoras * 5 + this.getBonoPorPadreOCasado();
	}
	
	public int getBonoPorPadreOCasado() {
		int bono = 0;
		if (this.estaCasadoOTieneHijos) {
			bono = 100;
		}
		return bono;
	}
	
	public int getSueldoBasico() {
		return sueldoBasico;
	}
	
	public int getCantidadHoras() {
		return cantidadHoras;
	}

}
