package array;

import java.util.Scanner;

public class MediaArrayPositivi {

	public static void main(String[] args) {
				
		Scanner tastiera = new Scanner(System.in);
		int[] numeri = {1,2,3,4,5};
		
		int somma= 0, media;				
		
		tastiera.close();
		
		for(int i = 0; i<numeri.length; i ++)
		{
			somma+= numeri[i];
		}			
		
		media  = somma/numeri.length;
			
		
		System.out.println("Media= " + media);	
		
	}

}
