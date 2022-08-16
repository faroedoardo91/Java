package classiAstratte;

public class TestSolidi {

	public static void main(String[] args) {
		
		//Solido s = null;
		//s = new Solido(1.25);
	

	//acciaio -> peso specifico 7.85
	
	Cubo c1 = new Cubo(1,7.85); //sono il lato e il peso specifico
	
	//alluminio -> peso specifico 2.6
	Cubo c2 = new Cubo(1,2.6);
	
	
	//materiale -> nome e peso specifico
	System.out.println(c1);
	System.out.println(c2);
	
	Sfera s1 = new Sfera(1,7.8);
	System.out.println(s1);

	}
}
