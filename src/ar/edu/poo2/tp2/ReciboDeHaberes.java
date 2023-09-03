package ar.edu.poo2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private int sueldoBruto;
	private int sueldoNeto;
	private String desgloceConceptos;
	
	
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public LocalDate getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public int getSueldoBruto() {
		return sueldoBruto;
	}
	public void setSueldoBruto(int sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	public int getSueldoNeto() {
		return sueldoNeto;
	}
	public void setSueldoNeto(int sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}
	public String getDesgloceConceptos() {
		return desgloceConceptos;
	}
	public void setDesgloceConceptos(String desgloceConceptos) {
		this.desgloceConceptos = desgloceConceptos;
	}
	
	
	public ReciboDeHaberes(String nombre, String direccion, LocalDate fecha, int sueldoBr, int sueldoNe, String desgloce) {
		this.setNombreEmpleado(nombre);
		this.setDireccion(direccion);
		this.setFechaEmision(fecha);
		this.setSueldoBruto(sueldoBr);
		this.setSueldoNeto(sueldoNe);
		this.setDesgloceConceptos(desgloce);
	}
	
}
