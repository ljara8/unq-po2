package ar.edu.poo2.tp6;

public class SolicitudCreditoPersonal extends SolicitudCredito{

	@Override
	public boolean esAceptable() {
		Cliente solicitante = this.getSolicitante();
		return this.cumpleMinimo(solicitante) && this.cumpleCuota(solicitante);
	}

	private boolean cumpleMinimo(Cliente solicitante) {
		return solicitante.sueldoNetoAnual() > 15000;
	}

	@Override
	public boolean cumpleCuota(Cliente solicitante) {
		return this.montoMensual() > solicitante.porcentajeSueldoMensual(0.7);
	}

}
