package esercizio;

import java.util.ArrayList;
import java.util.Scanner;

public class TestLibri {

	public static void main(String[] args) {

		Indirizzo indirizzo = new Indirizzo("Via Java", "Torino", "To", 10100);

		Autore Edo = new Autore("Edo", "Faro", "Mi chiamo Edo", "edo@edo.it", "edo.it");

		Libro libro = new Libro("Titolo", 2000, 9.99f, "Casa Edo", "Edo", "1-111-111-111-111", 100);
		Libro libro1 = new Libro("Titolo1", 2001, 8.99f, "Casa Edo", "Edo", "2-222-222-222-222", 110);
		Libro libro2 = new Libro("Titolo2", 2002, 7.99f, "Casa Edo", "Edo", "3-333-333-333-333", 120);
		Libro libro3 = new Libro("Titolo3", 2003, 6.99f, "Casa Edo", "Edo", "4-444-444-444-444", 130);

		ArrayList<Libro> elenco = new ArrayList<Libro>();
		elenco.add(libro);
		elenco.add(libro1);
		elenco.add(libro2);
		elenco.add(libro3);

		Editore CasaEdo = new Editore("Io", "io@io.it", "io.it", "0118996085", indirizzo, elenco);

		System.out.println("Inserisci il nome del libro");
		
		Scanner s = new Scanner(System.in);
		while (s.hasNextLine()) {
	
			String ciao = s.nextLine().trim().toLowerCase();
			boolean trovato = false;

			for (int i = 0; i < elenco.size(); i++) {
				if (elenco.get(i).getTitolo().toLowerCase().equals(ciao)) {
					System.out.println(elenco.get(i) + "\n" + CasaEdo + "\n" + Edo);
					trovato = true;
					
					System.out.println("Inserisci il nome del libro");
				}
			}
			if (trovato == false)
				System.out.println("Libro non trovato");
		}
		s.close();
	}
}
