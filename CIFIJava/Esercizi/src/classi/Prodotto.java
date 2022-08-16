package classi;

public class Prodotto {
	
	private double codice, prezzo, giacenza;
	
	private String nome, descrizione;
	

	public double getCodice() {
		return codice;
	}

	public void setCodice(double codice) {
		this.codice = codice;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getGiacenza() {
		return giacenza;
	}

	public void setGiacenza(double giacenza) {
		this.giacenza = giacenza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	

	@Override
	public String toString() {
		return "Prodotto [nome=" + nome + ", descrizione=" + descrizione + "]";
	}


	public Prodotto(double codice, double prezzo, double giacenza, String nome, String descrizione) {
		this.codice = codice;
		this.prezzo = prezzo;
		this.giacenza = giacenza;
		this.nome = nome;
		this.descrizione = descrizione;
	}
	
	
	
	
	
	
}
