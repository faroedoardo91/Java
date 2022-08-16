package selezione;

import java.util.Scanner;

public class PariDispari {

	public static void main(String[] args) 
	{
		// stabilire se il numero è pari o dispari
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.print("Inserisci un numero intero: ");
		int n = tastiera.nextInt();
		tastiera.close();
		
		int resto = n % 2;
		
		if (resto == 0)
			System.out.print(n + "è pari");
		
		else
			System.out.println(n + "è dispari");	
	}
}