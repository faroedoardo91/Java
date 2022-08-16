package classi;

import java.util.Scanner;

public class TestCerchio {

	public static void main(String[] args) {
		//test per oggetti di tipo Cerchio
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Raggio: ");
		double r = tastiera.nextDouble();
		
		tastiera.close();
		
		Cerchio c1 = new Cerchio(r);
		System.out.println("Diametro: " + c1.diametro());
		System.out.println("Diametro: " + c1.circonferenza());
		System.out.println("Diametro: " + c1.area());
		
		Cerchio c2 = new Cerchio(2.5);
		c2.stampa();
		
	}

}
