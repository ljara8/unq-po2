package ar.edu.poo2.tp9;

public class Planta extends Empleado{
	private int sueldoBasico;
	private int cantidadHijos;

	public Planta(String n, int c, int sb, int chijos) {
		super(n, c);
		this.sueldoBasico = sb;
		this.cantidadHijos = chijos;
	}

	@Override
	public double getSueldoBruto() {
		return this.getSueldoBasico() + this.getBonoPaternidad();
	}
	
	public int getBonoPaternidad() {
		return this.cantidadHijos * 150;
	}
	
	public int getSueldoBasico() {
		return sueldoBasico;
	}

}
