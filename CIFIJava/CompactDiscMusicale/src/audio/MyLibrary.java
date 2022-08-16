package audio;

public class MyLibrary {
//classe di metodi statici
    
    public static String formatDurata(int secondi) {
        // ricevo secondi e restituisco il format hh:mm:ss es. 2:33

        int h = secondi / 3600; //numero di ore
        int m = (secondi % 3600) / 60;
        int s = (secondi % 3600) % 60;

        //es. 3725 secondi
        // h = 1
        // m = (3725 % 3600)/60 = 2
        // s = 125 % 60 = 5 
        
        //format => 1:02:05
        
        
        String format = "";

        if (h != 0) {
            format += h + ":" + (m < 10 ? "0" : "");
        }

        format += m + ":" + (s < 10 ? "0" : "") + s;

        return format;

    }	
}
