package classi;

public class Rettangolo 
{
	public double base, altezza;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double perimetro() 
	{
		double perimetro = 2 * (base + altezza);
		return perimetro;
		// return 2*(base+ altezza)
	}

	public double area()
	{
		double area = base * altezza;
		return area;
	}

	public double diagonale() 
	{
		double diagonale = Math.sqrt((base * base) + (altezza * altezza));
		return diagonale;
	}
	
	public String stampa()
	{
		return "base: "+base
				+ "\n altezza: " + altezza
				+ "\nperimetro: "+ perimetro()
			    + "\narea: " + area()
			    + "\ndiagonale: " + diagonale();
	}
	
	@Override
	public String toString()
	{
		return stampa();
	}
	
}
