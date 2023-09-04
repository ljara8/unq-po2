package ar.edu.poo2.tp2;

import java.time.LocalDate;

public class Temporario extends Empleado {

	private LocalDate finFechaDesignacion;
	private int cantidadHorasExtra;

	public LocalDate getFinFechaDesignacion() {
		return finFechaDesignacion;
	}

	public void setFinFechaDesignacion(LocalDate finFechaDesignacion) {
		this.finFechaDesignacion = finFechaDesignacion;
	}

	public int getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}

	public void setCantidadHorasExtra(int cantidadHorasExtra) {
		this.cantidadHorasExtra = cantidadHorasExtra;
	}

	public Temporario(String nombre, String direccion, String estado, LocalDate fecha, int sueldo,
			ReciboDeHaberes recibo, LocalDate fechaFin, int horasExtra) {
		super(nombre, direccion, estado, fecha, sueldo, recibo);
		this.setCantidadHorasExtra(horasExtra);
		this.setFinFechaDesignacion(fechaFin);

	}

	@Override
	public double calcularSueldoNeto() {
		return this.getSueldoBasico() + this.calcularPagosHorasExtra() - this.calcularRetenciones();

	}

	@Override
	public double calcularRetenciones() {
		return this.calcularDescuentosObraSocial() + this.calcularAportes();
	}

	public int calcularPagosHorasExtra() {
		return this.cantidadHorasExtra * 40;
	}

	@Override
	public double calcularDescuentosObraSocial() {
		if (this.calcularEdad() > 50) {
			return (this.getSueldoBasico() + 25) * 0.1;
		} else {
			return this.getSueldoBasico() * 0.1;
		}
	}

	public double calcularAportes() {
		return this.getSueldoBasico() * 0.1 + this.cantidadHorasExtra * 5;
	}
}