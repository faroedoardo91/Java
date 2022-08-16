package interfaccia;

public class TestAtleti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atleta a = new Atleta();
		a.setNome("Antonello");
		a.setCognome("Barriche");
		a.setPettorina(3);
		System.out.println(a);
		
		Calciatore c1 = new Calciatore("Antonio","Pasquino",12,"Juventus",5,10);
		System.out.println(c1);
		System.out.println(c1.getClass());
		
		//blocco che consente di monitore le anomalie che vengono generate a runtime
		try {
			//Object o1 = c1.clone();
			/*
			Calciatore c2 = null;
			if(o1 instanceof Calciatore)
				c2 = (Calciatore)o1;
			*/
			
			Calciatore c2 = (Calciatore)c1.clone();
			c2.setNome("Pino");
			c2.setCognome("Dellino");
			c2.setPartiteGiocate(15);
			
			System.out.print("equals: ");
			if(c1.equals(c2))
				System.out.println("uguali");
			else
				System.out.println("diversi");
			
			
			if(c1.compareTo(c2)==1)
				System.out.println("compareTo: "+c1.getCognome() + " è 'maggiore' rispetto a "+c2.getCognome());
			
			
		}catch(CloneNotSupportedException e) {
			System.out.println("Si è verificato un errore!");
			System.out.println("Messaggio: "+e.getMessage());
			
		}
	}

}
