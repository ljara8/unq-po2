package ar.edu.poo2.tp11;

public class EncriptadorVocal implements EncriptadorState {

	@Override
	public String encriptar(String texto) {
		return "a2";
	}

	@Override
	public String desencriptar(String texto) {
		return null;
	}

}
