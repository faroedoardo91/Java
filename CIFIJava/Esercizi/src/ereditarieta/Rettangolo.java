package ereditarieta;

public class Rettangolo extends Quadrilatero 
{
	public Rettangolo(double base, double altezza)
	{
		super(base,altezza,base,altezza);
	}
	
	public double area() 
	{
		return super.getLato1()*super.getLato2();
		
	}
	
	public double diagonale()
	{
		return Math.sqrt(Math.pow(getLato2(),2));
	}
	
	@Override
	public double perimetro()
	{
		return 2*(super.getLato1()+super.getLato2());
	}

	@Override
	public String toString() {
		return "Rettangolo [area()=" + area() + ", diagonale()=" + diagonale() + "]";
	}
	
	
}
