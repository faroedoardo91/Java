package sequenza;

public class Caratteri {

	public static void main(String[] args) {
		// Stampare i caratteri dell'alfabeto Ascii
		
		char carattere = 'a'; //8bit(1bite)
		
		System.out.println(carattere);
		
		int posizione = (int)carattere;
		
		System.out.println("Posizione ASCII: " + posizione);
		
		//opposto
		
		int p = 115;
		char c = (char)p;
		
		System.out.println("Posizione ASCII: " + p);
		System.out.println("Carattere: " + c);
		
		// esempio char s = 'p';

	}

}
