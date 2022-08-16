package sequenza;

import java.util.Scanner;

public class OreMinutiSecondi {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);		
		
		System.out.println("Inserisci i secondi: ");
		int secondi = tastiera.nextInt();
		
		tastiera.close();
		
		int ore = secondi/3600;
		int minuti = (secondi%3600)/60;		
		int s = (secondi%3600) % 60;
				
		System.out.println(ore + ":" + minuti + ":" + s);

	}

}
