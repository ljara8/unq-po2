package ar.edu.poo2.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public abstract class Empleado {
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
	
	public abstract double calcularSueldoNeto();
	
	public abstract double calcularRetenciones();
		

	int calcularEdad() {
		Scanner teclado = new Scanner(System.in);
		int dia = teclado.nextInt();
		int mes = teclado.nextInt();
		int anio = teclado.nextInt();
		teclado.close();
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
		Period periodo = Period.between(fechaNacimiento, fechaHoy);

		return periodo.getYears();
	}
	
	public abstract double calcularDescuentosObraSocial();
	
	public abstract double calcularAportes();
	
}



