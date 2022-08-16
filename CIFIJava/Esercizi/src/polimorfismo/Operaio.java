package polimorfismo;

public class Operaio extends Dipendente {

	private Mansione mansione;

	public Mansione getMansione() {
		return mansione;
	}

	public void setMansione(Mansione mansione) {
		this.mansione = mansione;
	}

	@Override
	public double stipendio() {
		return getPagaOraria()*getOreLavorate()+mansione.getValore();
	}

	@Override
	public String toString() {
		return "Operaio [" + (super.toString() != null ? super.toString() + ", " : "")
				+ (mansione != null ? "mansione=" + mansione : "") + "]";
	}
}
