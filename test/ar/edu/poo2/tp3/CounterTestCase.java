package ar.edu.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;

	/**
	 * Crea un escenario de test básico, que consiste en un contador con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
//Se crea el contador
		counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(10);
		counter.addNumber(8);
		counter.addNumber(6);
		counter.addNumber(1);
		counter.addNumber(4);
	}

	/**
	 * Verifica la cantidad de pares
	 */
	@Test
	public void testEvenNumbers() {
// Getting the even occurrences
		int amount = counter.getCantidadPares();
// I check the amount is the expected one
		assertEquals(amount, 4);
	}
	
	
	@Test
	public void testNumerosImpares() {
		int cant = counter.getCantidadImpares();
		
		assertEquals(cant,6);
	}
	
	@Test
	public void testMultiplos() {
		int cant = counter.getCantidadMultiplos(2);
		
		assertEquals(4, cant);
	}
	
	@Test
	public void testMultiploMasAlto() {
		int cant = counter.getMultiploMasAltoEntre(3, 9);
		
		assertEquals(999, cant);
	}
	
	
}
