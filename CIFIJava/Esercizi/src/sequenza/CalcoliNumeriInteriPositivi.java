package sequenza;

import java.util.Scanner;

public class CalcoliNumeriInteriPositivi {

	public static void main(String[] args) 
	{
	
	Scanner tastiera = new Scanner(System.in);

	System.out.println("Inserisci il numero intero: ");		
	int numeroIntero = tastiera.nextInt();
	
	tastiera.close();
	
	double radiceQuadrata = Math.sqrt(numeroIntero);
	System.out.println("Radice Quadrata " + radiceQuadrata);
	
	double tangente = Math.tan(numeroIntero);
	System.out.println("Tangente " + tangente);
	
	double potenza = Math.pow(numeroIntero, 3);
	System.out.println("Potenza " + potenza);
	
	}

}
