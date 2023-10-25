package ar.edu.poo2.tp10;

public class Trigo implements Parcela {

	public Trigo() {

	}


	@Override
	public double getGanancia(Parcela p) {
		return 300;
	}
	
	public boolean esDeTipo(Parcela p) {
		return p == this;
	}

}
