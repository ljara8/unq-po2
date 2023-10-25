package ar.edu.poo2.tp10;

public class Soja implements Parcela {

	public Soja() {

	}

	@Override
	public double getGanancia(Parcela p) {
		return 500;
	}

	@Override
	public boolean esDeTipo(Parcela p) {
		return p == this;
	}

}
