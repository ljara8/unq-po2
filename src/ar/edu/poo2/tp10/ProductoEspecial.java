package ar.edu.poo2.tp10;

public class ProductoEspecial extends Producto{
	
	@Override
	public float getPrice() {
		return getPrice() - this.getDescuento();
	}

	private float getDescuento() {
		return 50;
	}

}
