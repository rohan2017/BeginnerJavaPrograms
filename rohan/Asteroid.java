package rohan;
import java.awt.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
 
public class Asteroid extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		//3d rectangle or asteroid
		for(int counter = 0; counter<=500; counter++){
			g.setColor(Color.RED);
			g.fill3DRect(250, counter, 50, 50, true);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resetScreen(g);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void resetScreen(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(250, 250, 500, 500);
	}
}

