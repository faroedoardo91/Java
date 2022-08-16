package ereditarieta;

import java.util.Scanner;

public class TestCilindro {

	public static void main(String[] args) {
		//da input raggio e altezza
		Scanner tastiera = new Scanner(System.in);		
		
		System.out.print("Raggio: ");
		double raggio = tastiera.nextDouble();
		
		System.out.print("Altezza: ");
		double altezza = tastiera.nextDouble();
		
		tastiera.close();
		
		Cilindro ci = new Cilindro(raggio,altezza);
		
		System.out.println(ci);
		
		
		
		
		

	}

}
