package selezione;

import java.util.Scanner;

public class Max3Interi {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("n1 ");
		int n1 = tastiera.nextInt();

		System.out.println("n2 ");
		int n2 = tastiera.nextInt();

		System.out.println("n3 ");
		int n3 = tastiera.nextInt();
		
		tastiera.close();
		
		if (n1>n2)
			if(n1>n3)
				System.out.println("Max: " + n1);
			else
				System.out.println("Max: " + n3);
		
		else if (n2>n3)
			System.out.println("max: " + n2);
		else
			System.out.println("Max: " + n3);
	}

}
