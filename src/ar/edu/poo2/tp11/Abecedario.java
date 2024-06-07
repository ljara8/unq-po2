package ar.edu.poo2.tp11;

public enum Abecedario {



	A(1, true) {

	@Override
	public Abecedario siguienteVocal(Abecedario a) {
		return E;
	}

	},B(2,false),C(3,false),D(4,false),E(5,true){

	@Override
		public Abecedario siguienteVocal(Abecedario e) {
			return I;
		}

	},F(6,false),G(7,false),H(8,false),I(9,true){

	@Override
		public Abecedario siguienteVocal(Abecedario e) {
			return O;
		}

	},J(10,false),K(11,false),L(12,false),M(13,false),N(14,false),Ñ(15,false),O(16,true){

	@Override
		public Abecedario siguienteVocal(Abecedario e) {
			return U;
		}

	},P(17,false),Q(18,false),R(19,false),S(20,false),T(21,false),U(22,true){

	@Override
		public Abecedario siguienteVocal(Abecedario e) {
			return A;
		}

	},V(23,false),W(24,false),X(25,false),Y(26,false),Z(27,false);
	
	private int numero;
	private boolean esVocal;
	
	public Abecedario siguienteVocal(Abecedario vocal) {
		return vocal.siguienteVocal(A);
	}

	Abecedario(int numero, boolean esVocal) {
		this.numero = numero;
		this.esVocal = esVocal;
	}

}
