package model;

import java.util.ArrayList;

public class ResponsabileVenditori extends Venditore {

	private ArrayList<Venditore> elencoVenditori = new ArrayList<Venditore>();

	public ResponsabileVenditori(String nome, String cognome, float stipendio, settoreVenditore settore,
			float tariffaGiornaliera, ArrayList<Venditore> elencoVenditori) {
		super(nome, cognome, stipendio, settore, tariffaGiornaliera);
		this.elencoVenditori = elencoVenditori;
	}

	public ArrayList<Venditore> getElencoVenditori() {
		return elencoVenditori;
	}

	public void setElencoVenditori(ArrayList<Venditore> elencoVenditori) {
		this.elencoVenditori = elencoVenditori;
	}

	@Override
	public String toString() {
		return "ResponsabileVenditori [elencoVenditori=" + elencoVenditori + "]";
	}

	public void aggiungiVenditore(Venditore venditore) {

		elencoVenditori.add(venditore);
	}

	public Venditore restituisciVenditore(int index) {
				
		try {
			return elencoVenditori.get(index);
		}catch (Exception e) {
			System.out.println("Indice sbagliato");
		}
		return null;		
	}

	public void cancellaVenditore(int index) {
		
		elencoVenditori.remove(index);		
		
		try {
			elencoVenditori.remove(index);
		}catch (Exception e) {
			System.out.println("Indice sbagliato");
		}
	}
	
	public float tredicesima() {

		float bonus = 0;
		 for (int i = 0; i<elencoVenditori.size();i++)
			 bonus+= restituisciVenditore(i).getTariffaGiornaliera() * 0.15;		 
		return (float) (getStipendio() + (getStipendio() * 2) + bonus);
	}

}
