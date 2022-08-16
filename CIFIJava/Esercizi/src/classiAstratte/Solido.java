package classiAstratte;

public abstract class Solido {

	private double pesoSpecifico;

	public Solido(double pesoSpecifico) {
		this.pesoSpecifico = pesoSpecifico;
	}

	public double getPesoSpecifico() {
		return pesoSpecifico;
	}
	
	public double peso()
	{
		return pesoSpecifico*volume();
	}
		
		public abstract double volume();

		@Override
		public String toString() {
			return "[pesoSpecifico=" + pesoSpecifico 
					+ ", peso()="
					+ peso()
					+ ", volume()=" +
					volume() + "]";
		}

			
		
		
	}
