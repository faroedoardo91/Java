package gui;

import javax.swing.JFrame;

public class Finestra {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(800,600);
		f.setLocation(400,200);
		f.setVisible(true);
		
		int a = 1;
		
		 if((a > 2))
		    {
		    System.out.println("piede0");
		    }
		    else if (a==2)
		    {
		      System.out.println("piede1");
		    }
		    
		    else
		    {
		      System.out.print("piede");
		    }
	}

}
