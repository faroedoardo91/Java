package iterazione;

import java.util.Scanner;

public class DataCorretta {

	public static void main(String[] args) {

		// Calendario Gregoriano

		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserisci il giorno ");
		int giorno = tastiera.nextInt();

		System.out.println("Inserisci il mese ");
		int mese = tastiera.nextInt();

		System.out.println("Inserisci l'anno ");
		int anno = tastiera.nextInt();

		tastiera.close();

		String msg = "";

		if ((giorno < 1 || giorno > 31 || mese < 1 || mese > 12 || anno < 1582 || anno > 2999)
				|| (anno == 1582 && mese < 10 && giorno < 4)

				|| ((mese == 4 || mese == 6 || mese == 9 || mese == 11) && giorno == 31)

				|| (mese == 2 && giorno == 29)

				|| (mese == 2 && anno % 4 != 0 && giorno == 29)

				|| (mese == 2 && anno % 100 == 0 && anno % 400 != 0 && giorno == 29))
			
			msg = "errore";
		else
		msg = (giorno < 10 ? "0" : "") + giorno + "/" + (mese < 10 ? "0" : "") + mese + "/" + anno;
		
		System.out.println(msg);
	}
}
