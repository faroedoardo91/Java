package esercizio;

public class Indirizzo {
	//via, cap, citt�, provincia
	
	private String via, citt�, provincia;
	
	private int cap;	
		
	public Indirizzo(String via, String citt�, String provincia, int cap) {
		this.via = via;
		this.citt� = citt�;
		this.provincia = provincia;
		this.cap = cap;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCitt�() {
		return citt�;
	}

	public void setCitt�(String citt�) {
		this.citt� = citt�;
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
				+ ", citt�=" + citt� 
				+ ", provincia=" + provincia 
				+ ", cap=" + cap 
				+ "]";
	}
	
	
	
	

}
