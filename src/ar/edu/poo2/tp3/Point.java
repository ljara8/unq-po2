package ar.edu.poo2.tp3;

public class Point {
	private int x = 0;
	private int y = 0;

	public Point() {
		this.setValues(x, y);
	}

	public Point(int x, int y) {
		this.setValues(x, y);
	}

	public void setValues(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x2) {
		this.x = x2;
	}

	public int getY() {
		return y;
	}

	public void setY(int y2) {
		this.y = y2;
	}

	public Point sumarPunto(Point punto2) {
		int x = this.getX() + punto2.getX();
		int y = this.getY() + punto2.getY();
		
		return new Point(x,y);
	}

}
