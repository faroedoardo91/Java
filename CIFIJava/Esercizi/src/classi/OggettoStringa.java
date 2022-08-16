package classi;

public class OggettoStringa {

	public static void main(String[] args)
	{
		String s1 = new String("casa");
		
		String s2 = "casa";
		
		System.out.println("s1: " + s1);

		System.out.println("s2: " + s2);
		
		System.out.println("==");
		if(s1==s2)
			System.out.println("s1 è uguale a s2");
		else
			System.out.println("s1 non è uguale a s2");
		
		System.out.println("equals");
		if(s1.equals(s2)) //si usa per le stringhe altrimenti ti dice che non sono uguali
			System.out.println("s1 è uguale a s2");
		else
			System.out.println("s1 non è uguale a s2");
	}

}
