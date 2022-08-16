package funzioni;

import java.util.Scanner;

public class LancioNDadi {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);

		System.out.println("dadi da lanciare ");
		
		int n = tastiera.nextInt();
		
		for(int i = 0;i<n;i++)
		{
		int dado = (int)(Math.random()*6+1);
		System.out.println("lancio del dado: " + dado);
		}

		System.out.println("Quante facce ha il dado? ");
		int f = tastiera.nextInt();
		
		for(int i = 0;i<n;i++)
		
			System.out.println("lancio del dado: "+ f + ":" + LancioDado.dado(f));
			
			tastiera.close();		
	}
}
