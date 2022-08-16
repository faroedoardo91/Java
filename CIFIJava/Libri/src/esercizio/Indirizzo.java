package esercizio;

public class Indirizzo {
	//via, cap, città, provincia
	
	private String via, città, provincia;
	
	private int cap;	
		
	public Indirizzo(String via, String città, String provincia, int cap) {
		this.via = via;
		this.città = città;
		this.provincia = provincia;
		this.cap = cap;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	@Override
	public String toString() {
		return " [via=" + via 
				+ ", città=" + città 
				+ ", provincia=" + provincia 
				+ ", cap=" + cap 
				+ "]";
	}
	
	
	
	

}
