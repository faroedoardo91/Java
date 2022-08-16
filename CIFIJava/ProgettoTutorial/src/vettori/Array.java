package vettori;

public class Array {

	public static void main(String[] args) {
		
		int numeri[] = {1,3,6,5,11,2};
		
		for (int i = 0; i<numeri.length;i++)
		{
			if(numeri[i] == 11) {
				continue;
			}
			else {
				System.out.println(numeri[i] + "\t");
			}
		}

	}

}
