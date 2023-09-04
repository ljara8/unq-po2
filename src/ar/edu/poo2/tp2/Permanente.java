package ar.edu.poo2.tp2;

import java.time.LocalDate;

public class Permanente extends Empleado {

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

	@Override
	public double calcularSueldoNeto() {
		return this.salarioFamiliar() - this.calcularRetenciones();
		// TODO Auto-generated method stub

	}

	private double salarioFamiliar() {
		if (this.getEstadoCivil() == "casado") {
			return this.getSueldoBasico() + 100 + 50 * this.antiguedad + 150 * this.getCantidadHijos();
		} else {
			return this.getSueldoBasico() + 50 * this.antiguedad + 150 * this.getCantidadHijos();
		}
	}

	@Override
	public double calcularRetenciones() {
		return 0;
	}

	@Override
	public double calcularDescuentosObraSocial() {
		if (this.calcularEdad() > 50) {
			return (this.getSueldoBasico() + 25) * 0.1;
		} else {
			return this.getSueldoBasico() * 0.1;
		}
	}

	@Override
	public double calcularAportes() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() * 1.5;
	}

}
