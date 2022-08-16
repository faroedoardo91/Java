package hashMap;

import java.util.HashMap;

public class hashMap2 {

	public static void main(String[] args) {
		HashMap<String,String> hmap = new HashMap<String, String>();
		hmap.put("Edo","F");
		hmap.put("Edo","F1");
		hmap.put("Edo","F2");
		hmap.put("Edo","F3");
		hmap.put("Edo","F4");
		
		for(String nome: hmap.keySet()) { //per tutte le stringhe che sono in nome hmpa keyset vado a controllare se il nome è uguale alla stringa Edo faccio qualcosa
			if(nome.equals("Edo")) {
				System.out.println("Il nome è nell'elenco");
			}
		}

	}

}
