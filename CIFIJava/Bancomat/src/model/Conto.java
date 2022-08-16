package model;

public class Conto {
	
private double contante;
	
	public Conto() {
	}

	public Conto(double contante) {
		this.contante = contante;
	}
	
	public double saldo() {
		return contante;
	}
	
	public void versa(double somma) {
		
		if(somma <0)
			somma = 0;
		
		contante += somma;
	}
	
	public void preleva(double somma) throws Exception {
		
		if(contante<somma)
			throw new Exception("Somma richiesta non disponibile");
		contante -= somma;
	}

	@Override
	public String toString() {
		return "ContoCorrente [contante=" + contante + "]";
	}
		
}
