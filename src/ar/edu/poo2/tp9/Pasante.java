package ar.edu.poo2.tp9;

public class Pasante extends Empleado{
	private int cantidadHoras;

	public Pasante(String n, int c, int ch) {
		super(n, 40);
		this.cantidadHoras = ch;
	}

	@Override
	public double getSueldoBruto() {
		return this.getCantidadHoras() * this.getPagoPorHora();
	}

	
	public int getCantidadHoras() {
		return cantidadHoras;
	}
}
