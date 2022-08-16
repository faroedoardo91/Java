package eccezioni;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EsempioEccezione {

	public static void main(String[] args) {
		// simulazione della gestione delle eccezioni
		
		Scanner tastiera = new Scanner(System.in);
		
		try {
			System.out.print("Inserisci dividendo: ");
			int a = tastiera.nextInt();
			
			System.out.print("Inserisci divisore: ");
			int b = tastiera.nextInt();
			
			int q = a/b;
			
			System.out.println("Quoziente: "+q);
		}catch(InputMismatchException ex) {
			System.out.println("Errore");
			System.out.println("Messaggio: "+ex.getMessage());
		}catch(ArithmeticException ex) {
			System.out.println("Errore");
			System.out.println("Messaggio: "+ex.getMessage());
		}catch(Exception ex) {
			System.out.println("Errore");
			System.out.println("Messaggio: "+ex.getMessage());
		}

		
		
		
		try {
			System.out.print("Lato del quadrato");
			double lato = tastiera.nextDouble();
			
			Quadrato q = new Quadrato();
			q.setLato(lato);
			
			System.out.println(q);
			
		}catch(Exception ex) {
			System.out.println("Errore");
			System.out.println("Messaggio: "+ex.getMessage());
		}
		
		tastiera.close();
	}

}
