package fileTesto;

import java.io.File;
import java.io.IOException;

public class CreaFileTesto {

	public static void main(String[] args) {

		String path = "c:\\files\\java.txt";

		// esistere

		File file = new File(path);

		if (file.exists())
			System.out.println("File trovato");
		else
			try {
				if (file.createNewFile())
					System.out.println("File creato");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
