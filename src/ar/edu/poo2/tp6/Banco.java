package ar.edu.poo2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudCredito> creditos = new ArrayList<SolicitudCredito>();

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void registrarSolicitud(SolicitudCredito credito) {
		creditos.add(credito);
	}

	public int contarYValidar() {
		int contador = 0;
		for (int i = 0; i < creditos.size(); i++) {
			contador += this.evaluarSolicitud(creditos.get(i));
		}
		return contador;
	}

	private double evaluarSolicitud(SolicitudCredito solicitud) {
		if (solicitud.esAceptable()) {
			solicitud.getSolicitante().cobrar(solicitud.montoMensual());
			return solicitud.getMontoSolicitado();
		} else {
			return 0;
		}
	}

}
