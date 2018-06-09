package rohan;
import java.awt.*;
import javax.swing.*;

import java.util.Scanner; //I will make it so you can type the equation in
public class Grapherotherclass extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		int y = 0;
		int x = 0; 
		int x1 = -200;
		int y1 = x1*x1*x1*x1;
		g.setColor(Color.BLACK);
		g.drawLine(850, 0, 850, 1100);
		g.drawLine(0, 550, 1700, 550);
		for(x = -200; x<=200; x++){
			//equation
			y=x*x*x*x;
			g.setColor(Color.RED);
			g.drawLine((x1 + 850), (-y1 + 550), (x + 850), (-y + 550));
			y1 = y;
			x1 = x;
		}
	}
}
 