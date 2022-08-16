package ereditarieta;

public class Quadrato extends Rettangolo
{
	public Quadrato(double lato)
	{
		super(lato,lato);
	}

	@Override
	public String toString() {
		return "Quadrato [area()=" + area() + ", diagonale()=" + diagonale() + ", getLato1()=" + getLato1()
				+ ", perimetro()=" + perimetro() + "]";
	}
}
