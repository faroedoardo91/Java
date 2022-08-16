package esercizio;

public class Autore {
	//nome, cognome, descrizione, email, sitoweb
	
	private String nome, cognome, descrizione, email, sitoWeb;
		
	public Autore(String nome, String cognome, String descrizione, String email, String sitoWeb) {
		this.nome = nome;
		this.cognome = cognome;
		this.descrizione = descrizione;
		this.email = email;
		this.sitoWeb = sitoWeb;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSitoWeb() {
		return sitoWeb;
	}

	public void setSitoWeb(String sitoWeb) {
		this.sitoWeb = sitoWeb;
	}

	@Override
	public String toString() {
		return "Autore: nome=" + nome 
				+ ", cognome=" + cognome 
				+ ", descrizione=" + descrizione 
				+ ", email=" + email
				+ ", sitoWeb=" + sitoWeb;
	}	
}
