package ereditarieta;

public class Punto2D
{
	private String etichetta;
	private double x;
	private double y;

	// costruttori
	public Punto2D() {
	} // default

	public Punto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// overloading
	public Punto2D(String etichetta, double x, double y) {
		this.etichetta = etichetta;
		this.x = x;
		this.y = y;
	}

	public String getEtichetta() {
		return etichetta;
	}

	public void setEtichetta(String etichetta) {
		this.etichetta = etichetta;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// overloading
	public double distanza()
	// distanza dall'origine degli assi
	{
		// Punto o = new Punto(0,0);
		// return distanza(o);

		return distanza(new Punto2D());
	}

	public double distanza(Punto2D punto)
	// distanza tra due punti
	{
		return Math.sqrt(Math.pow(this.x - punto.x, 2) + Math.pow(this.y - punto.y, 2));
	}

	@Override
	public String toString() {
		return (etichetta != null ? etichetta : "") + "(" + x + "," + y + ")";
	}

}
