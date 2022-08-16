package model;

public class Carta {

	private Valore valore;
	private Seme seme;
	
	public Carta(Valore valore, Seme seme) {
		this.valore = valore;
		this.seme = seme;
	}

	public Valore getValore() {
		return valore;
	}

	public void setValore(Valore valore) {
		this.valore = valore;
	}

	public Seme getSeme() {
		return seme;
	}

	public void setSeme(Seme seme) {
		this.seme = seme;
	}

	@Override
	public String toString() {
		return valore + " di "+seme; //ASSO di BASTONI
	}
	
	
}
