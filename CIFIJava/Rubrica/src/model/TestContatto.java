package model;

public class TestContatto {

	public static void main(String[] args) {
				
		Contatto contatto1 = new Contatto("Gianfranco","Faro");
		contatto1.setIndirizzo("Via MiSonoDimenticato");
		contatto1.setTelefono("2222222222");
		contatto1.setEmail("faro.faro@edo.it");
		
		Contatto contatto = new Contatto("Faro","Edoardo","Via NonLoSo","3333333333","edo.faro@faro.it");
		
		System.out.println(contatto);
		System.out.println(contatto1);
		
	}

}
