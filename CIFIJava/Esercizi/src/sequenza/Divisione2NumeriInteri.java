package sequenza;

import java.util.Scanner;

public class Divisione2NumeriInteri {

	public static void main(String[] args) {
		// Dati in input 2 numeri interi
		// calcolare: quoziente intero, resto, quoziente reale
		// stampare risultati ottenuti
		
		//per input
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.print("Inserisci il dividendo: ");
		
		int a = tastiera.nextInt();
		
		System.out.print("Inserisci il divisore: ");
		
		int b = tastiera.nextInt();
		
		tastiera.close(); //elimina l'oggetto dalla memoria
		
		int qi = a/b; //qi quoziente intero
		int r = a%b; //r resto (intero)
		double qr = (double)a/b; //questo metodo si chiama casting //qr quoziente reale
		
		System.out.println("Quoziente intero: " + qi);
		System.out.println("Resto: " + r);
		System.out.println("Quoziente reale: " + qr);

	}

}
