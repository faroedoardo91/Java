package eccezioni;

public class Quadrato {
	//attributi - caratteristiche per configurare gli oggetti
		private double lato; //accesso in modalità scrittura e lettura
		
		
		//costruttori
		
		
		public double getLato() {
			return lato;
		}

		public void setLato(double lato) throws Exception {
			if(lato<=0)
				throw new Exception("Il quadrato non può avere il lato negativo o nullo");
			
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
