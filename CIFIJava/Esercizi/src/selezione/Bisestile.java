package selezione;

import java.util.Scanner;

public class Bisestile {

	public static void main(String[] args) {
		
		//Determinare se un anno � bisestile
		
		// ogni 400 anni uno � bisestile

		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Anno ");
		int a = tastiera.nextInt();
		
		tastiera.close();
					

		if (a%4 == 0 || (a%100 != 0 && a%400 == 0))
			System.out.println(a + " � bisestile");
		else
			System.out.println(a + " non � bisestile");		
	}

}
