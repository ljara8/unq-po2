package ar.edu.poo2.tp10;

public class Caballero implements Personajes {
	private int cantidadPasosADar;

	@Override
	public void caminar() {
		if (cantidadPasosADar > 0) {
			cantidadPasosADar = cantidadPasosADar - 1;
		}
	}

}
