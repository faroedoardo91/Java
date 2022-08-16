package iterazione;

import java.util.Scanner;

public class TabellinaTastiera {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserisci il numero per la riga ");

		for (int i = tastiera.nextInt(); i <= 20; i++) {// righe
			for (int j = 1; j <= 20; j++) // colonne
				System.out.print(i * j + "\t");

			tastiera.close();
			
			System.out.println(); // vai a riga successiva
		}
	}

}
