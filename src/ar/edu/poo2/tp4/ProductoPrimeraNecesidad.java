package ar.edu.poo2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	private double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.setDescuento(descuento / 100);

	}

	@Override
	public double getPrecio() {
		return super.getPrecio() - this.getPrecioADescontar();
	}

	private double getPrecioADescontar() {
		return (precio * this.getDescuento());
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	

}
