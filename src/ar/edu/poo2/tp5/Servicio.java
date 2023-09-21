package ar.edu.poo2.tp5;

public class Servicio implements Pagable {
	private double costoPorUnidad;
	private int cantidadConsumida;

	public Servicio(double costo, int cantidad) {
		this.cantidadConsumida = cantidad;
		this.costoPorUnidad = costo;
	}

	@Override
	public double registrado() {
		return this.getCostoPorUnidad() * this.getCantidadConsumida();
	}

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public int getCantidadConsumida() {
		return cantidadConsumida;
	}

}
