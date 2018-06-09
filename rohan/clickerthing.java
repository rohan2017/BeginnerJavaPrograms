package rohan;
//DO NOT RUN THIS IT DOES NOT CLOSE
import java.awt.*;
import javax.swing.*;
public class clickerthing extends JPanel{
	public void paintComponent(Graphics g){
		int lives = 1;
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		int xpos = 100;
		int ypos = 100;
		while(lives > 0){
			g.setColor(Color.YELLOW);
			g.fillOval(xpos, ypos, 50, 50);
			
		}
	
	}
}
