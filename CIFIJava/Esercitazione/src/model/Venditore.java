package model;

public class Venditore extends Persona {

	private settoreVenditore settore;	
	
	private float tariffaGiornaliera; 	
	
	public Venditore(String nome, String cognome, float stipendio, settoreVenditore settore, float tariffaGiornaliera) {
		super(nome, cognome, stipendio);
		this.settore = settore;
		this.tariffaGiornaliera = tariffaGiornaliera;
	}

	public float getTariffaGiornaliera() {
		return tariffaGiornaliera;
	}

	public void setTariffaGiornaliera(float tariffaGiornaliera) {
		this.tariffaGiornaliera = tariffaGiornaliera;
	}
	public settoreVenditore getSettore() {
		return settore;
	}

	public void setSettore(settoreVenditore settore) {
		this.settore = settore;
	}	

	@Override
	public float tredicesima() {		
		return (float) (getStipendio() + (getStipendio()*0.92));
	}

	@Override
	public String toString() {
		return "Venditore [settore=" + settore 
				+ ", tariffaGiornaliera=" + tariffaGiornaliera +
				"]";
	}				
}
