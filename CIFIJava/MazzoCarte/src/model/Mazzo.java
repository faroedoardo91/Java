package model;

import java.util.Random;

public class Mazzo {

	private Carta[] mazzo;
	private Valore[] valori = Valore.values();
	private Seme[] semi = Seme.values();
	
	
	public Mazzo() {
		mazzo = new Carta[valori.length*semi.length];		
	}
			
	//creare il mazzo
	public void crea() {
		int k=0;
		for(int i=0;i<semi.length;i++)
			for(int j=0;j<valori.length;j++)
				mazzo[k++] = new Carta(valori[j],semi[i]);		
	}
	
	//mescolare il mazzo
	public void mescola(int mescolamenti) {
		
		Random r = new Random();
		
		Carta tmp = null;
		int pos1,pos2; //posizioni in cui si trovano le due carte da scambiare
		for(int i=0;i<mescolamenti;i++) {
			pos1=r.nextInt(valori.length*semi.length);
			do {
				pos2=r.nextInt(valori.length*semi.length);
			}while(pos1==pos2);
			
			//algoritmo dello scambio
			tmp = mazzo[pos1];
			mazzo[pos1]=mazzo[pos2];
			mazzo[pos2]=tmp;
		}
			
	}

	@Override
	public String toString() {
		String msg = "";
		for (Carta c : mazzo)
			msg += (msg.length() > 0 ? "\n" : "") + c;
		return msg;
	}
	
}
