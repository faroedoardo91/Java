package funzioni;

public class NumeroCasuale {

	public static void main(String[] args) {
		//generatore di un numero casuale
				
		int inf = 1;
		int sup = 100;
		
		double c1 = Math.random();
		double c2 = c1 * sup;
		double c3 = c2 + inf;
		int c4 = (int) c3;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);


	}

}
