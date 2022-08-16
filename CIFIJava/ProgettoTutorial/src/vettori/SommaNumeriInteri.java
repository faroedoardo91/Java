package vettori;

public class SommaNumeriInteri {

	public static void main(String[] args) {
		
		int arrayNumeriInteri[] = {1,2,3,4,5};
		int somma = 0;
		
		for(int i = 0; i<arrayNumeriInteri.length;i++)
		{
			somma+= arrayNumeriInteri[i];
		}
		System.out.println("somma: " + somma);

	}

}
