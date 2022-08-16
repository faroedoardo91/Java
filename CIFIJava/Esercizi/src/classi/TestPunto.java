package classi;

public class TestPunto {

	public static void main(String[] args) 
	{
		Punto p = new Punto("P",4.5,-1.25);
		System.out.println(p);
		
		Punto q = new Punto(-1.5,2.75);
		System.out.println(q);
		
		Punto r = new Punto();
		System.out.println(r);		
		
		System.out.println("OP="+p.distanza());
		System.out.println("OP="+q.distanza());
		
		System.out.println("PQ="+p.distanza(q));
		System.out.println("QP="+q.distanza(p));			
	}

}
