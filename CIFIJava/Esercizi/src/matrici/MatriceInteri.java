package matrici;

public class MatriceInteri {

	public static void main(String[] args) {
		// matrice numeri interi bidimensionale

		int righe = 2;
		int colonne = 3;

		// definizione
		int[][] matrice = new int[righe][colonne];

		for (int i = 0; i < righe; i++)
			for (int j = 0; j < colonne; j++)
				matrice[i][j] = funzioni.MyLibrary.Casuale(-100, 100);
		//stampa
		for (int i = 0; i < righe; i++)
			for (int j = 0; j < colonne; j++)
				System.out.print(matrice[i][j]+ "\t");
		System.out.println();
		

	}

}
