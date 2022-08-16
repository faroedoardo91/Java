package collezioneDati;

import java.util.ArrayList;

import ereditarieta.Quadrato;

import classi.Cerchio;
import classi.Triangolo;

public class ListeDati {

	public static void main(String[] args) {
		// ArrayList
		
		//dichiarazione di una lista
		ArrayList<Object> lista = new ArrayList<Object>();
		
		System.out.println("Dimensione: "+lista.size());
		
		Quadrato q = new Quadrato(3.75);
		//caricamento dei dati
		lista.add(12);
		lista.add(12.75);
		lista.add("casa");
		lista.add(false);
		lista.add(q);
		
		System.out.println("Dimensione: "+lista.size());
		
		//lettura dei dati
		System.out.println("Elemento in posizione 3: "+lista.get(3));
		
		for(Object obj : lista)
			System.out.println(obj);
		
		//aggiunta di un elemento ad una certa posizione
		lista.add(3, new Triangolo(3,4,5));
		
		for(int i=0;i<lista.size();i++)
			System.out.println("Elemento in posizione "+i+": "+lista.get(i));
		
		//sostituzione di un elemento ad una certa posizione
		lista.set(4, new Cerchio(4));
		
		for(int i=0;i<lista.size();i++)
			System.out.println("Elemento in posizione "+i+": "+lista.get(i));
		
		int index = lista.indexOf(q);
		if(index >=0)
			System.out.println("Oggetto quadrato trovato in posizione: "+index);
		else
			System.out.println("Elemento non trovato");
		
		
		//eliminazione di un elemento
	//	Object obj1 = lista.remove(index);
		
		if(lista.remove(q))
			System.out.println("Oggetto rimosso");
		else
			System.out.println("Oggetto non rimosso");
		
				
		//eliminazione di tutti gli oggetti
		lista.clear();
		System.out.println("Lista svuotata");
		
		
	}
	
	
}