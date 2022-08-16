package sequenza;

import java.util.Scanner;

public class Rettangolo {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);		
		
		System.out.println("Inserisci la misura della base del rettangolo: ");
		double base = tastiera.nextDouble();
		
		System.out.println("Inserisci la misura dell'altezza del rettangolo: ");
		double altezza = tastiera.nextDouble();
		
		tastiera.close();
		
		double perimetro = (int) (base + altezza)*2;		
		System.out.println("Perimetro " + perimetro);
		
		double area = (int) base * altezza;		
		System.out.println("Area " + area);
		
		double diagonale = Math.sqrt(Math.pow(base,2)+ Math.pow(altezza,2));		
		System.out.println("Diagonale " + diagonale);	
	}
}