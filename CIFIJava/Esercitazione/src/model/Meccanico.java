package model;


public class Meccanico extends Persona {
	
	private settoreMeccanico settore;	

	public Meccanico(String nome, String cognome, float stipendio, settoreMeccanico settore) {
		super(nome, cognome, stipendio);
		this.settore = settore;
	}

	public settoreMeccanico getSettore() {
		return settore;
	}

	public void setSettore(settoreMeccanico settore) {
		this.settore = settore;
	}
	
	@Override
	public float tredicesima() {
		// TODO Auto-generated method stub
		return (float) (getStipendio() + (getStipendio()*0.9));
	}

	@Override
	public String toString() {
		return "Meccanico [settore=" + settore 
				+ ", " + super.toString()
				+ "]";
	}	
}
