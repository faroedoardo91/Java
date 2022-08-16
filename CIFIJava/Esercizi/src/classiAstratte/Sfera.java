package classiAstratte;

public class Sfera extends Solido {
	
	private double raggio;

	public Sfera(double raggio, double pesoSpecifico) {
		super(pesoSpecifico);
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	@Override
	public double volume() {
		return (4*Math.PI*Math.pow(raggio,3))/3;
	}

	@Override
	public String toString() {
		return "Sfera [raggio=" + raggio + "," +
	(super.toString() != null ? super.toString() : "")
	+ "]";
		
	}

	

	
	
	
	

}
