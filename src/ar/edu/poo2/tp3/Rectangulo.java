package ar.edu.poo2.tp3;

public class Rectangulo {
	private Point esquinaInfIzq;
	private Point esquinaSupDer;

	public Rectangulo(Point esqInfIzq, Point esqSupDer) {
		this.setEsquinaInfIzq(esqInfIzq);
		this.setEsquinaSupDer(esqSupDer);

	}

	public int getAreaRectangulo() {
		return this.getAlto() * this.getAncho();
	}

	public int getPerimetroRectangulo() {
		return 2 * this.getSumaDelLadoInferior() + 2 * this.getSumaDelLadoSuperior();
	}

	public int getSumaDelLadoSuperior() {
		return this.getEsquinaInfIzq().getX() + this.getEsquinaSupDer().getX();
	}

	public int getSumaDelLadoInferior() {
		return this.getEsquinaInfIzq().getY() + this.getEsquinaSupDer().getY();
	}

	public int getAncho() {
		return this.getEsquinaInfIzq().getX() - this.getEsquinaSupDer().getX();
	}

	public int getAlto() {
		return this.getEsquinaInfIzq().getY() - this.getEsquinaSupDer().getY();
	}

	public Point getEsquinaSupDer() {
		return esquinaSupDer;
	}

	public void setEsquinaSupDer(Point esquinaSupDer) {
		this.esquinaSupDer = esquinaSupDer;
	}

	public Point getEsquinaInfIzq() {
		return esquinaInfIzq;
	}

	public void setEsquinaInfIzq(Point esquinaInfIzq) {
		this.esquinaInfIzq = esquinaInfIzq;
	}

}
