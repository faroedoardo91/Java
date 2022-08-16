package esercizio;

public class Libro {
	// isbn, titolo, editore, autori, prezzo, numero pagine, anno pubblicazione
	
	private String editore, autori, isbn, titolo;
	private int numeroPagine, annoPubblicazione;
	private float prezzo;
	
	public Libro(String titolo, int annoPubblicazione, float prezzo, String editore, String autori, String isbn,
			int numeroPagine) {
		this.titolo = titolo;		
		this.annoPubblicazione = annoPubblicazione;
		this.prezzo = prezzo;
		this.editore = editore;
		this.autori = autori;
		this.isbn = isbn;
		this.numeroPagine = numeroPagine;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public String getAutori() {
		return autori;
	}

	public void setAutori(String autori) {
		this.autori = autori;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "editore=" + editore 
				+ ", autori=" + autori 
				+ ", isbn=" + isbn 
				+ ", titolo=" + titolo			
				+ ", numeroPagine=" + numeroPagine 
				+ ", annoPubblicazione=" + annoPubblicazione
				+ ", prezzo=" + prezzo;
	}


	
	
	}
