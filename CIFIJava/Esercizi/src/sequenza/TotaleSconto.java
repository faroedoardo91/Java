package sequenza;

import java.util.Scanner;

public class TotaleSconto {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserisci il prezzo: ");		
		double prezzo = tastiera.nextDouble();
		
		System.out.println("Inserisci la quantità: ");		
		double quantità = tastiera.nextDouble();
		
		System.out.println("Inserisci la percentuale di sconto: ");		
		double percentualeSconto = tastiera.nextDouble();
		
		tastiera.close();
		
		double totaleNonScontato = (int) prezzo * quantità;		
		System.out.println("Totale " + totaleNonScontato);
		
		double ScontoSulPrezzo = (int) (percentualeSconto * totaleNonScontato)/100;	
		System.out.println("Sconto " + ScontoSulPrezzo);
		
		double totaleScontato = (int) totaleNonScontato - ScontoSulPrezzo;		
		System.out.println("Totale Scontato " + totaleScontato);
	}

}
