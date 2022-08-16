package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class hashMap3 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap = new HashMap<Integer, String>();
		Scanner ss = new Scanner(System.in);
		Scanner sv = new Scanner(System.in);
		
		Integer id = 0;
		for(int i = 0; i<3; i++) {
			System.out.println("Inserisci id: ");
			id= ss.nextInt();
			System.out.println("Inserisci nome: ");
			String nome = sv.nextLine();
			hmap.put(id, nome);
		}
		
		for(Integer ids: hmap.keySet()) {
			System.out.println("ID: " + ids + "\t" + "Nome: " + hmap.get(ids));
		}
		
		hmap.put(22, "Edo");
        hmap.put(11, "Fra1");
        hmap.put(2, "Fra2");
        hmap.put(3, "Fra4");
        hmap.put(44, "Fra3");
        
        ss.close();
        sv.close();
		
	}

}
