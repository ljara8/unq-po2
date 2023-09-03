package ar.edu.poo2.tp2;

public class Empresa {
	private String nombre;
	private int cuit;
	private Empleado empleado;
	private ReciboDeHaberes recibo;
	
	
	
	public Empresa (Empleado empleado, ReciboDeHaberes recibo, String nombre, int cuit) {
		this.setCuit(cuit);
		this.setNombre(nombre);
		this.setEmpleado(empleado);
		this.setRecibo(recibo);
		
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCuit() {
		return cuit;
	}


	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	
	public void calcularTotalSueldosNetos() {
		
	}
	
	public void calcularTotalSueldosBrutos() {
		
	}

	public void calcularTotalRetenciones() {
	
	}


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	public ReciboDeHaberes getRecibo() {
		return recibo;
	}


	public void setRecibo(ReciboDeHaberes recibo) {
		this.recibo = recibo;
	}
}
