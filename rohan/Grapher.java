package rohan;
import java.awt.*;
import javax.swing.*;

public class Grapher extends JPanel{
	public static void main(String[] args){
		JFrame h = new JFrame ("Graphing calc");
		h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Grapherotherclass b = new Grapherotherclass();
		b.setBackground(Color.WHITE);
		h.add(b);
		h.setSize(1700, 1100);
		h.setVisible(true);
	}
}
 