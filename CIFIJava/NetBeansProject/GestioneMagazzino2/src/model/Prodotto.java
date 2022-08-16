/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author faroe
 */
public class Prodotto {
    
    private int codice;
    //private int idCategoria;
    private Categoria categoria;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int giacenza;

    public Prodotto() {
    }

    public Prodotto(int codice, Categoria categoria, String nome, String descrizione, double prezzo, int giacenza) {
        this.codice = codice;
        this.categoria = categoria;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.giacenza = giacenza;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getGiacenza() {
        return giacenza;
    }

    public void setGiacenza(int giacenza) {
        this.giacenza = giacenza;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "codice=" + codice + ", categoria=" + categoria.getNome() + ", nome=" + nome + ", descrizione=" + descrizione + ", prezzo=" + prezzo + ", giacenza=" + giacenza + '}';
    }
    
    
    
    
}
