package classi;

public class TestQuadrato {

	public static void main(String[] args)
	{
		// test per oggetti di tipo quadrato
		
		Quadrato q1 = new Quadrato(); //questo è instanziato, è il costruttore
		q1.lato = 1.75;
		
		System.out.println("Lato di q1 " + q1.lato);
		System.out.println("Perimetro " + q1.perimetro());
		System.out.println("Area " + q1.area());
		System.out.println("Diagonale " + q1.diagonale());
		
		System.out.println();
		
		Quadrato q2 = new Quadrato(); // questo no
		q2.lato = 1.25;
		System.out.println("Lato di q2 " + q2.lato);
		System.out.println("Perimetro " + q2.perimetro());
		System.out.println("Area " + q2.area());
		System.out.println("Diagonale " + q2.diagonale());
		
		q2=q1;
		
		q2.lato = 1;
		
		System.out.println("Lato q1: " + q1.lato);
		System.out.println("Lato q2: " + q2.lato);

	}

}
