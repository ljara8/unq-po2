package ar.edu.poo2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDate fecNac;

	public Persona(String nomb, LocalDate fechaNaci) {
		this.setFecNac(fechaNaci);
		this.setNombre(nomb);
	}

	public boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}

	public int getEdad() {
		LocalDate hoy = LocalDate.now();
		return Period.between(this.getFecNac(), hoy).getYears();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecNac() {
		return fecNac;
	}

	public void setFecNac(LocalDate fecNac) {
		this.fecNac = fecNac;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
