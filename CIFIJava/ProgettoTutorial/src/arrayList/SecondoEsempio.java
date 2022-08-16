package arrayList;

import java.util.ArrayList;

public class SecondoEsempio {

	public static void main(String[] args) {
		
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Red");
		ls.add("Green");
		ls.add("Orange");
		ls.add("White");
		ls.add("Black");
		
		for(String element : ls) { //per tutte le stringhe chiamate element allora fai qualcosa
			System.out.println(element);
			/*
			
		ArrayList<String> ls1 = new ArrayList<String>();
			ls1.add("Red");
			ls1.add("Green");
			ls1.add("Orange");
			ls1.add("White");
			ls1.add("Black");
				
		System.out.println(ls1);
		
		ArrayList<String> a = new ArrayList<String>();
		a.addAll(ls);
		a.addAll(ls1);

		System.out.println("arraylist a: " + a);
		
	*/	
	}

}
}
