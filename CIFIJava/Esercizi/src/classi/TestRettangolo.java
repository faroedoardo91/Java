package classi;

public class TestRettangolo {

	public static void main(String[] args) 
	{
		Rettangolo rettangolo1 = new Rettangolo();
		rettangolo1.setBase(1);
		//rettangolo1.base = 1;
		rettangolo1.setAltezza(2);
		
		//System.out.println("Base " + rettangolo1.base);
		//System.out.println("Altezza " + rettangolo1.altezza);
		System.out.println(rettangolo1.stampa());
		System.out.println(rettangolo1);
		System.out.println(rettangolo1.toString());
		
	}

}
