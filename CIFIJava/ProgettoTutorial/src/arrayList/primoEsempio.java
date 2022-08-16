package arrayList;

import java.util.ArrayList;

public class primoEsempio {

	public static void main(String[] args) {
		
		ArrayList<String> v = new ArrayList<String>();
		v.add("Pollice");
		v.add("Indice");
		v.add("Anulare");
		v.add(2,"Medio");
		v.add("Mignolo");
		
		System.out.println("n di elementi di v: " + v.size());
		
		for(int i=0; i<v.size();i++)
		{
			System.out.println("Elemento " + i + ": " + v.get(i));
		}
		
		System.out.println("\n" + "Primo elemento: " + v.get(0));
		System.out.println("\n" + "Ultimo elemento: " + v.get(v.size()-1));
		
	}
	

}
