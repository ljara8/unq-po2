package ar.edu.poo2.tp11;

public class EncriptadorNaive {
	private EncriptadorState encriptador;
	
	public EncriptadorNaive (EncriptadorState enc) {
		this.encriptador = enc;
	}

	public String encriptar(String texto) {
		return encriptador.encriptar(texto);
	}

	public String desencriptar(String texto) {
		return encriptador.desencriptar(texto);
	}

	public EncriptadorState getEncriptador() {
		return encriptador;
	}
	
	public void setEncriptador(EncriptadorState enc) {
		this.encriptador = enc;
	}

}
