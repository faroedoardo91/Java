/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author faroe
 */
public class DaoProdotto {

    //metodi per accesso ailla tabella categoria    
    private String host = "localhost"; //127.0.0.1
    private int port = 3306; //default per mysql
    private String dbName = "cifi";
    private String userDB = "cifi";
    private String passwordDB = "java-2021";

    //driver per accesso al database
    private String driver = "com.mysql.cj.jdbc.Driver";

    //stringa di connessione al database MySQL
    private String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;

    private Connection connection;

    public DaoProdotto() {

        try {
            //load del driver
            Class.forName(driver);

            //effettuo la connessione al database
            connection = DriverManager.getConnection(url, userDB, passwordDB);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //Operazioni CRUD
    public ArrayList<Prodotto> getAll(int idCategoria) {

        ArrayList<Prodotto> lista = new ArrayList<Prodotto>();

        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Select * FROM prodotti where IdCategoria=?";

            //istanzio l'oggetto st per dialogare con il database
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1,idCategoria);

            //estraggo i dati dal database
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Categoria categoria = (new DaoCategoria()).getById(rs.getInt("IdCategoria"));
                lista.add(new Prodotto(rs.getInt("Codice"), categoria,rs.getString("Nome"), rs.getString("Descrizione"), rs.getDouble("Prezzo"),rs.getInt("Giacenza")));
            }

            rs.close(); //chiudo il recordset
            st.close(); //rilascio la risorsa st					

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return lista;
    }

    public Prodotto getById(int codice) {

        Prodotto prodotto = null;

        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Select * FROM prodotti where codice = ?";

            //istanzio l'oggetto st per dialogare con il database
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, codice);

            //estraggo i dati dal database
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Categoria categoria = (new DaoCategoria()).getById(rs.getInt("IdCategoria"));                
                prodotto = new Prodotto(rs.getInt("Codice"),categoria, rs.getString("Nome"), rs.getString("Descrizione")
                ,rs.getFloat("Prezzo"),rs.getInt("Giacenza"));
            }

            rs.close(); //chiudo il recordset
            st.close(); //rilascio la risorsa st					

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return prodotto;
    }
     
    public boolean insert(Prodotto prodotto) {

        if (prodotto == null) {
            return false;
        }

        int rows = 0; //numero di record modificiati
        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Insert into prodotti(Codice,IdCategoria, Nome, Descrizione,Prezzo,Giacenza) values(?,?,?,?,?,?)";

            //istanzio l'oggetto st per dialogare con il database
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, prodotto.getCodice());
            st.setInt(2, prodotto.getCategoria().getId());
            st.setString(3, prodotto.getNome());
            st.setString(4, prodotto.getDescrizione());
            st.setDouble(5,prodotto.getPrezzo());
            st.setInt(6, prodotto.getGiacenza());
            
            //estraggo i dati dal database
            rows = st.executeUpdate();

            st.close(); //rilascio la risorsa st					

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return rows == 1;
    }

    public boolean update(Prodotto prodotto) {

        if (prodotto == null) {
            return false;
        }

        int rows = 0; //numero di record modificiati
        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Update prodotti set IdCategoria=?,Nome=?, Descrizione=?,Prezzo=?,Giacenza=? where codice = ?";

            //istanzio l'oggetto st per dialogare con il database
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, prodotto.getCategoria().getId());
            st.setString(2, prodotto.getNome());
            st.setString(3, prodotto.getDescrizione());         
            st.setDouble(4,prodotto.getPrezzo());
            st.setInt(5, prodotto.getGiacenza());            
            st.setInt(6, prodotto.getCodice());

            //estraggo i dati dal database
            rows = st.executeUpdate();

            st.close(); //rilascio la risorsa st					

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return rows == 1;
    }

    public boolean delete(int codice) {

        int rows = 0; //numero di record modificiati
        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Delete FROM prodotti where codice = ?";

            //istanzio l'oggetto st per dialogare con il database
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, codice);

            //estraggo i dati dal database
            rows = st.executeUpdate();

            st.close(); //rilascio la risorsa st					

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return rows == 1;
    }

   public ArrayList<Prodotto> getAll() {

        ArrayList<Prodotto> lista = new ArrayList<Prodotto>();

        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Select * FROM prodotti";

            //istanza dell'oggetto st che dialoga con il db
            Statement st = connection.createStatement();

            //estrazione dei dati dal db
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Categoria categoria = (new DaoCategoria()).getById(rs.getInt("IdCategoria"));
                lista.add(new Prodotto(rs.getInt("Codice"), categoria,rs.getString("Nome"), rs.getString("Descrizione"), rs.getDouble("Prezzo"),rs.getInt("Giacenza")));
            }

            rs.close(); //chiusura del recordset
            st.close(); //rilascio della risorsa st

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return lista;
    }
}
