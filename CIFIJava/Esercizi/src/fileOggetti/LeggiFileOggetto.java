package fileOggetti;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeggiFileOggetto {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Lettura da file di oggetti
		
		String path = "src/files/Cerchio.dat";
		
		Cerchio c = null;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			
			//System.out.println(ois.readObject());
			/*
			Object obj = ois.readObject();
			if(obj instanceof Cerchio)
				c=(Cerchio)obj;
			*/
			
			
			Object obj = null;
			
			while((obj = ois.readObject())!= null) {
				c = (Cerchio)obj;
						
				if(c!=null)
					System.out.println("Raggio del Cerchio: "+c.getRaggio());
				else
					System.out.println("Oggetto non trovato");
			}
			
			ois.close();
			fis.close();
			
		} catch (EOFException e) {
			//e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 

	}

}
