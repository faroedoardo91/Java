package enumeratori;

public enum Materiali {
ACCIAIO(7.85),ALLUMINIO(2.6),FERRO(7.85),QUARZO(2.5),
RAME(8.9),STAGNO(7.28),PIOMPO(11.34),TUNGSTENO(19.1),
CEMENTO(1.4),DIAMANTE(3.55);
	
	
private double pesoSpecifico;
	
	Materiali(double pesoSpecifico)
	{
		this.pesoSpecifico = pesoSpecifico;
	}
	
	public double getpesoSpecifico()
	{
		return pesoSpecifico;
	}
	
}
