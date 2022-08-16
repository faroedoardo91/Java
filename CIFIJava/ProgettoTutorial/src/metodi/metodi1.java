package metodi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class metodi1 {

	public static void main(String[] args) {
				
		float gradiF = 0;
		float gradiC = 0;
		
		Scanner s = new Scanner(System.in);	
		do {			
			System.out.println("Inserisci i gradi Celsius");
			gradiF = s.nextFloat();
			gradiC = InsertFahrenheit(gradiF);
			PrintConversion(gradiF, gradiC);
		} while (s.hasNextLine());
		s.close();
	}

	public static float InsertFahrenheit(float gradiF) {
		float gC = 0;
		gC = 5 * (gradiF - 32) / 9;
		DecimalFormat dF = new DecimalFormat("#.##");
		dF.format(gC);
		return gC;
	}

	public static void PrintConversion(float gradiF, float gradiC) {
		System.out.println(gradiF + " sono uguali a " + gradiC);
	}
	
	
}
