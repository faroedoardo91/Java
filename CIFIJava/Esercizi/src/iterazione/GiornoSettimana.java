package iterazione;

import java.util.Scanner;

public class GiornoSettimana {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserisci il numero ");
		int numero = tastiera.nextInt();

		tastiera.close();

		String msg = "";

		if (numero < 1 || numero > 7)
			System.out.println(msg);

		/*
		 * if (numero == 1) 
		 * System.out.println("Lunedì");
		 * 
		 * if (numero == 2) 
		 * System.out.println("Martedì");
		 * 
		 * if (numero == 3) 
		 * System.out.println("Mercoledì");
		 * 
		 * if (numero == 4) 
		 * System.out.println("Giovedì");
		 * 
		 * if (numero == 5) 
		 * System.out.println("Venerdì");
		 * 
		 * if (numero == 6) 
		 * System.out.println("Sabato");
		 * 
		 * if (numero == 7) 
		 * System.out.println("Domenica");
		 * 
		 */

		switch (numero) 
		{
		case 1:
			msg = "Lunedì";
			break;
		case 2:
			msg = "Martedì";
			break;
		case 3:
			msg = "Mercoledì";
			break;
		case 4:
			msg = "Giovedì";
			break;
		case 5:
			msg = "Venerdì";
			break;
		case 6:
			msg = "Sabato";
			break;
		case 7:
			msg = "Domenica";
			break;

		default:
			msg = "Errore";
			break;
		}

		System.out.println(msg);

	}
}