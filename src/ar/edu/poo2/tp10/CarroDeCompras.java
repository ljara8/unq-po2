package ar.edu.poo2.tp10;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {
	private List<Producto>productos = new ArrayList<Producto>();

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public int totalRounded() {
		return Math.round(this.total());
	}
	
	public float total() {
		float total = 0;
		for (Producto producto : productos) {
			total = total +producto.getPrice();
		}
		return total;
	} 

}
