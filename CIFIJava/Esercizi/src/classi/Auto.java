package classi;

import enumeratori.Alimentazione;

public class Auto {

	/*
	 * Di un'auto si conoscono: marca, modello, cilindrata, alimentazione e il colore. 
	 * Si richiede la creazione di una classe che permetta di creare oggetti di tipo Auto 
	 * e che disponga del metodo velocitaMax, calcolata con la seguente formula empirica: 
	 * cilindrata/10 + bonus. Il bonus è dato dall'alimentazione dell'auto, 
	 * e quindi: benzina => bonus = 30, Diesel => bonus = 10, GPL => bonus = -10, Metano => bonus = -30.
	 * Creare un Test per testare oggetti di tipo Auto
	 */
	
	private String marca;
	private String modello;
	private int cilindrata;
	private Alimentazione alimentazione;
	private String colore;
	
	public Auto() {
	}

	public Auto(String marca, String modello, int cilindrata, Alimentazione alimentazione, String colore) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.alimentazione = alimentazione;
		this.colore = colore;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public Alimentazione getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(Alimentazione alimentazione) {
		this.alimentazione = alimentazione;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public int velocitaMax() {
		if(alimentazione == null)
			return -1;
		
		int v=cilindrata/10;
		
		switch(alimentazione) {
		case BENZINA: v+=30;break;
		case DIESEL: v+=10;break;
		case GPL: v-=10;break;
		case METANO: v-=30;break;
		default: v+=0;break;
		}
		
		return v;
		
	}

	@Override
	public String toString() {
		return "Auto ["
				+ (marca != null ? "marca=" + marca + ", " : "")
				+ (modello != null ? "modello=" + modello + ", " : "") 
				+ "cilindrata=" + cilindrata + ", "
				+ (alimentazione != null ? "alimentazione=" + alimentazione + ", " : "")
				+ (colore != null ? "colore=" + colore + ", " : "") 
				+ (velocitaMax()!=-1 ? "velocitaMax()=" + velocitaMax() : "") 
				+ "]"
				;
	} 
}
