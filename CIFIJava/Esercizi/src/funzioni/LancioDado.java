package funzioni;

public class LancioDado {
	
	//definizione delle funzioni per gestire i dadi
	
	public static int dado(int numeroFacce)
	{
		return (int)(Math.random()* numeroFacce+1);
	}

	public static void main(String[] args) {
		//lancio dado a 6 facce
		
		//for(int i = 0;i<100;i++)
		{
			int dado6 = (int)(Math.random()*6+1);
			System.out.println("lancio del dado: " + dado6);
		}
		
		{
			int dado10 = dado(10);
			System.out.println("lancio del dado: " + dado10);
			System.out.println("lancio del dado: " + dado(25));
		}
	}

}
