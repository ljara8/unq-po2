package ar.edu.poo2.tp10;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements Personajes {
	private List<Personajes> personajes = new ArrayList<Personajes>();

	@Override
	public void caminar() {
		((Ejercito) this.getPersonajes()).caminar();
	}

	public List<Personajes> getPersonajes() {
		return personajes;
	}

}
