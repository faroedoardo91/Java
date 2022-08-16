package selezione;

import java.util.Scanner;

public class MaxMin2Numeri {

	public static void main(String[] args)
	{
		//dati in input 2 numeri interi stabiliare max e min
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.print("Inserisci il primo numero intero: ");
		int primoNumero = tastiera.nextInt();
		
		System.out.print("Inserisci il primo numero intero: ");
		int secondoNumero = tastiera.nextInt();
		
		tastiera.close();
		
		if (primoNumero>secondoNumero)
		{
			System.out.println("Max: " + primoNumero);
			System.out.println("Max: " + secondoNumero);
		}
		else if (primoNumero<secondoNumero)
		{
			System.out.println("Max: " + secondoNumero);
			System.out.println("Max: " + primoNumero);
		}		
		else
			System.out.println("Uguali");
			
	}
	
}
