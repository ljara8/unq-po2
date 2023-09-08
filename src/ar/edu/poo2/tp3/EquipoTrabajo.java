package ar.edu.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoTrabajo {
	private String nombre;
	private List<Persona> empleados = new ArrayList<Persona>();

	public EquipoTrabajo(String nombre, List<Persona> empleados) {
		this.setEmpleados(empleados);
		this.setNombre(nombre);
	}

	public double getPromedioEdad() {
		double promedio = 0;
		for (Persona persona : empleados) {
			promedio = promedio + persona.getEdad();
		}
		return promedio / empleados.size();
	}
	
	public void agregarEmpleado(Persona empleado) {
		empleados.add(empleado);
	}

	public List<Persona> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Persona> empleados) {
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
