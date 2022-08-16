package classi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import enumeratori.Sesso;

public class Persona {

	/*
	 * Creare una classe per rappresentare una Persona di cui sono noti: 
	 * nome, cognome, data di nascita, luogo di nascita, sesso e si vuole sapere qual è la sua età. 
	 * 
	 * La classe permette di creare gli oggetti in differenti modi: 
	 * senza passaggio di parametri, 
	 * con nome e cognome, 
	 * con nome, cognome, data di nascita e luogo di nascita, 
	 * oppure con tutti i parametri. 
	 * 
	 * E' prevista la stampa della configurazione degli oggetti tramite il metodo toString()
	 * */
	
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private String luogonascita;
	private Sesso sesso;
	
	public Persona() {
	}

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public Persona(String nome, String cognome, LocalDate dataNascita, String luogonascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogonascita = luogonascita;
	}

	public Persona(String nome, String cognome, LocalDate dataNascita, String luogonascita, Sesso sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogonascita = luogonascita;
		this.sesso = sesso;
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

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogonascita() {
		return luogonascita;
	}

	public void setLuogonascita(String luogonascita) {
		this.luogonascita = luogonascita;
	}

	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}
	
	public int eta() {
		
		if(dataNascita==null)
			return -1;
		
		LocalDate oggi = LocalDate.now();
		
		int e = oggi.getYear() - dataNascita.getYear();
		
		//dataNascita = 21/02/1999
		if(oggi.getMonthValue() < dataNascita.getMonthValue())
			e--;
		else if(oggi.getMonth()==dataNascita.getMonth() && oggi.getDayOfMonth()<dataNascita.getDayOfMonth())
			e--;
		
		return e;
		
	}

	@Override
	public String toString() {
		return "Persona [" 
				+ (nome != null ? "nome=" + nome + ", " : "")
				+ (cognome != null ? "cognome=" + cognome + ", " : "")
				+ (dataNascita != null ? "dataNascita=" + dataNascita.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", " : "")
				+ (luogonascita != null ? "luogonascita=" + luogonascita + ", " : "")
				+ (sesso != null ? "sesso=" + sesso + ", " : "") 
				+ (dataNascita!=null ? ", eta()=" + eta() : "")
				+ "]";
	}
	
}
