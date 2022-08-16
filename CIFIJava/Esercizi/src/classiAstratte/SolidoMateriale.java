package classiAstratte;

import enumeratori.Materiali;

public abstract class SolidoMateriale {
	
	private Materiali materiale;
	
	public SolidoMateriale(Materiali materiale) {
		this.materiale = materiale;
	}
	
	public Materiali getMateriale() {
		return materiale;
	}

	public double peso() {
		return materiale.getpesoSpecifico()*volume();
	}
	
	public abstract double volume();

	@Override
	public String toString() {
		return materiale.toString() 
				+ ", peso()=" + peso() 
				+ ", volume()=" + volume() 
				;
	}

}
