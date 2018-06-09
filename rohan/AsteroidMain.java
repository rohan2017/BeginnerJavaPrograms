package rohan;
import java.awt.*;
import javax.swing.*;
 
public class AsteroidMain {
	public static void main(String[] args){
		JFrame f = new JFrame ("ASTEROID");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Asteroid d = new Asteroid();
		d.setBackground(Color.BLACK);
		f.add(d);
		f.setSize(500, 500);
		f.setVisible(true);
	}
}
