package ar.edu.poo2.tp3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	private Point punto;
	private Point punto2;

	@BeforeEach
	public void setUp() throws Exception {
		// Se crea el punto
		punto = new Point(3,2);

		punto2 = new Point(0,0);

	}

	@Test
	public void testGetX() {
		int x = punto.getX();
		
		assertEquals(3, x);
	}
	
	
	@Test
	void testMoverPunto() {
		punto2.setValues(3, 10);
		
		assertEquals(punto2.getX(),3);
		assertEquals(punto2.getY(),10);
	}
	
	@Test
	void testSumarPunto() {
		Point punto3 = punto.sumarPunto(punto2);
		
		assertEquals(punto3.getX(), 3);
		assertEquals(punto3.getY(), 2);
	}

}
