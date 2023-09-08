package ar.edu.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	private Rectangulo rectan;
	@BeforeEach
	void setUp() throws Exception {
		Point esqInfIzq = new Point(0,0);
		Point esqSupDer = new Point(3,2);
		
		
		rectan.setEsquinaInfIzq(esqInfIzq);
		rectan.setEsquinaSupDer(esqSupDer);
	}

	@Test
	void testPerimetro() {
		
		
		int cant = rectan.getPerimetroRectangulo();
		
		assertEquals(cant,3);
	}

}
