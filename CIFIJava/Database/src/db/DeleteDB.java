package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB {

	public static void main(String[] args) {
		// Inserimento dei dati da una tabella

		// parametri per accesso al database
		String host = "localhost"; // 127.0.0.1
		int port = 3306; // default per mysql
		String dbName = "cifi";
		String userDB = "cifi";
		String passwordDB = "java-2021";

		// driver per accesso al database
		String driver = "com.mysql.cj.jdbc.Driver";

		// stringa di connessione al database MySQL
		String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;

		try {
			// load del driver
			Class.forName(driver);

			// effettuo la connessione al database
			Connection connection = DriverManager.getConnection(url,userDB,passwordDB);

			// costruisco la sintassi sql per dialogare con il database
			String sql = "DELETE FROM prodotti WHERE codice=9";

			// istanzio l'oggetto st per dialogare con il database
			Statement st = connection.createStatement();

			// estraggo i dati dal database
			int rows = st.executeUpdate(sql);

			if(rows>0)
				System.out.println("Eliminazione dati avvenuta con successo");
			else
				System.out.println("Eliminazione fallita");
			
			st.close(); // rilascio la risorsa st
			connection.close(); // finalizzo la connessione al database

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
