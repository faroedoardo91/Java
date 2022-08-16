package classiAstratte;

public class Cubo extends Solido {
	
	private double lato;

	public Cubo( double lato, double pesoSpecifico) {
		super(pesoSpecifico);
		this.lato = lato;
	}

	public double getLato() {
		return lato;
	}

	@Override
	public double volume() {		
		return Math.pow(lato, 3);
	}

	@Override
	public String toString() {
		return "Cubo ["
	+ "lato=" + lato + ","
				+ (super.toString() != null ? super.toString() : "")
 + "]";
 
	}
	
	

}
