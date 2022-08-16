package array;

public class ArrayNumeriInteri {

	public static void main(String[] args) {
		//dichiarazione
		//tipo [] identificatore = new tipo [dimensione]
		
		int[] numeri = new int[5];
		
		//scrittura, assegno i valori alle celle
		//identificatore[posizione] = valore
		
		numeri [0] = 4;
		numeri [1] = -7;
		numeri [2] = 5;
		numeri [3] = 12;
		numeri [4] = -1;
		
		System.out.println("Posizione 3 - Valore: " + numeri[3]);
		
		System.out.println("\nStampa dell'intero array");
		for(int i =0; i<5;i++)
		System.out.println("Posizione:" + i + "Valore: " + numeri[i]);
		
		
	}

}
