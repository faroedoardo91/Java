package selezione;

import java.util.Scanner;

public class NMultiploM {

	public static void main(String[] args) {
		// dati in input n e m numeri interi stabilire se n è multiplo di m, stampare il risultato
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.print("Inserisci il primo numero intero: ");
		int m = tastiera.nextInt();
		
		System.out.print("Inserisci il secondo numero intero: ");
		int n = tastiera.nextInt();
		
		tastiera.close();
		
		if (n % m == 0)
			System.out.println(n + "è multiplo di " + m);
		else
			System.out.println(n + "non è multiplo di " + m);
	}

}
