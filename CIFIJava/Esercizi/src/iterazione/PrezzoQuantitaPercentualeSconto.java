package iterazione;

import java.util.Scanner;

public class PrezzoQuantitaPercentualeSconto {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Prezzo ");
		double prezzo = tastiera.nextInt();

		System.out.println("Quantit� ");
		double quantit� = tastiera.nextDouble();

		tastiera.close();

		double sconto = 0;

		if (quantit� < 3)
			sconto = 0;

		if (quantit� >= 3 && quantit� < 8)
			sconto = 4;

		if (quantit� >= 8 && quantit� < 12)
			sconto = 9;

		if (quantit� >= 12 && quantit� < 20)
			sconto = 13;

		if (quantit� >= 20)
			sconto = 21;

		double totaleNonScontato = (int) prezzo * quantit�;

		double scontoSulPrezzo = (int) (sconto * totaleNonScontato) / 100;

		double totaleScontato = (int) totaleNonScontato - scontoSulPrezzo;

		System.out.println("Totale Scontato " + totaleScontato);
	}
}