package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ParameterSelectDB {

	public static void main(String[] args) {
		// Uso delle query parametriche per accesso ai dati verso il DBMS

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

		Scanner tastiera = new Scanner(System.in);
		System.out.print("Inf: ");
		int inf = tastiera.nextInt();	
		System.out.print("Sup: ");
		int sup = tastiera.nextInt();
		tastiera.close();
		
		try {
			//load del driver
			Class.forName(driver);
			
			//effettuo la connessione al database
			Connection connection = DriverManager.getConnection(url,userDB,passwordDB);
			
			//costruisco la sintassi sql per dialogare con il database
			String sql = "select * FROM prodotti WHERE giacenza>=? and giacenza<=?";
			
			//istanzio l'oggetto st per dialogare con il database
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, inf);			
			ps.setInt(2, sup);
			//estraggo i dati dal database
			ResultSet rs = ps.executeQuery();
			
			System.out.println("codice\tnome\tdescrizione\tprezzo\tgiacenza");
			while(rs.next()) {
				int codice = rs.getInt("Codice");
				String nome=rs.getString("Nome");
				String descrizione=rs.getString("Descrizione");
				double prezzo=rs.getDouble("Prezzo");
				int giacenza = rs.getInt("Giacenza");
				
				System.out.println(codice+"\t"+nome+"\t"+descrizione+"\t"+prezzo+"\t"+giacenza);
			}
			
			rs.close(); //chiudo il recordset
			ps.close(); //rilascio la risorsa st					
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