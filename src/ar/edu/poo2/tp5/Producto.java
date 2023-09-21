package ar.edu.poo2.tp5;

public class Producto implements Pagable {
	private double precio;
	private int cantidadExistente;

	public Producto(double precio, int stock) {
		this.precio = precio;
		this.cantidadExistente = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidadExistente() {
		return cantidadExistente;
	}

	public void descontarStock() {
			cantidadExistente = this.getCantidadExistente() - 1;
	}

	@Override
	public double registrado() {
		if (this.getCantidadExistente() > 0) {
			this.descontarStock();
			return this.precio;
		}
		return 0;
	}

}
