package sequenza;

import java.util.Scanner;

public class Quadrato {

	public static void main(String[] args) {
		// dato il lato di un quadrato,
		// calcolare il perimetro, l'area e la diagonale
		// stampare i risultati
		
		//step:
		
		//input
		
		//calcolo
		
		//output
		
		Scanner tastiera = new Scanner(System.in);		
		System.out.println("Inserisci il lato del quadrato: ");		
		double lato = tastiera.nextDouble();
		
		tastiera.close();
		
		double perimetro = lato * 4;
		double area = lato*lato;
		double diagonale = lato * Math.sqrt(2);
		
		System.out.println("lato" + lato);
		System.out.println("perimetro" + perimetro);
		System.out.println("lato" + area);
		System.out.println("lato" + diagonale);

	}

}
