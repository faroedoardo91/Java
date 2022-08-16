package model;

public class ContoCorrente {

	private int numeroCC; 
	private int pin; 
	private double plafond; //(importo massimo prelevabile giornalmente) 
	private String datiIntestatario; 
	private double costoApertura; 
	private double totaleSpeseSostenuteMese; 
	private double speseGestione; 
	private int transazione;
			
	public ContoCorrente(int numeroCC, int pin, double plafond, String datiIntestatario, double costoApertura,
			double totaleSpeseSostenuteMese, double speseGestione, int transazione) {
		this.numeroCC = numeroCC;
		this.pin = pin;
		this.plafond = plafond;
		this.datiIntestatario = datiIntestatario;
		this.costoApertura = costoApertura;
		this.totaleSpeseSostenuteMese = totaleSpeseSostenuteMese;
		this.speseGestione = speseGestione;
		this.transazione = transazione;
	}
	
	public int getNumeroCC() {
		return numeroCC;
	}

	public void setNumeroCC(int numeroCC) {
		this.numeroCC = numeroCC;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

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

	@Override
	public String toString() {
		return "ContoCorrente [numeroCC=" 
	+ numeroCC + ", pin=" + pin 
	+ ", plafond=" + plafond 
	+ ", datiIntestatario="	+ datiIntestatario 
	+ ", costoApertura=" + costoApertura 
	+ ", totaleSpeseSostenuteMese=" + totaleSpeseSostenuteMese 
	+ ", speseGestione=" + speseGestione 
	+ ", transazione=" + transazione + "]";
		
	}	
}