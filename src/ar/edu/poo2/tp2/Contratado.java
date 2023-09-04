package ar.edu.poo2.tp2;

import java.time.LocalDate;

public class Contratado extends Empleado{
	
	private int nroContrato;
	private String medioPago;
	
	
	
	
	public Contratado(String nombre, String direccion, String estado, LocalDate fecha, int sueldo,
			ReciboDeHaberes recibo, int contrato, String medioPago) {
		super(nombre, direccion, estado, fecha, sueldo, recibo);
		this.setNroContrato(contrato);
		this.setMedioPago(medioPago);
		
	}




	public int getNroContrato() {
		return nroContrato;
	}




	public void setNroContrato(int nroContrato) {
		this.nroContrato = nroContrato;
	}




	public String getMedioPago() {
		return medioPago;
	}




	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}




	@Override
	public double calcularSueldoNeto() {
		return this.getSueldoBasico() - 50;
		
	}




	@Override
	public double calcularRetenciones() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public double calcularDescuentosObraSocial() {
		return 0;
	}




	@Override
	public double calcularAportes() {
		return 0;
	}
	
}
