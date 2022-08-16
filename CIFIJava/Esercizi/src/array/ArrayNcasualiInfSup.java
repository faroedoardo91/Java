package array;

import java.util.Scanner;

public class ArrayNcasualiInfSup {

	public static void main(String[] args) {
		// Dati in input il numero di elementi da memorizzare in un array con numeri casuali
//appartenenti ad un intervallo dato in input
		//stampa degli elementi generati
		
		Scanner tastiera = new Scanner(System.in);
			
		System.out.println("Quanti numeri devo generare?");
		int n = tastiera.nextInt();
		
		int[] numeri = new int[n];
		
		System.out.println("Estremo inferiore dell'intervallo");
		int inf = tastiera.nextInt();
		
		System.out.println("Estremo superiore dell'intervallo");
		int sup = tastiera.nextInt();
		
		for(int i = 0;i<numeri.length; i++)
		numeri[i] = funzioni.MyLibrary.Casuale(inf,sup);
		
		System.out.println("\nArray di numeri casuali generato");
		
		funzioni.MyLibrary.stampaArray(numeri);
		
		/*
		System.out.println("Inserisci il numero da cercare");
		int m = tastiera.nextInt();
		*/
		
		tastiera.close();
		
	}

}
