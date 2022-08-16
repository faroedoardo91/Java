package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public final class Ordine {
	
	private String idOrdine;
	private ArrayList<ProdottoQuantita> listaProdotto = new ArrayList<ProdottoQuantita>();
	LocalDate data = LocalDate.now();
	Venditore venditore;
	
	public Ordine(String idOrdine, ArrayList<ProdottoQuantita> elencoProdotto, LocalDate data, Venditore venditore) {
		this.idOrdine = idOrdine;
		this.listaProdotto = elencoProdotto;
		this.data = data;
		this.venditore = venditore;
	}
	
	public String getIdOrdine() {
		return idOrdine;
	}
	public void setIdOrdine(String idOrdine) {
		this.idOrdine = idOrdine;
	}
	public ArrayList<ProdottoQuantita> getElencoProdotto() {
		return listaProdotto;
	}
	public void setElencoProdotto(ArrayList<ProdottoQuantita> elencoProdotto) {
		this.listaProdotto = elencoProdotto;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Venditore getVenditore() {
		return venditore;
	}
	public void setVenditore(Venditore venditore) {
		this.venditore = venditore;
	}
	
	public int nProdotti() {
				
		int num = 0;
		 for (int i = 0; i<listaProdotto.size();i++)
			 num+= listaProdotto.get(i).quantita;
			 return num; 
	}
	
	public float totale() {
		
		float somma = 0;		
		 for (int i = 0; i<listaProdotto.size();i++)
			 somma+= listaProdotto.get(i).prodotto.getPrezzo();
		 return somma;
	}
	
	@Override
	public String toString() {
		return "Ordine [idOrdine=" + idOrdine 
				+ ", elencoProdotto=" + listaProdotto 
				+ ", data=" + data 
				+ ", venditore=" + venditore
				+ "]";
	}
	
	public String scontrino() {
		String ciao = "Ordine [idOrdine=" + idOrdine 
				+ ", data=" + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"))
				+ ", dati Venditore=" + venditore + "\n";
		
		 for (int i = 0; i<listaProdotto.size();i++) {
			 ciao+= "Codice prodotto" + listaProdotto.get(i).prodotto.getCodice() +
					 "Nome prodotto" + listaProdotto.get(i).prodotto.getProdotto() +
					 "Quantita" + listaProdotto.get(i).quantita + 
					 "Prezzo unitario" + listaProdotto.get(i).prodotto.getPrezzo() +
					 "Subtotale" + listaProdotto.get(i).quantita * listaProdotto.get(i).prodotto.getPrezzo() +
					 "\n"
					 ;
		 }
		ciao += "totale " + totale();
		return ciao;
	}
	
}
