package classiAstratte;

public class Materiale {

	private String etichetta;
	private double pesoSpecifico;
	
	public Materiale(String etichetta, double pesoSpecifico) {
		this.etichetta = etichetta;
		this.pesoSpecifico = pesoSpecifico;
	}

	public String getEtichetta() {
		return etichetta;
	}

	public double getPesoSpecifico() {
		return pesoSpecifico;
	}

	@Override
	public String toString() {
		return "Materiale: " 
				+ (etichetta != null ? etichetta + ", " : "") 
				+ "peso Specifico="	+ pesoSpecifico
				;
	}
	
	
	
	
}
