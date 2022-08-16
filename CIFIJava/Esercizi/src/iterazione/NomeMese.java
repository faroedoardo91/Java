package iterazione;

import java.util.Scanner;

public class NomeMese {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserisci il numero ");
		int numero = tastiera.nextInt();
		
		tastiera.close();
		
		if (numero == 1)
			System.out.println("Gennaio");
		
		if (numero == 2)
			System.out.println("Febbraio");
		
		if (numero == 3)
			System.out.println("Marzo");
		
		if (numero == 4)
			System.out.println("Aprile");
		
		if (numero == 5)
			System.out.println("Maggio");
		
		if (numero == 6)
			System.out.println("Giugno");
		
		if (numero == 7)
			System.out.println("Luglio");
		
		if (numero == 8)
			System.out.println("Agosto");
		
		if (numero == 9)
			System.out.println("Settembre");
		
		if (numero == 10)
			System.out.println("Ottobre");
		
		if (numero == 11)
			System.out.println("Novembre");
		
		if (numero == 12)
			System.out.println("Dicembre");
	}

}
