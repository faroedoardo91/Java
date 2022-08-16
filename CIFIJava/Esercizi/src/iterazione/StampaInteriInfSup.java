package iterazione;

import java.util.Scanner;

public class StampaInteriInfSup {

	public static void main(String[] args) 
	{
		Scanner tastiera = new Scanner(System.in);

		System.out.println("inf ");
		int inf = tastiera.nextInt();

		System.out.println("sup ");
		int sup = tastiera.nextInt();

		tastiera.close();
		
		while(inf<=sup)
		{
			System.out.println(inf);
			inf++;
		}
	}

}
