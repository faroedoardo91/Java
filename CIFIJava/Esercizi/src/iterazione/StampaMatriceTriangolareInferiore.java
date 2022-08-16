package iterazione;

import java.util.Scanner;

public class StampaMatriceTriangolareInferiore {

	public static void main(String[] args) {
		//data input lunghezza base
		//determinare stampa matrice
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Numero asterischi ");
		int n = tastiera.nextInt();
		
		tastiera.close();
		
		for(int i = 0; i<n; i++)
		{
			for (int j = 0; j<=i; j++)
				System.out.print("*");
			System.out.println();
			}
		}

}
