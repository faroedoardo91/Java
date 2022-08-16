package model;

import java.util.Scanner;

public class TestCarte {

	public static void main(String[] args) {
		
		ContoCorrente IntesaSanPaolo = new ContoCorrente(65432,1235,9999.9,System.getProperty("user.name"),1.89,1.8,21,(int) (Math.random() * 100000));
		
		ContoCorrente Sella = new ContoCorrente(12356,1235,10000,System.getProperty("user.name"),2.9,1.5,20,(int) (Math.random() * 100000));
		
		CartePrepagate Unicredit = new CartePrepagate();
		Unicredit.setNumeroDellaCarta("4444-3333-2222-1111");
		Unicredit.setDatiIntestatario(System.getProperty("user.name"));
		Unicredit.setCostoApertura(1);
		Unicredit.setPin(5432);
		Unicredit.setPlafond(3);
		Unicredit.setSpeseGestione(4);
		Unicredit.setTotaleSpeseSostenuteMese(5);
		Unicredit.setTransazione((int) (Math.random() * 100000));
		
		CartePrepagate Fideuram = new CartePrepagate();
		Fideuram.setNumeroDellaCarta("1111-2222-3333-4444");
		Fideuram.setDatiIntestatario(System.getProperty("user.name"));
		Fideuram.setCostoApertura(1.2);
		Fideuram.setPin(1235);
		Fideuram.setPlafond(3000);
		Fideuram.setSpeseGestione(1.99);
		Fideuram.setTotaleSpeseSostenuteMese(9);
		Fideuram.setTransazione((int) (Math.random() * 100000));
		
		Scanner tastiera = new Scanner(System.in);		
		
		do {
			
			System.out.println("Conti correnti disponibili: Unicredit, Fideuram, IntesaSanPaolo, Sella");
			System.out.println("Digitare il nome del Conto Corrente, possibilmente senza sbagliare: ");
			String userInput = tastiera.nextLine();			
			
			
			if (userInput.equals("Unicredit")) {
				System.out.println(Unicredit);
				break;
			}
			if (userInput.equals("Fideuram")) {
				System.out.println(Fideuram);
				break;
			}
			if (userInput.equals("IntesaSanPaolo")) {
				System.out.println(IntesaSanPaolo);
				break;
			}
			if (userInput.equals("Sella")) {
				System.out.println(Sella);
				break;
			}

			else if (!userInput.equals("Unicredit") && !userInput.equals("Fideuram") && !userInput.equals("IntesaSanPaolo") && !userInput.equals("Sella")) {
				System.out.println("Conto non trovato, riprova.");
				}
			
		} while (true);
		
		tastiera.close();

	}

}
