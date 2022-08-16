package model;

import java.util.Scanner;

public class TestConto {

	public static void main(String[] args) {
	
		Conto cc = new Conto(1000);
		
		String menu ="Scegli tra le seguenti operazioni: "
				+ "\n1 - Saldo"
				+ "\n2 - Versa"
				+ "\n3 - Preleva"
				+ "\n0 - Esci"
				;
		
		Scanner tastiera = new Scanner(System.in);
		
		int scelta = -1;
		
		do {
			System.out.println(menu);
			scelta = tastiera.nextInt();
			switch(scelta) {
			case 1: System.out.println("Saldo: "+cc.saldo()); break;
			case 2: 
				System.out.print("Cifra da versare: ");
				cc.versa(tastiera.nextDouble());
				break;
			case 3: 
				try {
				System.out.print("Cifra da prelevare: ");
					cc.preleva(tastiera.nextDouble());
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 0: System.out.println("Programma terminato"); break;
			default: System.out.println("Scelta non valida");
			}
						
		}while(scelta!=0);
		
		tastiera.close();
	}

}
