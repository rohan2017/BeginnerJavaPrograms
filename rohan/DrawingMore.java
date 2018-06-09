package rohan;
import java.awt.*;
import javax.swing.*;

public class DrawingMore extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		//basic line
		g.setColor(Color.BLUE);
		g.drawLine(10, 25, 200, 45);
		//rectangle
		g.setColor(Color.RED);
		g.drawRect(10, 55, 100, 30);
		//oval
		g.setColor(Color.GREEN);
		g.fillOval(10, 95, 100, 30);
		//3d rectangle
		g.setColor(Color.ORANGE);
		g.fill3DRect(10, 160, 100, 50, true);
		//point
		g.setColor(Color.BLACK);
		g.drawImage(null, 10, 200, 10, 240, 10, 280, 10, 320, null);
	}
}
