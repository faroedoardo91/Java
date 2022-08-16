package funzioni;

public class MyLibrary {

	//definizione di funzioni
	
	public static int ricerca(int[] array, int elemento)
	{
		//restituisce la posizione della prima occorrenza utile
		//se non trova l'elemento allora restituisce -1
		
		for (int i = 0; i<array.length;i++)
			if(array[i]==elemento)
				return i;
		
		return -1;
	}
	
	public static void stampaArray(int[] array)
	{
		for(int n : array)
			System.out.println(n);
	}
	
	public static int Casuale(int inf, int sup)
	{
		return (int)(Math.random()*(sup-inf) + inf+1);
	}
	
	public static int max(int[] array)
	{
		int posizione = 0;
		for(int i = 1; i <array.length;i++)
			if(array[i]>array[posizione])
				posizione=i;
		
		return array[posizione];
	}
	
	public static int min(int[] array)
	{
		int posizione = 0;
		for(int i = 1; i <array.length;i++)
			if(array[i]>array[posizione])
				posizione=i;
		
		return array[posizione];
	}
	
}
