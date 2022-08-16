package classi;

import java.time.LocalDate;

import enumeratori.Sesso;

public class TestPersona {

	public static void main(String[] args) {
		// Test per oggetti Persona
		
		Persona pino = new Persona();
		
		Persona lino = new Persona("Lino","Delillo");
		
		Persona tina = new Persona("Tina","Raspini",LocalDate.of(2000,2,25),"Torino");
		
		Persona gina = new Persona("Gina","Lagostina",LocalDate.of(2002,8,2),"Verona", Sesso.F);
		
		System.out.println(pino);
		System.out.println(lino);
		System.out.println(tina);
		System.out.println(gina);

	}

}
