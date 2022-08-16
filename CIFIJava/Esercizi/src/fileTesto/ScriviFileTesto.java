package fileTesto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScriviFileTesto {

	public static void main(String[] args) {
		
		//esistere
		
		String path = "src/files/testo.txt";
		
		//scrivere
				
		Scanner tastiera = new Scanner(System.in);
		System.out.print("Inserisci una frase: ");
		String msg = tastiera.nextLine();
		tastiera.close();
		
		try {
			FileWriter fw = new FileWriter(path); //connessione al file
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(msg);
			bw.flush(); //svuoto il buffer e salvo
			bw.close(); //chiudo le modifiche			
			fw.close();//chiudo l'accesso al file
			
			System.out.println("Operazione andata a buon fine");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
