package ar.edu.poo2.tp7;

public enum Color {

	ROJO("Grave", 4), GRIS("Medio", 3), AMARILLO("Leve", 2), MIEL("Sano", 1);

	private String desc;
	private int gravedad;

	Color(String desc, int gr) {
		this.desc = desc;
		int gravedad = gr;

	}
//SIGUIENTE COLOR
	public Color proximoColorRotacion(Color color) {
		return Color.values()[(this.ordinal()+1) % (Color.values().length)];
	}

}
