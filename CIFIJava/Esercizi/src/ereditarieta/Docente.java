package ereditarieta;

import java.time.LocalDate;

import enumeratori.Sesso;

public class Docente extends Studente {

	private String materia;
	
	public Docente() {
		// TODO Auto-generated constructor stub
	}

	public Docente(String nome, String cognome, LocalDate dataNascita, String luogonascita, Sesso sesso) {
		super(nome, cognome, dataNascita, luogonascita, sesso);
		// TODO Auto-generated constructor stub
	}

	public Docente(String nome, String cognome, LocalDate dataNascita, String luogonascita) {
		super(nome, cognome, dataNascita, luogonascita);
		// TODO Auto-generated constructor stub
	}

	public Docente(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	public Docente(String nome, String cognome, LocalDate dataNascita, String luogonascita, Sesso sesso, String corso) {
		super(nome, cognome, dataNascita, luogonascita, sesso, corso);
		// TODO Auto-generated constructor stub
	}

	public Docente(String nome, String cognome, LocalDate dataNascita, String luogonascita, Sesso sesso, String corso,
			String materia) {
		super(nome, cognome, dataNascita, luogonascita, sesso, corso);
		this.materia = materia;
	}	
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "" 
				+ (super.toString() != null ? super.toString() + ", " : "")
				+ (materia != null ? "materia=" + materia : "")
				;
	}
}
