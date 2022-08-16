package iterazione;

import java.util.Scanner;

public class Saluto {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Ora ");
		int h = tastiera.nextInt();

		tastiera.close();
		
		if (h>=6 && h<16)
			System.out.print("Buongiorno");
		
		if (h>=16 && h<18)
			System.out.print("Buon pomeriggio");
		
		if (h>=18 && h<23)
			System.out.print("Buonasera");
		
		if (h>=23 && h<6)
			System.out.print("Buonanotte");
	}

}
