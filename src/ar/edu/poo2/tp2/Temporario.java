package ar.edu.poo2.tp2;

import java.time.LocalDate;

public class Temporario extends Empleado{
	
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
	
}
