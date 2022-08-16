package polimorfismo;

public class Amministrativo extends Dipendente {

	private Ruolo ruolo;
	
	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	@Override
	public double stipendio() {
		return getPagaOraria()*getOreLavorate() + ruolo.getValore();
	}

	@Override
	public String toString() {
		return "Amministrativo [" + (super.toString() != null ? super.toString() + ", " : "")
				+ (ruolo != null ? "ruolo=" + ruolo : "") + "]";
	}
}
