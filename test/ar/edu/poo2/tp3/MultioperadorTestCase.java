package ar.edu.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	private Multioperador multi;


	@BeforeEach
	public void setUp() throws Exception {
//Se crea el contador
		multi = new Multioperador();
//Se agregan los numeros. Un solo par y nueve impares
		multi.addNumber(1);
		multi.addNumber(3);
		multi.addNumber(5);
		multi.addNumber(7);
		multi.addNumber(9);
		multi.addNumber(10);
		multi.addNumber(8);
		multi.addNumber(6);
		multi.addNumber(1);
		multi.addNumber(4);
	}

	@Test
	void testSumarNumeros() {
		int cant = multi.getSumaDeNumeros();
		
		assertEquals(54, cant);
	}
	
	@Test
	void testRestarNumeros() {
		int cant = multi.getRestaDeNumeros();
		
		assertEquals(-54, cant);
	}
	
	@Test
	void testMultiplicarNumeros() {
		int cant = multi.getMultiplicacionDeNumeros();
		
		assertEquals(1814400, cant);
	}

}
