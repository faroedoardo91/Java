package ereditarieta; 

import java.time.LocalDate;

import classi.Persona;
import enumeratori.Sesso;

public class Studente extends Persona {

	private String corso;
		
	public Studente() {		
	}

	public Studente(String nome, String cognome, LocalDate dataNascita, String luogonascita, Sesso sesso) {
		super(nome, cognome, dataNascita, luogonascita, sesso);		
	}

	public Studente(String nome, String cognome, LocalDate dataNascita, String luogonascita) {
		super(nome, cognome, dataNascita, luogonascita);		
	}

	public Studente(String nome, String cognome) {
		super(nome, cognome);		
	}
	
	public Studente(String nome, String cognome, LocalDate dataNascita, String luogonascita, Sesso sesso,
			String corso) {
		super(nome, cognome, dataNascita, luogonascita, sesso);
		this.corso = corso;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	@Override
	public String toString() {
		return "" 
				+ (super.toString() != null ? super.toString() + ", " : "")
				+ (corso != null ? "corso=" + corso : "") 
				;
	}
	
	
}
