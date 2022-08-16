package collezioneDati;
import java.util.ArrayList;
import java.util.Random;

import ereditarieta.Quadrato;

public class ListaQuadrati {

	public static void main(String[] args) {
		// Lista di elementi Quadrato
		
		//classe per generare numeri random
		Random r = new Random();
		
		//creazione di una lista
		ArrayList<Quadrato> lista = new ArrayList<Quadrato>();
		
		int numero = r.nextInt(50);
		//caricamento di oggetti Quadrato con lato casuale
		for(int i=0;i<numero;i++)
			lista.add(new Quadrato(r.nextInt(20)));
		
		System.out.println("Elementi trovati: "+numero);
		//stampa dei valori ottenuti
		for(Object obj : lista)
			System.out.println(obj);
		
		System.out.println("Stampa dei quadrati con lato compreso nell'intervallo [5,10]");
		
		Quadrato q = null;
		for(Object obj : lista)
			if(obj instanceof Quadrato) {
				q = (Quadrato)obj;
				
				if(q.getLato1()>=5 && q.getLato1()<=10)
					System.out.println(q);
			}

	}
}
