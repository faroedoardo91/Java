/*
 * Di ogni brano si conosce la posizione, il titolo, la durata (inserita in secondi)
 */
package audio;

public class Brano {
   
    //attributi
    private int posizione;
    private String titolo;
    private int durata;

    public Brano() {
    }

    public Brano(int posizione, String titolo, int durata) {
        this.posizione = posizione;
        this.titolo = titolo;
        this.durata = durata;
    }

    public int getPosizione() {
        return posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String stampa() {                
        return posizione + " - " + titolo + " - durata: " + MyLibrary.formatDurata(durata);
    }
    
    @Override
    public String toString() {
        return "Brano" + "posizione=" + posizione + ", titolo=" + titolo + ", durata=" + durata + '}';
    }
}
