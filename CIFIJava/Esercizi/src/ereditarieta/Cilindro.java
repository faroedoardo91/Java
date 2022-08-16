package ereditarieta;

public class Cilindro extends Cerchio {
	/*
	 * la classe eredita da Cerchio. 
	 * Del cilindro si vuole conoscere il volume, la superficie laterale, la superficie totale
	 */
	
	private double altezza;

	public Cilindro() {
	}

	public Cilindro(double raggio, double altezza) {
		super(raggio);
		this.altezza = altezza;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public double superficieBase() {
		return area();
	}
	
	public double superficieLaterale() {
		return circonferenza()*altezza;		
	}
	
	public double superficieTotale() {
		return 2*superficieBase()+superficieLaterale();
	}
	
	public double volume() {
		return superficieBase()*altezza;
	}

	@Override
	public String toString() {
		return ""
				+ "raggio=" + getRaggio() + ", altezza=" + altezza 
				+ ", superficieBase()="	+ superficieBase() 
				+ ", superficieLaterale()=" + superficieLaterale() 
				+ ", superficieTotale()="+ superficieTotale() 
				+ ", volume()=" + volume() 
				;
	}
	
	
}
