package classi;

import java.util.Date;

import enumeratori.Priorita;

public class TestMessaggi {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Messaggi m1 = new Messaggi("","","","");
		//System.out.println("Messaggio1: ");
		
		Messaggi m2 = new Messaggi("", "", "", "");
		System.out.println("Messaggio2: ");
		
		Date d1 = new Date();
		d1.setDate(10);
		d1.setMonth(5);
		d1.setYear(1999);
		m2.setData(d1);
		
		Messaggi m3 = new Messaggi("","","","");
		m3.setPriorita(Priorita.ALTA);
	}

}
