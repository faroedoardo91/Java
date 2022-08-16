package iterazione;

import java.util.Scanner;

public class TabellinaN {
	// Stampa della tabellina di un numero dato in input

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		int numero;

		do {
			System.out.println("Inserisci il numero[1,10] ");
			numero = tastiera.nextInt();

			if (numero < 1 || numero > 10)
				System.out.println("Errore ");
			else
				break;
		} while (true);

		tastiera.close();

		for (int i = 1; i <= 10; i++)
			System.out.println(i * numero + "");
	}
}
