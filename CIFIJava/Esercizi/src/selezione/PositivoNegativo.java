package selezione;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// Dato in input un numero intero stabilire se si tratta di un numero positivo o negativo
		// stampare il risultato in output
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.print("Inserisci un numero intero: ");
		int n = tastiera.nextInt();
		tastiera.close();
		
		if (n> 0)
		{
			System.out.println(n + "è positivo");
		}
		else if (n<0)
		{
		System.out.println(n + " è negativo");	
		}		
		else
		{
			System.out.println(n + " cazzo");	
		}
		
		boolean flag1 = !(4>3);
		boolean flag2 = 4%3 == 0;
		
		System.out.println(flag1);
		System.out.println(flag2);
	}

}
