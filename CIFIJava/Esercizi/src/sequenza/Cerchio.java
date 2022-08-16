package sequenza;

import java.util.Scanner;

public class Cerchio {

	public static void main(String[] args) {
		// Dato in input il raggio di un cerchio calcolare il diametro, la circonferenza e l'area,
		// stampare i risultati
		
		//step
		
		//input
		//calcoli
		//output
		
		Scanner tastiera = new Scanner (System.in);		
		System.out.print("raggio: ");
		double raggio = tastiera.nextDouble();
		
		tastiera.close();
		
		double diametro = raggio * 2;
		double circonferenza = 2* Math.PI*raggio;
		double area = Math.PI * Math.pow(raggio, 2); //pow(a,b) =>a^b
		
		String msg = "Dati del cerchio: ";
		msg = msg + "\n\tDiametro: " + diametro;
		msg = msg + "\n\tCirconferenza: " + circonferenza;
		msg = msg + "\n\tArea: " + area;
		
		System.out.println(msg);

	}

}
