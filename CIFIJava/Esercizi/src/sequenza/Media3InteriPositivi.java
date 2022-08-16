package sequenza;

import java.util.Scanner;

public class Media3InteriPositivi {

	public static void main(String[] args) {
		// dati in input 3 numeri interi e positivi
		// calcolare la media aritmetica e stampare il risultato
		
		//step da fare
		//input
		//calcoli
		//Input
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.print("n1: ");
		int n1 = tastiera.nextInt();
		
		System.out.print("n2: ");
		int n2 = tastiera.nextInt();
		
		System.out.print("n3: ");
		int n3 = tastiera.nextInt();
		
		tastiera.close(); //elimina oggetto scanner dalla memoria
		
		double media = (double)(n1+n2+n3)/3;
		
		System.out.println("Media aritmetica: " + media);

	}

}
