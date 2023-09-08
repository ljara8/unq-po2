package ar.edu.poo2.tp3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	private Persona persona;
	private Persona persona2;
	@BeforeEach
	void setUp() throws Exception {
		persona = new Persona("Lucio",LocalDate.of(2000, 5, 14));
		persona2 = new Persona ("Lautaro", LocalDate.of(1997, 6, 19));
	}

	@Test
	void testEdad() {
		int edad = persona.getEdad();
		
		assertEquals(23, edad);
		
	}
	
	@Test
	void testEsMenor() {
		assertTrue(persona.menorQue(persona2));
	}

}
