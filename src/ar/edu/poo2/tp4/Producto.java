package ar.edu.poo2.tp4;


public class Producto {
	private String nombre;
	protected double precio;
	private boolean esPrecioCuidado;

	public Producto(String nombre, double precio, boolean esPrecCuidado) {
		this.setEsPrecioCuidado(esPrecCuidado);
		this.setNombre(nombre);
		this.setPrecio(precio);
	}


	private void setPrecio(double precio2) {
		this.precio = precio2;
	}

	private void setNombre(String nombre2) {
		this.nombre = nombre2;
	}

	public double getPrecio() {
		return precio;
	}

	public Object getNombre() {
		return nombre;
	}

	public void aumentarPrecio(double aumento) {
		this.precio += aumento;
	}


	public boolean getEsPrecioCuidado() {
		return esPrecioCuidado;
	}


	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}



}
