package ereditarieta;

public class Cerchio
{
	
	//attributi
		private double raggio; //information hidding	
		
		//costruttori
		public Cerchio() {} //versione di default
		
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
		
		@Override
		public String toString() {
			return ""
					+ "raggio=" + raggio 
					+ ", diametro()=" + diametro() 
					+ ", circonferenza()=" + circonferenza()
					+ ", area()=" + area() 
					;
		}
	
}
