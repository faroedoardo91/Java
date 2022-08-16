package ereditarieta;
import classi.Persona;

public class TestPersone {

	public static void main(String[] args) {
		// Test per oggetti di tipo Persona
		
		Persona p = new Persona("Lorella","Battista");
		
		Studente s = new Studente();
		s.setCognome("Franchino");
		s.setCorso("Linguaggi di Programmazione");
		
		//System.out.println(s);
		
		Docente d = new Docente();
		d.setMateria("Linguaggio Java");
		d.setCognome("Frenceschinello");
		d.setCorso("OOP");
		//System.out.println(d);
		
		//tipo di dato[] identificatore = new tipo di dato[dimensione]
		
		Persona[] elenco = {p,s,d};
		
		for(Persona item : elenco)
			System.out.println(item);
		
		

	}

}
