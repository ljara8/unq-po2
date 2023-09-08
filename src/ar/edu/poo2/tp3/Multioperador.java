package ar.edu.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	private List<Integer> numeros = new ArrayList<Integer>();

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void addNumber(int n) {
		numeros.add(n);
	}

	public int getSumaDeNumeros() {
		int resultado = 0;
		for(int i = 0; i < numeros.size(); i++ ) {
			resultado += numeros.get(i);
		}
		return resultado;
	}
	
	public int getRestaDeNumeros() {
		int resultado = 0;
		for (int i = 0; i < numeros.size(); i++) {
			resultado -= numeros.get(i);
		}
		return resultado;
	}
	
	public int getMultiplicacionDeNumeros() {
		int resultado = 1;
		for (int i = 0; i < numeros.size(); i++) {
			resultado = resultado * numeros.get(i);
		}
		return resultado;
	}
}
