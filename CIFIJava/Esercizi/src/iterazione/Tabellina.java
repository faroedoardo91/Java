package iterazione;

public class Tabellina {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {// righe
			for (int j = 1; j <= 10; j++) // colonne
				System.out.print(i * j + "\t");

			System.out.println(); // vai a riga successiva
		}
	}
}
