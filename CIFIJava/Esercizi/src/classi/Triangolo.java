package classi;

public class Triangolo
{
//attributi
	private double lato1;
	private double lato2;
	private double lato3;
	
		
	public Triangolo()
	{}
	
	//costruttore
	public Triangolo(double lato1, double lato2, double lato3)
	{
		if(lato1>0 && lato2>0 && lato3>0)
		{
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
		}
	}
	
	
	public Triangolo(Punto punto1, Punto punto2, Punto punto3)
	{
		this(punto1.distanza(punto2),punto2.distanza(punto3),punto3.distanza(punto1));
		this.lato1=punto1.distanza(punto2);
		this.lato1=punto2.distanza(punto3);
		this.lato1=punto3.distanza(punto1);
	}
	
	
	//getters
	public double getLato1()
	{
		return lato1;
	}
	
	public double getLato2()
	{
		return lato2;
	}
	
	public double getLato3()
	{
		return lato3;
	}
	
	//setters
	public void setLato1(double lato1)
	{
		this.lato1 = lato1;
	}
	
	public void setLato2(double lato2)
	{
		this.lato2 = lato2;
	}
	
	public void setLato3(double lato3)
	{
		this.lato3 = lato3;
	}
	
	public boolean isBuilding()
	{
		return lato1 + lato2>lato3 && lato2+lato3>lato1 && lato3+lato1>lato2;
	}
	
	//metodi
	public double perimetro()
	{
		return lato1 + lato2 + lato3;
	}
	
	public double area()
	{
		//formula di Erone
		
		double sp = perimetro()/2;
		
		return Math.sqrt(sp-lato1)*(sp-lato2)*(sp-lato3);
	}
	
	public String tipo()
	{
		if(lato1==lato2 && lato1==lato3)
			return "Equilatero";
		else if(lato1==lato2 && lato1==lato3 || lato2==lato3)
			return"Isoscele";
					
	return "Scaleno";
	}

	@Override
	public String toString() {
		return "Triangolo [lato1=" + lato1 
				+ ", lato2=" + lato2 
				+ ", lato3=" + lato3 
				+ ", isBuilding()=" + isBuilding()
				+ ", perimetro()=" + perimetro()
				+ ", area()="
				+ area() + ", tipo()=" + tipo() + "]";
	}
}
