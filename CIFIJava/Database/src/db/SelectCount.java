package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectCount {

	public static void main(String[] args) {
		// Selezione dei dati da una tabella
		
		//parametri per accesso al database
				String host = "localhost"; //127.0.0.1
				int port = 3306; //default per mysql
				String dbName="cifi";
				String userDB="cifi";
				String passwordDB="java-2021";
				
				//driver per accesso al database
				String driver = "com.mysql.cj.jdbc.Driver";
				
				//stringa di connessione al database MySQL
				String url="jdbc:mysql://"+host+":"+port+"/"+dbName;

				try {
					//load del driver
					Class.forName(driver);
					
					//effettuo la connessione al database
					Connection connection = DriverManager.getConnection(url, userDB, passwordDB);
					
					//costruisco la sintassi sql per dialogare con il database
					String sql = "select count(*) as 'NoProdotti' FROM prodotti"; //numero di record presenti nella tabella
					
					//istanzio l'oggetto st per dialogare con il database
					Statement st = connection.createStatement();
					
					//estraggo i dati dal database
					ResultSet rs = st.executeQuery(sql);
					
					if(rs.next())
						System.out.println("Numero di prodotti: "+rs.getInt("NoProdotti"));					
						
					rs.close(); //chiudo il recordset
					st.close(); //rilascio la risorsa st					
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
