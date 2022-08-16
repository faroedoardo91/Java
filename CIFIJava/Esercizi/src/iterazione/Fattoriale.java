package iterazione;

import java.util.Scanner;

public class Fattoriale {

	public static void main(String[] args) {
		// calcolo che consente di effettuare questa operazione
		
		//n!
		// input n 0> n! = n*n-1*n-2*... *2*1
		//3! = 3*2*1 = 6
		//5! = 5*4*3*2*1 = 120
		//eccezioni
		//0! = 1
		//1! = 1
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("inserisci un numero intero positivo");
		
		int n = tastiera.nextInt();
		
		tastiera.close();
		
		int fatt = 1;
		for(int i = n; i>1; i--)
			fatt = fatt * i;
		
		System.out.println(n + "!=" + fatt);
	}

}
