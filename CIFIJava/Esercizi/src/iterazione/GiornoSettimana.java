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
		 * System.out.println("Luned�");
		 * 
		 * if (numero == 2) 
		 * System.out.println("Marted�");
		 * 
		 * if (numero == 3) 
		 * System.out.println("Mercoled�");
		 * 
		 * if (numero == 4) 
		 * System.out.println("Gioved�");
		 * 
		 * if (numero == 5) 
		 * System.out.println("Venerd�");
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
			msg = "Luned�";
			break;
		case 2:
			msg = "Marted�";
			break;
		case 3:
			msg = "Mercoled�";
			break;
		case 4:
			msg = "Gioved�";
			break;
		case 5:
			msg = "Venerd�";
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