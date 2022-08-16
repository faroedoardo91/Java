package classi;

public class Quadrato 
{

	//attributi - caratteristiche per configurare oggetti
	
	public double lato;
	
	//costruttori (costruire gli oggetti)
	
	//metodi - azioni rese disponibili grazie alla presenza degli attributi
	
	public double perimetro()
	{
		double p = lato * 4;
		return p;
	}
	
	public double area()
	{
		double a = lato*lato;
		return a;
	}
	
	public double diagonale()
	{
		double d = lato*Math.sqrt(2);
		return d;
	}

	@Override
	public String toString() {
		return "Quadrato [lato=" + lato + ", perimetro()=" + perimetro() + ", area()=" + area() + ", diagonale()="
				+ diagonale() + ", toString()=" + super.toString() + "]";
	}
	
	
}
