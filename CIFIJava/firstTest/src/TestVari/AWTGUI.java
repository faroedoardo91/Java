package TestVari;

import java.awt.*;

public class AWTGUI {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		TextArea ta = new TextArea("Java AWT",
		4,10,TextArea.SCROLLBARS_VERTICAL_ONLY);
		frame.add(ta);
		frame.pack();
		frame.setVisible(true);
		
		frame.setBackground(Color.BLUE);


	}

}
