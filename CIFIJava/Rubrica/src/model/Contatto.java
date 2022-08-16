package model;

public class Contatto {
	
	private String cognome,nome,indirizzo,telefono,email;

	public Contatto(String cognome, String nome) {		
		this.cognome = cognome;
		this.nome = nome;
	}
	
	public Contatto(String cognome, String nome, String indirizzo, String telefono, String email) {
		
		this.cognome = cognome;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.email = email;
	}	

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contatto: " + cognome +
				" - " + nome +
				" - " + indirizzo +
				" - " + telefono 
				+ " - " + email;
	}
	
	
	
	


}
