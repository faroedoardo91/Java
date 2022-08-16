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
public class DaoCategoria {

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

    public DaoCategoria() {

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
    public ArrayList<Categoria> getAll() {

        ArrayList<Categoria> lista = new ArrayList<Categoria>();

        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Select * FROM categorie";

            //istanzio l'oggetto st per dialogare con il database
            Statement st = connection.createStatement();

            //estraggo i dati dal database
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                lista.add(new Categoria(rs.getInt("Id"), rs.getString("Nome"), rs.getString("Descrizione")));
            }

            rs.close(); //chiudo il recordset
            st.close(); //rilascio la risorsa st					

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return lista;
    }

    public Categoria getById(int id) {

        Categoria categoria = null;

        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Select * FROM categorie where id = ?";

            //istanzio l'oggetto st per dialogare con il database
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);

            //estraggo i dati dal database
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                categoria = new Categoria(rs.getInt("Id"), rs.getString("Nome"), rs.getString("Descrizione"));
            }

            rs.close(); //chiudo il recordset
            st.close(); //rilascio la risorsa st					

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return categoria;
    }
    
    public Categoria getByNome(String nome) {

        Categoria categoria = null;

        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Select * FROM categorie where nome = ?";

            //istanzio l'oggetto st per dialogare con il database
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, nome);

            //estraggo i dati dal database
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                categoria = new Categoria(rs.getInt("Id"), rs.getString("Nome"), rs.getString("Descrizione"));
            }

            rs.close(); //chiudo il recordset
            st.close(); //rilascio la risorsa st					

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return categoria;
    }
     
    public boolean insert(Categoria categoria) {

        if (categoria == null) {
            return false;
        }

        int rows = 0; //numero di record modificiati
        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Insert into categorie(Nome, Descrizione) values(?,?)";

            //istanzio l'oggetto st per dialogare con il database
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, categoria.getNome());
            st.setString(2, categoria.getDescrizione());

            //estraggo i dati dal database
            rows = st.executeUpdate();

            st.close(); //rilascio la risorsa st					

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return rows == 1;
    }

    public boolean update(Categoria categoria) {

        if (categoria == null) {
            return false;
        }

        int rows = 0; //numero di record modificiati
        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Update Categorie set nome=?, Descrizione=? where id = ?";

            //istanzio l'oggetto st per dialogare con il database
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, categoria.getNome());
            st.setString(2, categoria.getDescrizione());
            st.setInt(3, categoria.getId());

            //estraggo i dati dal database
            rows = st.executeUpdate();

            st.close(); //rilascio la risorsa st					

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return rows == 1;
    }

    public boolean delete(int id) {

        int rows = 0; //numero di record modificiati
        try {
            //costruisco la sintassi sql per dialogare con il database
            String sql = "Delete FROM categorie where id = ?";

            //istanzio l'oggetto st per dialogare con il database
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);

            //estraggo i dati dal database
            rows = st.executeUpdate();

            st.close(); //rilascio la risorsa st					

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return rows == 1;
    }

}
