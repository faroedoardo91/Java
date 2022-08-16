/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiquadrato;

/**
 *
 * @author faroe
 */
public class Quadrato {
   //attributi - caratteristiche per configurare gli oggetti
	private double lato; //accesso in modalità scrittura e lettura
	
	
	//costruttori

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }
	
        
        
	//metodi - azioni rese disponibili grazie alla presenza degli attributi
	public double perimetro() {
		double p = lato * 4;
		return p;
	}
	
	public double area() {
		double a = lato*lato;
		return a;
	}
	
	public double diagonale() {
		double d = lato*Math.sqrt(2);
		return d;
	}

	@Override
	public String toString() {
		return "Quadrato ["
				+ "lato=" + lato 
				+ ", perimetro()=" + perimetro() 
				+ ", area()=" + area() 
				+ ", diagonale()="+ diagonale() 
				+ "]"
				;
	} 
}
