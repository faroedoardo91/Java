package polimorfismo;

public class OperaioSpecializzato extends Operaio {

	private int numeroMissioni;
	private double indennitaMissione;
	
	public int getNumeroMissioni() {
		return numeroMissioni;
	}
	public void setNumeroMissioni(int numeroMissioni) {
		this.numeroMissioni = numeroMissioni;
	}
	public double getIndennitaMissione() {
		return indennitaMissione;
	}
	public void setIndennitaMissione(double indennitaMissione) {
		this.indennitaMissione = indennitaMissione;
	}
	@Override
	public double stipendio() {
		return super.stipendio()+indennitaMissione*numeroMissioni;
	}
	@Override
	public String toString() {
		return "OperaioSpecializzato [" + (super.toString() != null ? "toString()=" + super.toString() + ", " : "")
				+ "numeroMissioni=" + numeroMissioni + ", indennitaMissione=" + indennitaMissione + "]";
	}
}
