package ar.edu.poo2.tp6;

public abstract class SolicitudCredito {
	private Cliente solicitante;
	private double montoSolicitado;
	private int plazo;

	public Cliente getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Cliente solicitante) {
		this.solicitante = solicitante;
	}

	public abstract boolean esAceptable();

	public abstract boolean cumpleCuota(Cliente solicitante);

	public double montoMensual() {
		return this.getMontoSolicitado() / plazo;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

}
