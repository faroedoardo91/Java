package sequenza;

import java.util.Scanner;

public class TotaleProdotto {

	public static void main(String[] args) {
				
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci il prezzo: ");		
		double prezzo = tastiera.nextDouble();
		
		System.out.println("Inserisci la quantit�: ");
		double quantit� = tastiera.nextDouble();
		
		tastiera.close();
		
		double totale = (int) prezzo * quantit�;
		
		System.out.println("Totale " + totale);
	}

}
