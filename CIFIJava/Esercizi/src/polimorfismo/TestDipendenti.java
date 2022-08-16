package polimorfismo;

public class TestDipendenti {

	public static void main(String[] args) {
		// Dipendenti di una azienda
		// dipendente: nome, cognome, ore lavorate, paga oraria, stipendio() di tipo astratto, toString()
		// amministrativi è un dipendente, ruolo (Contabile => 120.00, RisorseUmane => 150.00, Direttore => 300.00)
		// operaio è un dipendente, ha una mansione (installatore => 175.00, manutentore => 225.00) 
		// operaio specializzato è un operaio che viene mandato in missioni, numero di missioni e indennità di missione
		
		// quante classi devo creare? 5
		// quanti unum pensi di realizzare? 2
		
		//Dipendente d = new Dipendente();
		
		Amministrativo a1 = new Amministrativo();
		a1.setNome("Pietro");
		a1.setCognome("Corbelli");
		a1.setOreLavorate(87);
		a1.setPagaOraria(25.55);
		a1.setRuolo(Ruolo.CONTABILE);
		//System.out.println(a1);
		
		Amministrativo a2 = new Amministrativo();
		a2.setNome("Laura");
		a2.setCognome("Matri");
		a2.setOreLavorate(122);
		a2.setPagaOraria(25.00);
		a2.setRuolo(Ruolo.RISORSEUMANE);
		//System.out.println(a2);
		
		Amministrativo a3 = new Amministrativo();
		a3.setNome("Marco");
		a3.setCognome("Pelletta");
		a3.setOreLavorate(150);
		a3.setPagaOraria(40.00);
		a3.setRuolo(Ruolo.DIRETTORE);
		//System.out.println(a3);
		
		Operaio o1 = new Operaio();
		o1.setNome("Anna");
		o1.setCognome("Palleria");
		o1.setOreLavorate(100);
		o1.setPagaOraria(30);
		o1.setMansione(Mansione.INSTALLATORE);
		//System.out.println(o1);
		
		Operaio o2 = new Operaio();
		o2.setNome("Roberto");
		o2.setCognome("Carlino");
		o2.setOreLavorate(80);
		o2.setPagaOraria(32);
		o2.setMansione(Mansione.MANUTENTORE);
		//System.out.println(o2);
		
		OperaioSpecializzato os1 = new OperaioSpecializzato();
		os1.setNome("Paolo");
		os1.setCognome("Destro");
		os1.setOreLavorate(75);
		os1.setPagaOraria(35);
		os1.setMansione(Mansione.INSTALLATORE);
		os1.setIndennitaMissione(500.00);
		os1.setNumeroMissioni(3);
		//System.out.println(os1);
		
		OperaioSpecializzato os2 = new OperaioSpecializzato();
		os2.setNome("Antonio");
		os2.setCognome("Giustino");
		os2.setOreLavorate(60);
		os2.setPagaOraria(50);
		os2.setMansione(Mansione.MANUTENTORE);
		os2.setIndennitaMissione(600.00);
		os2.setNumeroMissioni(2);
		//System.out.println(os2);
		
		Dipendente[] lista = {a1,a2,a3,o1,o2,os1,os2};

		System.out.println("Elenco dipendenti");
		for(Dipendente d : lista)
			System.out.println(d);
		
		System.out.println("\nElenco amministrativi");
		for(Dipendente d : lista)
			if(d instanceof Amministrativo)
				System.out.println(d);
		
		System.out.println("\nElenco operaio");
		for(Dipendente d : lista)
			if(d instanceof Operaio)
				System.out.println(d);
		
		System.out.println("\nElenco operaio specializzato");
		for(Dipendente d : lista)
			if(d instanceof OperaioSpecializzato)
				System.out.println(d);
		
		System.out.println("\nElenco operaio non specializzato");
		for(Dipendente d : lista)
			if((d instanceof Operaio) && !(d instanceof OperaioSpecializzato))
				System.out.println(d);
		
		System.out.println("\nElenco ruoli degli amministrativi");
		for(Dipendente d : lista) {
			Amministrativo a = null;
			if(d instanceof Amministrativo) {
				a = (Amministrativo)d;
				System.out.println(a.getRuolo());
			}
		}
	}
}
