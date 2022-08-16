package model;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {		
		
		ArrayList<Venditore> elencoV = new ArrayList<Venditore>();
		elencoV.add(new Venditore("Marco", "Pollice", 1100, settoreVenditore.ALIMENTARI, 2));
		elencoV.add(new Venditore("Marco", "Pollice", 1200, settoreVenditore.ORTOFRUTTA, 3));
		elencoV.add(new Venditore("Marco", "Pollice", 1300, settoreVenditore.CARROZZERIA, 4));
		elencoV.add(new Venditore("Marco", "Pollice", 1400, settoreVenditore.SEXYSHOP, 2));
		elencoV.add(new Venditore("Filippo", "Aurelio", 1500, settoreVenditore.FARMACIA, 1));
		elencoV.add(new Venditore("Marco", "Pollice", 1600, settoreVenditore.ELETTRONICA, 3));
		
		ArrayList<Meccanico> elencoM = new ArrayList<Meccanico>();
		elencoM.add(new Meccanico("Edoardo", "Mignolo", 1800, settoreMeccanico.Carrozzeria));
		elencoM.add(new Meccanico("Edoardo", "Mignolo", 1900, settoreMeccanico.Carrozzeria));
		elencoM.add(new Meccanico("Edoardo", "Mignolo", 1100, settoreMeccanico.Carrozzeria));
		elencoM.add(new Meccanico("Marco", "Mignolo", 1100, settoreMeccanico.Meccanica));
		elencoM.add(new Meccanico("Marco", "Mignolo", 1100, settoreMeccanico.Meccanica));
		elencoM.add(new Meccanico("Edoardo", "Mignolo", 1100, settoreMeccanico.Carrozzeria));
				
		ResponsabileVenditori elencoRV = new ResponsabileVenditori("Matteo", "Cavolo", 2000, null, 15, elencoV);				
					
		ArrayList<Ordine> o = new ArrayList<Ordine>();
		o.add(new Ordine("12345a", null, null, elencoRV));
		o.add(new Ordine("12345b", null, null, elencoRV));
		o.add(new Ordine("12345c", null, null, elencoRV));
		o.add(new Ordine("12345d", null, null, elencoRV));		
		o.add(new Ordine("12345e", null, null, elencoRV));
		
		CapoOfficina datiCO = new CapoOfficina("Mirco", "Ciao", 2100, null, o);	
		
		System.out.println(elencoV);
		System.out.println(elencoM);
		System.out.println(elencoRV);
		System.out.println(datiCO);	
		System.out.println(o);
		
		System.out.println();		
	}

}
