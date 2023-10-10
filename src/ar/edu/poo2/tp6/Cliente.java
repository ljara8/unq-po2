package ar.edu.poo2.tp6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private Banco banco;
	private float fondos;

	public Cliente(String n, String a, String d, int edad, double sueldoNM, Banco banco, float fondo) {
		this.nombre = n;
		this.apellido = a;
		this.direccion = d;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNM;
		this.banco = banco;
		this.fondos = fondo;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void solicitarCredito(SolicitudCredito credito) {
		credito.setSolicitante(this);
		banco.registrarSolicitud(credito);
	}

	public void cobrar(double montoMensual) {
		fondos += montoMensual;

	}

	public int getEdad() {
		return edad;
	}

	public double porcentajeSueldoMensual(double porcentaje) {
		return this.getSueldoNetoMensual() * porcentaje;
	}

	public double sueldoNetoAnual() {
		return this.getSueldoNetoMensual() * 12;
	}
}
