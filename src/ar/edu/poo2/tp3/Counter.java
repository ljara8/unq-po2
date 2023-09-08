package ar.edu.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> numeros = new ArrayList<Integer>();

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void addNumber(int n) {
		numeros.add(n);
	}

//PUNTO 1
	public int getCantidadPares() {
		int cantidad = 0;
		for (Integer num : numeros) {
			if (num % 2 == 0) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public int getCantidadImpares() {
		int cantidad = 0;
		for (Integer num : numeros) {
			if (num % 2 != 0) {
				cantidad++;
			}
		}
		return cantidad;

	}

	public int getCantidadMultiplos(int n) {
		int cantidad = 0;
		for (Integer numero : numeros) {
			if (this.esMultiploDe(numero, n)) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public boolean esMultiploDe(int n, int y) {
		return n % y == 0;
	}

//PUNTO 2

	public List<Integer> desarmar(int n) {
		List<Integer> numbers = new ArrayList<Integer>();
		while (n > 0) {
			numbers.add(n % 10);
			n = n / 10;
		}
		return numbers;
	}

//PUNTO 3

	public int getMultiploMasAltoEntre(int x, int y) {
		for (int i = 1000; i >= 0; i--) {
			if (this.esMultiploDe(i, x) && this.esMultiploDe(i, y)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
}


