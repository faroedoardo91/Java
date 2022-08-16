package iterazione;

public class Stampa100NumeriInteriPositivi {

	public static void main(String[] args) {
		
		//3 cicli: while, do while, for
		
		//cicli a iterazione indefinita
		//while (condizione, ciclo precondizionato) [0 - +inf]
		//e do {...} while (condizione) ciclo postcondizionato [1 - +inf]
		
		//ciclo interazione definita
		//for(contatore; condizione; incremento) {...}
		
		//output: 0,1,2,...,98,99
		
		//contatore
		
		/*
		 int count = 0;
		
		while(count<100)
			System.out.println(count++);
			//count++; //count = count + 1;
			 
			 */
		/*
		do
		{
			System.out.println(count);
			count++;
		}
		while(count<100);
		*/
		
		
		for(int i = 0; i <100; i++)
			System.out.println(i);		
	}

}
