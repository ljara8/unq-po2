package ar.edu.poo2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {
	private Trabajador trabajador;
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private IngresoHorasExtras ingreso3;
	private IngresoHorasExtras ingreso4;

	@BeforeEach
	void setUp() throws Exception {
		trabajador = new Trabajador();
		ingreso1 = new Ingreso("1", "2", 40);
		ingreso2 = new Ingreso("1", "2", 50);
		ingreso3 = new IngresoHorasExtras("1", "2", 40, 5);
		ingreso4 = new IngresoHorasExtras("1", "2", 40, 5);

		trabajador.guardarIngreso(ingreso1);
		trabajador.guardarIngreso(ingreso2);
		trabajador.guardarIngreso(ingreso3);
		trabajador.guardarIngreso(ingreso4);

	}

	@Test
	void testGetMontoTotal() {
		double cant = trabajador.getTotalPercibido();

		assertEquals(170, cant);
	}

	@Test
	void testMontoImponible() {
		double cant = trabajador.getMontoImponible();

		assertEquals(90, cant);
	}
	
	@Test
	void testGetImpuestoAPagar() {
		double cant = trabajador.getImpuestoAPagar();
		
		assertEquals(18, cant);
	}
	

}
