package fileOggetti;

//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScriviFileOggetto {

	public static void main(String[] args) {
		
String path = "src/files/Cerchio.dat";
		
		/*
		File f = new File(path);
		
		if(!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		*/	
		
		Cerchio c1 = new Cerchio(2.5);
		Cerchio c2 = new Cerchio(1.5);
		Cerchio c3 = new Cerchio(0.5);
		
		try {
			FileOutputStream fos = new FileOutputStream(path); //connessione al file
			ObjectOutputStream oos = new ObjectOutputStream(fos); //operazione di scrittura su file
			
			oos.writeObject(c1); //scrivo oggetto su file
			oos.writeObject(c2);
			oos.writeObject(c3);
			oos.close(); //finalizzo le operazioni di modifica del file
			fos.close(); //finalizzo l'apertura del file
			
			System.out.println("Dati salvati correttamente");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
