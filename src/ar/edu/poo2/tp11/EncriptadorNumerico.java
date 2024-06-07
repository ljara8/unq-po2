package ar.edu.poo2.tp11;

public class EncriptadorNumerico implements EncriptadorState{

	@Override
	public String encriptar(String texto) {
		return this.traducirANumero (texto);
	}

	private String traducirANumero(String texto) {
		return null;
	}

	@Override
	public String desencriptar(String texto) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
