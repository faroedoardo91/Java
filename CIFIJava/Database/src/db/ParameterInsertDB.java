package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ParameterInsertDB {

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
		
		//recupero dati da input
		Scanner tastiera = new Scanner(System.in);
		System.out.print("Codice: ");
		int codice = tastiera.nextInt();	
		tastiera.nextLine(); //svuota il buffer
		System.out.print("Nome: ");
		String nome = tastiera.nextLine();
		System.out.print("Descrizione: ");
		String descrizione = tastiera.nextLine();
		System.out.print("Prezzo: ");
		double prezzo = tastiera.nextDouble();
		System.out.print("Giacenza: ");
		int giacenza = tastiera.nextInt();
		tastiera.close();
		
		try {
			// load del driver
			Class.forName(driver);

			// effettuo la connessione al database
			Connection connection = DriverManager.getConnection(url,userDB,passwordDB);

			// costruisco la sintassi sql per dialogare con il database
			String sql = "INSERT INTO prodotti(codice,nome,descrizione,prezzo,giacenza)"
					+ " VALUES(?,?,?,?,?)";

			// istanzio l'oggetto st per dialogare con il database
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setInt(1, codice);
			ps.setString(2, nome);
			ps.setString(3, descrizione);
			ps.setDouble(4, prezzo);
			ps.setInt(5, giacenza);
			
			
			// estraggo i dati dal database
			int rows = ps.executeUpdate();

			if(rows>0)
				System.out.println("Inserimento dati avvenuto con successo");
			else
				System.out.println("Inserimento fallito");
			
			ps.close(); // rilascio la risorsa st
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
