package ar.edu.poo2.tp9;

public abstract class Empleado {
	
	private String nombre;
	private int pagoPorHora;
	
	public Empleado(String n, int c) {
		this.nombre = n;
		this.pagoPorHora = c;
	}
	
	public final double getSueldo() {
		return this.getSueldoBruto() - this.getDescuentos();
	}
	
	
	public abstract double getSueldoBruto();
	
	
	public double getDescuentos() {
		return this.getSueldoBruto() * 0.13;
	}

	public int getPagoPorHora() {
		return pagoPorHora;
	}

	
}
