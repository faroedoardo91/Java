package model;

public abstract class Persona {
	
	private String nome, cognome;
	private float stipendio;	

	public Persona(String nome, String cognome, float stipendio) {
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
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

	public float getStipendio() {
		return stipendio;
	}

	public void setStipendio(float stipendio) {
		this.stipendio = stipendio;
	}
	
	public abstract float tredicesima();
	
	@Override
	public String toString() {
		return "[nome=" + nome +
				", cognome=" + cognome +
				", stipendio=" + stipendio +
				"]";
	}	 
}
