package model;

public class Prodotto {
	
	private String codice, prodotto, descrizione;
	private float prezzo;
	
	public Prodotto(String codice, String prodotto, String descrizione, float prezzo) {
		this.codice = codice;
		this.prodotto = prodotto;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getProdotto() {
		return prodotto;
	}

	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Prodotto [codice=" + codice +
				", prodotto=" + prodotto +
				", descrizione=" + descrizione +
				", prezzo="	+ prezzo +
				"]";
	}
	
	
	
	

}
