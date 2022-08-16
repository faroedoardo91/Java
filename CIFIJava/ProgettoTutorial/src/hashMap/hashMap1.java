package hashMap;

import java.util.HashMap;

public class hashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap = new HashMap<Integer, String>();
        hmap.put(22, "Edo");
        hmap.put(11, "Fra1");
        hmap.put(2, "Fra2");
        hmap.put(3, "Fra4");
        hmap.put(44, "Fra3");
		
        for(Integer i: hmap.keySet()) {
        	System.out.print("chiave " + i);
        	
        	System.out.println(" valore " + hmap.get(i));
        	
        }
	}

}
