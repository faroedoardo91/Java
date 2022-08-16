package classiAstratte;
import enumeratori.Materiali;

public class SferaMateriale extends SolidoMateriale {

	private double raggio;

	public SferaMateriale(double raggio, Materiali materiale) {
		super(materiale);
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
		return "Sfera ["
				+ "raggio=" + raggio + ", " +
				(super.toString() != null ? super.toString() : "")
				+ "]";
	}
}
