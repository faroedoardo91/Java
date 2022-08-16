package selezione;

import java.util.Scanner;

public class Bisestile {

	public static void main(String[] args) {
		
		//Determinare se un anno è bisestile
		
		// ogni 400 anni uno è bisestile

		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Anno ");
		int a = tastiera.nextInt();
		
		tastiera.close();
					

		if (a%4 == 0 || (a%100 != 0 && a%400 == 0))
			System.out.println(a + " è bisestile");
		else
			System.out.println(a + " non è bisestile");		
	}

}
