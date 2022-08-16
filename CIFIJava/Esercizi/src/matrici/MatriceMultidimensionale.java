package matrici;

public class MatriceMultidimensionale {

	public static void main(String[] args)
	{
		//MatriceMultidimensionale
		
		
		//definizione
		int[][] matrice = new int[funzioni.MyLibrary.Casuale(1, 10)][];
		
		//caricamento dati
		for(int i= 0; i<matrice.length;i++)
			matrice[i] = new int[funzioni.MyLibrary.Casuale(1,10)];
		
		//stampa
		for(int i= 0; i<matrice.length;i++)
			for(int j= 0; j<matrice[i].length;j++)
				System.out.println(matrice[i][j] + "\t");
		System.out.println();
	}

}
