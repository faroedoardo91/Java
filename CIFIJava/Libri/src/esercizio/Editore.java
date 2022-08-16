package esercizio;

import java.util.ArrayList;

public class Editore {
	//ragione sociale, indirizzo, email, telefono, sito web)
	
	private String ragioneSociale, email, sitoWeb, telefono;
	private Indirizzo indirizzo;
	ArrayList<Libro> elenco = new ArrayList<Libro>();
	
	public Editore(String ragioneSociale, String email, String sitoWeb, String telefono, Indirizzo indirizzo,
			ArrayList<Libro> elenco) {
		this.ragioneSociale = ragioneSociale;
		this.email = email;
		this.sitoWeb = sitoWeb;
		this.telefono = telefono;
		this.indirizzo = indirizzo;
		this.elenco = elenco;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public ArrayList<Libro> getElenco() {
		return elenco;
	}

	public void setElenco(ArrayList<Libro> elenco) {
		this.elenco = elenco;
	}

	@Override
	public String toString() {
		return "Editore [ragioneSociale=" + ragioneSociale 
				+ ", email=" + email
				+ ", sitoWeb=" + sitoWeb 
				+ ", telefono="	+ telefono 
				+ ", indirizzo=" + indirizzo			
				+ "]";
	}

	
		
	}
