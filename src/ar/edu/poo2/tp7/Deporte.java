package ar.edu.poo2.tp7;

public enum Deporte {

	RUNNING(1), FUTBOL(2), BASKET(2), TENNIS(3), JABALINA(4);

	private int complejidad;

	Deporte(int comple) {
		this.complejidad = comple;
	}

	public int getComplejidad() {
		return complejidad;
	}
	

}
