package vettori;

import java.util.Scanner;

public class StampaDoppioElemento {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int ArrayNumeriInteri[] = new int[3];
		
		for(int i = 0;i<ArrayNumeriInteri.length;i++)
		{
			System.out.println("Inserisci un numero");
			ArrayNumeriInteri[i] = s.nextInt()*2;
		}
		
		for(int i = 0;i<ArrayNumeriInteri.length;i++)
		{
			System.out.println(ArrayNumeriInteri[i]+ "\t");
		}
		
		s.close();		
	}

}
