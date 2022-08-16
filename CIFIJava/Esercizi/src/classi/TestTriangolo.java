package classi;

import java.util.Scanner;

public class TestTriangolo {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		Triangolo t1 = new Triangolo();
		System.out.println("lato1: ");
		t1.setLato1(tastiera.nextDouble());
		// t1.setLato1(2.5);
		System.out.println("lato2: ");
		t1.setLato2(tastiera.nextDouble());
		// t1.setLato2(1.5);
		System.out.println("lato3: ");
		t1.setLato3(tastiera.nextDouble());
		// t1.setLato3(2);

		tastiera.close();

		if (t1.isBuilding()) // se è vero allora stampa questo
		{
			System.out.println("\nDati del triangolo ottenuti");
			System.out.println("perimetro " + t1.perimetro());
			System.out.println("area " + t1.area());
			System.out.println("tipo " + t1.tipo());
			
			System.out.println("\n\nTOSTRING:\n\n" + t1);
			
		} else
			System.out.println("Con i dati inseriti non è possibile costruire il triangolo");

		Triangolo t2 = new Triangolo(1.5,2.5,3);
		System.out.println(t2);
		
		Punto p1 = new Punto(2.5,-1.5);
		Punto p2 = new Punto(-2.5,1.5);
		Punto p3 = new Punto(2.5,1.5);
		
		Triangolo t3 = new Triangolo(p1,p2,p3);
		System.out.println(t3);
		
		Triangolo t4 = new Triangolo(new Punto(),new Punto(4,-5),new Punto(-1,-6));
		System.out.println(t4);		
	}
	
}
