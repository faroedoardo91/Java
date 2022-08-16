package selezione;

import java.util.Scanner;

public class ControlloSequenzaOraria {

	public static void main(String[] args) {

		// In input sono dati ora,minuti, secondi
		// in output stampare Errore
		
		//h 0 - 23
		//m 0 - 59
		//s 0 - 59

		Scanner tastiera = new Scanner(System.in);

		System.out.println("Ora ");
		int h = tastiera.nextInt();

		System.out.println("Minuti ");
		int m = tastiera.nextInt();

		System.out.println("Secondi ");
		int s = tastiera.nextInt();

		tastiera.close();

		if(h<0 || h>23 || m<0 || m>59 || s<0 || s>59)
			System.out.println("Errore");
		else
		{
			if(h<10)
				System.out.print("0");
			System.out.print(h+ ":");
			
			if(m<10)
				System.out.print("0");
			System.out.print(m+ ":");
			
			if(s<10)
				System.out.print("0");
			System.out.print(s);
			
		}
			//System.out.println(h + ":" + m + ":" + s);
	}

}
