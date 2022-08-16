package classiAstratte;
import enumeratori.Materiali;

public class CuboMateriale extends SolidoMateriale {
	private double lato;

	public CuboMateriale(double lato,Materiali materiale) {
		super(materiale);
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
				+ "lato=" + lato + ", " 
				+ (super.toString() != null ? super.toString() : "") 
				+ "]";
	}
}
