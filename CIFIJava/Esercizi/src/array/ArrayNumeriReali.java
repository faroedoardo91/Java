package array;

import java.util.Scanner;

public class ArrayNumeriReali {

	public static void main(String[] args) {
	//double di dimensione 5
		
		double numeri [] = new double[5]; //si può scrivere anche così l'array ma è per froci
		
		Scanner tastiera = new Scanner(System.in);
		
		tastiera.close();
		
		//caricamento dati
		for(int i = 0; i<numeri.length; i++)
		{
		System.out.print("Posizione " + i + ": ");		
		numeri[i]= tastiera.nextDouble();
		}
		
		//stampa dati
		for(int i = 0; i<numeri.length; i++)
			System.out.print(numeri[i] + " ");
		
	}

}
