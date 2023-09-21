package ar.edu.poo2.tp5;

import java.util.List;

public class Caja implements Agencia {
	private List<Producto> productos;

	public Caja(List<Producto> productos) {
		this.productos = productos;
	}

	public double getMontoTotal() {
		double montoAPagar = 0;
		for (Producto producto : productos) {
			montoAPagar += producto.getPrecio();
		}
		return montoAPagar;
	}

	@Override
	public void registrarPago(Pagable p) {

	}

}
