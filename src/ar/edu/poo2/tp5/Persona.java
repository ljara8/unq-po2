package ar.edu.poo2.tp5;

import java.time.LocalDate;

public class Persona implements Nombrable {
	private String nombre;
	private LocalDate fecNac;
	private int edad;

	public Persona(String nombre, LocalDate fecNac, int edad) {
		this.nombre = nombre;
		this.fecNac = fecNac;
		this.edad = edad;
	}

	
	@Override
	public String getName() {
		return nombre;
	}
	
	public LocalDate getFecNac() {
		return fecNac;
	}
	
	public int getEdad() {
		return edad;
	}

}
