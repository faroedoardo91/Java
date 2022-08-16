package model;

import java.util.ArrayList;

public class CapoOfficina extends Meccanico {
	
	private ArrayList<Ordine> elencoOrdini = new ArrayList<Ordine>();

	public CapoOfficina(String nome, String cognome, float stipendio, settoreMeccanico settore,
			ArrayList<Ordine> elencoOrdini) {
		super(nome, cognome, stipendio, settore);
		this.elencoOrdini = elencoOrdini;
	}

	public ArrayList<Ordine> getElencoOrdini() {
		return elencoOrdini;
	}

	public void setElencoOrdini(ArrayList<Ordine> elencoOrdini) {
		this.elencoOrdini = elencoOrdini;
	}

	public void aggiungiOrdine(Ordine ordine) {
		
		elencoOrdini.add(ordine);
	}

	public int nOrdini() {
		return elencoOrdini.size();		
	}
	
	public float tredicesima() {
		
		float bonus = 0;
		 for (int i = 0; i<elencoOrdini.size();i++)
			 bonus+= elencoOrdini.get(i).totale() * 0.05;		 
		return (float) (getStipendio() + (getStipendio() * 2) + bonus);
	}

	@Override
	public String toString() {
		return "CapoOfficina [elencoOrdini=" + elencoOrdini + ", toString()=" + super.toString() + "]";
	}
	
	
}
