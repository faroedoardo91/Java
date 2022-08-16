package iterazione;

import java.util.Scanner;

public class PrezzoQuantitaPercentualeSconto {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Prezzo ");
		double prezzo = tastiera.nextInt();

		System.out.println("Quantità ");
		double quantità = tastiera.nextDouble();

		tastiera.close();

		double sconto = 0;

		if (quantità < 3)
			sconto = 0;

		if (quantità >= 3 && quantità < 8)
			sconto = 4;

		if (quantità >= 8 && quantità < 12)
			sconto = 9;

		if (quantità >= 12 && quantità < 20)
			sconto = 13;

		if (quantità >= 20)
			sconto = 21;

		double totaleNonScontato = (int) prezzo * quantità;

		double scontoSulPrezzo = (int) (sconto * totaleNonScontato) / 100;

		double totaleScontato = (int) totaleNonScontato - scontoSulPrezzo;

		System.out.println("Totale Scontato " + totaleScontato);
	}
}