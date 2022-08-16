package polimorfismo;

public enum Ruolo {
CONTABILE(120.00),RISORSEUMANE(150.00),DIRETTORE(300.00);
	
	private double valore;
	
	Ruolo(double valore){
		this.valore=valore;
	}
	
	public double getValore() {
		return valore;
	}
}
