package array;

import java.util.Scanner;

public class ArrayNumeriCasuali {

	public static int casuale(int inf, int sup) {
		return (int) (Math.random() * sup + inf);
	}

	public static void main(String[] args) {
		// Dato in input il numero di valori casuali da generare e memorizzare in un
		// array,
		// stabilire se tra i numeri generati esiste un valore fornito da input

		// input N = 100, generiamo N numeri casuali [1,90] e verificare l'esistenza del
		// numero M dato in input

		Scanner tastiera = new Scanner(System.in);

		System.out.println("Quanti numeri devo generare?");
		int n = tastiera.nextInt();

		int[] numeri = new int[n];

		for (int i = 0; i < numeri.length; i++)
			numeri[i] = casuale(1, 90);

		System.out.println("\nArray di numeri casuali generato");

		System.out.println("\n\nInserisci il numero da cercare");
		int m = tastiera.nextInt();
		tastiera.close();

		boolean flag = false; // non trovato
		for (int i = 0; i < numeri.length; i++)
			if (numeri[i] == m) {
				System.out.println(m + " trovato in posizione " + i);
				flag = true;
			}

		if (!flag)
			System.out.println(m + " non trovato");

		System.out.println("\nNumeri generati:");
		for (int i = 0; i < numeri.length; i++)
			System.out.println("[" + i + "] " + numeri[i]);
	}

}
