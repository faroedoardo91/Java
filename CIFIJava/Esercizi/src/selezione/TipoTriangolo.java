package selezione;

import java.util.Scanner;

public class TipoTriangolo {

	public static void main(String[] args) {
		// dati in input i tre lati di un triangolo stabilire di che tipo di triangolo
		// si tratta
		// stampare il risultato

		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Lato 1 ");
		double lato1 = tastiera.nextDouble();

		System.out.println("Lato 2 ");
		double lato2 = tastiera.nextDouble();

		System.out.println("Lato 3 ");
		double lato3 = tastiera.nextDouble();
		
		tastiera.close();

		/*
		
		if (lato1 == lato2)
			if (lato1 == lato3)
				msg = "Equilatero";
			else
				msg = "Isoscele";

		else if (lato1 == lato3)
			msg = "Isoscele";
		else if (lato2 == lato3)
			msg = "Isoscele";
		else
			msg = "Scaleno";

		System.out.print(msg);
		
		*/
		String msg = "";
		
		if (lato1 == lato2 && lato1 == lato3)
			msg = "Equilatero";
		else if (lato1 == lato2 || lato1 == lato3 || lato2 == lato3)
			msg = "Isoscele";
		else
			msg = "Scaleno";

		System.out.println(msg);

	}

}
