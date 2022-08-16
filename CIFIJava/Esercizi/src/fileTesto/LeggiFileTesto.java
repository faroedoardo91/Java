package fileTesto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggiFileTesto {

	public static void main(String[] args) {
		// Lettura da file di testo

String path = "src/files/testo.txt";
		
		String msg;
		try {
			FileReader fr = new FileReader(path); //connessione al file
			BufferedReader br = new BufferedReader(fr); //buffer per le operazioni di lettura
			
			while((msg = br.readLine())!=null) {
				System.out.println(msg);
				//msg = br.readLine(); //leggo la linea di contenuto del file
			}br.close(); //finalizzo le operazioni di lettura
			fr.close(); //finalizzo l'apertura del file
			
			//System.out.println("Testo recuperato: "+msg);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
