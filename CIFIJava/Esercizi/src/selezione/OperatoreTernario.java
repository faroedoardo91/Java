package selezione;

import java.util.Scanner;

public class OperatoreTernario {

	public static void main(String[] args) {
		// Dati in input giorno,mese, anno
		//stampare data in forma lineare cio� gg/mm/aaaa

		// ?: � questo
		
		Scanner tastiera = new Scanner(System.in);

		System.out.println("g [1-31] ");
		int g = tastiera.nextInt();

		System.out.println("mese [1 - 12] ");
		int m = tastiera.nextInt();

		System.out.println("Anno ");
		int a = tastiera.nextInt();

		tastiera.close();
		
		String msg = "";
		
		msg = msg + (g<10 ? "0" : "" ) + g + "/"; // deve restituire una condizione se � vera o se � falsa
		
		msg = msg + (m<10 ? "0" : "" ) + m + "/";
		
		msg = msg + a;
		
		System.out.println(msg);
		
	}

}
