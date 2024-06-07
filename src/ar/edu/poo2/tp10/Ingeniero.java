package ar.edu.poo2.tp10;

public class Ingeniero implements Personajes {
	private int cantidadLajas;
	private int cantidadPasosADar;

	@Override
	public void caminar() {
		while (cantidadPasosADar > 0) {
			this.ponerLaja();
			cantidadPasosADar -= cantidadPasosADar;
		}
	}

	private void ponerLaja() {
		if (this.getCantidadLajas() > 0) {
			cantidadLajas -= cantidadLajas;
		}

	}

	public int getCantidadLajas() {
		return cantidadLajas;
	}
}
