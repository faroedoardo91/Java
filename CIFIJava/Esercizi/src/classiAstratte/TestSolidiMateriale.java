package classiAstratte;

import enumeratori.Materiali;

public class TestSolidiMateriale {

	public static void main(String[] args) {
		//SolidoMateriale s = null;
		//s = new Solido(1.25);
		
		CuboMateriale c1 = new CuboMateriale(1,Materiali.ACCIAIO);	
		
		CuboMateriale c2 = new CuboMateriale(1,Materiali.ALLUMINIO);
		System.out.println(c1);
		System.out.println(c2);
		
		SferaMateriale s1 = new SferaMateriale(1, Materiali.ACCIAIO);
		System.out.println(s1);

		//Quadrato [] elenco = new Quadrato[10]; tipo di oggetto specifico
		
		SolidoMateriale[] solidi = {c1,c2,s1}; //si può fare per il polimorfismo
		
		for(SolidoMateriale solido : solidi)
			System.out.println(solido.volume()); 
	}

}
