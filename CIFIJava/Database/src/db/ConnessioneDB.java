package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneDB {

	public static void main(String[] args) {
		// Connessione al database
		
		//parametri per accesso al database
		String host = "localhost"; //127.0.0.1
		int port = 3306; //default per mysql
		String dbName="cifi";
		String userDB="cifi";
		String passwordDB="java-2021";
		
		//driver per accesso al database
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//stringa di connessione al database MySQL
		String url="jdbc:mysql://"+host+":"+port+"/"+dbName+"?user="+userDB+"&password="+passwordDB;

		try {
			//load del driver
			Class.forName(driver);
			
			//effettuo la connessione al database
			Connection connection = DriverManager.getConnection(url);
			
			System.out.println("Connessione al database effettuata");
			
			connection.close(); //finalizzo la connessione al database
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

