package ar.edu.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoTrabajoTestCase {
	private EquipoTrabajo equipo;
	private Persona persona1;
	private Persona persona2;
	private Persona persona3;
	private Persona persona4;
	private Persona persona5;
	private List<Persona> empleados = new ArrayList<Persona>(); 

	@BeforeEach
	void setUp() throws Exception {
		equipo = new EquipoTrabajo("Scaloneta",empleados);
		persona1 = new Persona("Lucio",LocalDate.of(2000, 5, 14));
		persona2 = new Persona("Lucio",LocalDate.of(1999, 5, 14));
		persona3 = new Persona("Lucio",LocalDate.of(2001, 5, 14));
		persona4 = new Persona("Lucio",LocalDate.of(1998, 5, 14));
		persona5 = new Persona("Lucio",LocalDate.of(1997, 5, 14));
		
		equipo.agregarEmpleado(persona1);
		equipo.agregarEmpleado(persona2);
		equipo.agregarEmpleado(persona3);
		equipo.agregarEmpleado(persona4);
		equipo.agregarEmpleado(persona5);

	}

	@Test
	void testPromedioEdad() {
		double cant = equipo.getPromedioEdad();
		assertEquals(24, cant);
	}
	
	@Test
	void testNombre() {
		assertEquals("Scaloneta", equipo.getNombre());
	}

}
