package ereditarieta;

public class TestQuadrilatero {

	public static void main(String[] args) {
		//test oggetti
		
		Quadrilatero q1 = new Quadrilatero (1.5,1.25,2.5,3);
		System.out.println("Quadrilatero :" + q1);
		
		Rettangolo r1 = new Rettangolo (1.25,2);
		System.out.println("Rettangolo :" + r1);		
		
		Quadrato q2 = new Quadrato (2.5);
		System.out.println(q2);

	}

}
