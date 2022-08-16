package classi;

import java.util.Date;
import java.util.Scanner;

import enumeratori.Priorita;

public class Messaggi 
{
	private String mittente, destinatario, oggetto, testoDelMessaggio;
	
	private Priorita priorita;
	private Date data;

	Scanner tastiera = new Scanner(System.in);
	
	String mitt = tastiera.toString();
	
	

	public Messaggi(String mittente, String destinatario, String oggetto, String testoDelMessaggio) {
		super();
		this.mittente = mittente;
		this.destinatario = destinatario;
		this.oggetto = oggetto;
		this.testoDelMessaggio = testoDelMessaggio;
		this.data= new Date();
		this.priorita =Priorita.NORMALE;
	}

	public String getMittente() {
		return mittente;
	}

	public void setMittente(String mittente) {
		this.mittente = mittente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getOggetto() {
		return oggetto;
	}

	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

	public String getTestoDelMessaggio() {
		return testoDelMessaggio;
	}

	public void setTestoDelMessaggio(String testoDelMessaggio) {
		this.testoDelMessaggio = testoDelMessaggio;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Priorita getPriorita() {
		return priorita;
	}

	public void setPriorita(Priorita priorita) {
		this.priorita = priorita;
	}
	
	@Override
	public String toString() {
		return "Messaggi [mittente=" + mittente + ", destinatario=" + destinatario + ", oggetto=" + oggetto
				+ ", testoDelMessaggio=" + testoDelMessaggio + ", data=" + data + ", priorita=" + priorita + "]";
	}
	
	
	
    
	
	
	
	
	
}
