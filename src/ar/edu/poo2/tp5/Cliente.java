package ar.edu.poo2.tp5;

import java.util.List;

public class Cliente implements Agencia {
	private List<Pagable> pagables;

	public double registrarProducto(Pagable producto) {
		double montoAPagar = 0;
		for (Pagable pagable : pagables) {
			montoAPagar += pagable.registrado();
		}
		return montoAPagar;
	}

	@Override
	public void registrarPago(Pagable p) {
	}

}
