package ar.edu.poo2.tp2;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaNacimiento;
	private int sueldoBasico;
	private ReciboDeHaberes recibo;
	
	public Empleado(String nombre, String direccion, String estado, LocalDate fecha, int sueldo, ReciboDeHaberes recibo) {
		this.setDireccion(direccion);
		this.setEstadoCivil(estado);
		this.setFechaNacimiento(fecha);
		this.setNombre(nombre);
		this.setRecibo(recibo);
		this.setSueldoBasico(sueldo);
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(int sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public ReciboDeHaberes getRecibo() {
		return recibo;
	}

	public void setRecibo(ReciboDeHaberes recibo) {
		this.recibo = recibo;
	}
	
	
	
	
}
