package metodi;

import java.util.ArrayList;

public class metodi2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(10);
		controllaStampa(list);
	}

	public static void controllaStampa(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int element = list.get(i);
			if (element == 20) {
				System.out.println("hello");
			}
		}
		System.out.println(list);
	}

}
