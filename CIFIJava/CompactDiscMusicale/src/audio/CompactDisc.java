package audio;

public class CompactDisc {

	 //attributi
    private String titolo;
    private String artista;
    private String casaDiscografica;
    private double prezzo;
    
    private Brano[] elenco; //associazione tra oggetti: 1..N

    public CompactDisc() {
    }

    public CompactDisc(String titolo, String artista, String casaDiscografica, double prezzo, Brano[] elenco) {
        this.titolo = titolo;
        this.artista = artista;
        this.casaDiscografica = casaDiscografica;
        this.prezzo = prezzo;
        this.elenco = elenco;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCasaDiscografica() {
        return casaDiscografica;
    }

    public void setCasaDiscografica(String casaDiscografica) {
        this.casaDiscografica = casaDiscografica;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public Brano[] getElenco() {
        return elenco;
    }

    public void setElenco(Brano[] elenco) {
        this.elenco = elenco;
    }
    
    public int durata(){
        //restituisce la durata totale in secondi
        /*
        calcolo la durata totale del CD come somma delle singole durate dei brani
        */
       
        int d = 0;
        //for migliorato
        for(Brano brano : elenco)
            d += brano.getDurata();
        return d;
    
    }
    
    public String stampaElencoBrani(){
    
        String txt="";
        
        for(Brano brano : elenco)
            txt += (txt.length()!=0 ? "\n" : "")+brano.stampa();
        
        return txt;
    }

    @Override
    public String toString() {
        return "CompactDisc" 
                + "\ntitolo=" + titolo 
                + "\nartista=" + artista 
                + "\ncasaDiscografica=" + casaDiscografica 
                + "\nprezzo=" + prezzo 
                + "\ndurata totale: " + MyLibrary.formatDurata(durata())
                + "\n\nelenco brani:" 
                + "\n"+stampaElencoBrani() 
                ;
    }
	
}
