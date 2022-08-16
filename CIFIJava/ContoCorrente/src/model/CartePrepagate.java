package model;

public class CartePrepagate {

	private double plafond; //(importo massimo prelevabile giornalmente) 
	private String datiIntestatario, numeroDellaCarta; 
	private double costoApertura; 
	private double totaleSpeseSostenuteMese; 
	private double speseGestione; 
	private int transazione,pin;
	

	public CartePrepagate() {}
	

	public double getPlafond() {
		return plafond;
	}

	public void setPlafond(double plafond) {
		this.plafond = plafond;
	}

	public String getDatiIntestatario() {
		return datiIntestatario;
	}

	public void setDatiIntestatario(String datiIntestatario) {
		this.datiIntestatario = datiIntestatario;
	}

	public String getNumeroDellaCarta() {
		return numeroDellaCarta;
	}

	public void setNumeroDellaCarta(String numeroDellaCarta) {
		this.numeroDellaCarta = numeroDellaCarta;
	}

	public double getCostoApertura() {
		return costoApertura;
	}

	public void setCostoApertura(double costoApertura) {
		this.costoApertura = costoApertura;
	}

	public double getTotaleSpeseSostenuteMese() {
		return totaleSpeseSostenuteMese;
	}

	public void setTotaleSpeseSostenuteMese(double totaleSpeseSostenuteMese) {
		this.totaleSpeseSostenuteMese = totaleSpeseSostenuteMese;
	}

	public double getSpeseGestione() {
		return speseGestione;
	}

	public void setSpeseGestione(double speseGestione) {
		this.speseGestione = speseGestione;
	}

	public int getTransazione() {
		return transazione;
	}

	public void setTransazione(int transazione) {
		this.transazione = transazione;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "CartePrepagate [plafond=" + plafond 
				+ ", datiIntestatario=" + datiIntestatario 
				+ ", numeroDellaCarta="	+ numeroDellaCarta 
				+ ", costoApertura=" + costoApertura 
				+ ", totaleSpeseSostenuteMese="	+ totaleSpeseSostenuteMese
				+ ", speseGestione=" + speseGestione
				+ ", transazione=" + transazione
				+ ", pin=" + pin +
				"]";
	}
	
	
	
}
