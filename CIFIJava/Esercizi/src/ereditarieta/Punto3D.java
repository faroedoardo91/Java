package ereditarieta;

public class Punto3D extends Punto2D {

	private double z;
	
	public Punto3D() {
	}

	public Punto3D(double z) {
		super();
		this.z = z;
	}
	
	public Punto3D(String etichetta, double x, double y, double z) {
		super(etichetta,x,y);
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	@Override
	public double distanza()
	{
		return super.distanza(new Punto2D());
	}
	
	public double distanza(Punto3D punto)
	{
		return Math.sqrt(Math.pow(this.getX()- punto.getX(),2)
				+ Math.pow(this.getY()-punto.getY(),2)
				+ Math.pow(this.getZ()-punto.getZ(),2));
	}
	
	@Override
	public String toString()
	{
		return (super.getEtichetta() != null ? super.getEtichetta() : "")
				+ "("
				+ super.getX() 
				+ "," 
				+ super.getY() 
				+ "," 
				+ this.getZ() 
				+ ")";
	}
	
	
}
