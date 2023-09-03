package ar.edu.poo2.tp2;

import java.time.LocalDate;

public class Permanente extends Empleado{
	
	private int cantidadHijos;
	private int antiguedad;
	
	
	public int getCantidadHijos() {
		return cantidadHijos;
	}
	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public Permanente(String nombre, String direccion, String estado, LocalDate fecha, int sueldo,
			ReciboDeHaberes recibo, int cantHijos, int antiguedad) {
		super(nombre, direccion, estado, fecha, sueldo, recibo);
		this.setCantidadHijos(cantHijos);
		this.setAntiguedad(antiguedad);
	}
	
}
