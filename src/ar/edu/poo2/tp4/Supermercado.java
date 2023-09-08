package ar.edu.poo2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private	String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList <Producto>();

	public Supermercado(String nomb, String direc) {
		this.setNombre(nomb);
		this.setDireccion(direc);
	}

	public Integer getCantidadDeProductos() {
		return productos.size();
	}

	public void agregarProducto(Producto prod) {
		productos.add(prod);
	}

	public Double getPrecioTotal() {
		double precio = 0;
		for (Producto producto : productos) {
			precio += producto.getPrecio();
		}
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
