package model;

import java.util.ArrayList;
import java.util.Scanner;

public class TestSoftware {

	public static void main(String[] args) {
		
		SoftwarePalestra Orange = new SoftwarePalestra(1, "Edoardo", 30);
		
		ArrayList<ListaCliente> elencoP = new ArrayList<ListaCliente>();
		
		elencoP.add(new ListaCliente("Edo", "Faro", 30, "Premium"));
		
		System.out.println(elencoP);
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Scrivi OK");
		

		do {
			
		String userInput = tastiera.nextLine();
		
		if(userInput.equals("OK"))
		{
		System.out.println(Orange);	
		break;
		}
		else if (!userInput.equals("OK"))
		{
			System.out.println("Devi scrivere OK, non altro");
		}
		
		} while(true);
		
		tastiera.close();
	}
//
	
}
