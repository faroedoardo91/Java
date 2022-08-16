package fileOggetti;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cerchio implements Serializable{
	
	//attributi
	private double raggio; //information hidding	
	
	//costruttori
	//public Cerchio() {} //versione di default
	
	//costruttore con passaggio di parametri
	public Cerchio(double raggio) {
		setRaggio(raggio);
	}	
	
	//metodi getters
	public double getRaggio() {
		return raggio;
	}
	
	//metodi setters
	public void setRaggio(double raggio) {
		if(raggio>0)			
			this.raggio=raggio;
	}
	
	//metodi
	public double diametro() {
		return raggio*2;
	}
	
	public double circonferenza() {
		return 2*Math.PI*raggio;
	}
	
	public double area() {
		return Math.PI*raggio*raggio;
	}
	
	//metodo consumer
	/*public void stampa() {
		System.out.println("Raggio: "+raggio);
		System.out.println("Diametro: "+diametro());
		System.out.println("Circonferenza: "+circonferenza());
		System.out.println("Area: "+area());		
	}*/
	
	public String stampa() {
		String msg = "Raggio: "+raggio;
		msg += "\nDiametro: "+diametro();
		msg += "\nCirconferenza: "+circonferenza();
		msg += "\nArea: "+area();
		
		return msg;
	}


	@Override
	public String toString() {
		return "Cerchio ["
				+ "raggio=" + raggio 
				+ ", diametro()=" + diametro() 
				+ ", circonferenza()=" + circonferenza()
				+ ", area()=" + area() 
				+ "]"
				;
	}
}
