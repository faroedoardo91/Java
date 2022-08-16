package polimorfismo;

public enum Mansione {

INSTALLATORE(175.00),MANUTENTORE(225.00);
	
	private double valore;
	
	Mansione(double valore){
		this.valore=valore;
	}
	
	public double getValore() {
		return valore;
	}
}
