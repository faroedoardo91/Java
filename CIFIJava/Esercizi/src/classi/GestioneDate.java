package classi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GestioneDate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		//versione sdk 1.0
		Date oggi = new Date();
		System.out.println(oggi);
		
		String format = oggi.getDay()+ "/" + oggi.getMonth()+ "/"+ oggi.getYear();
		System.out.println(format);
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("dd/MM/yyyu");
		System.out.println(sdf.format(oggi));
		
		Date d1 = new Date(1999,5,23);
		System.out.println(sdf.format(d1));
		
		//versione sdk 1.1
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println("anno: " + cal.get(Calendar.YEAR));
		System.out.println("mese: " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("anno: " + cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("dd//MM/yyyy HH:mm:ss");
		System.out.println("Gregorian Calendar => oggi: " + sdf.format(cal.getTime()));
		
		GregorianCalendar gcal = new GregorianCalendar(2008,10,26,15,45,23);//anno,mese,giorno,ore,minut,secondi
		//gcal.setLenient(false);
		gcal.add(Calendar.MONTH, 3);
		System.out.println("Gregorian Calendar => oggi: " + sdf.format(gcal.getTime()));
		
		//Versione sdk 1.8
		//LocalDate
		LocalDate oggiLD = LocalDate.now();
		System.out.println("oggi: " + oggiLD.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("ieri: " + LocalDate.now().plusDays(-1));
		System.out.println("domani: " + LocalDate.now().plusDays(1));
		
		LocalDate d = LocalDate.of(2008, 5, 21);
		System.out.println("data: " + d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

}
