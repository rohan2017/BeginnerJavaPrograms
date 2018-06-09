package rohan;
import java.awt.*;
import javax.swing.JFrame;

public class DisplayAnImage extends Canvas{
	public static void main(String[] args){
		DisplayAnImage m = new DisplayAnImage();
		JFrame f = new JFrame();
		f.add(m);
		f.setSize(400, 400);
		f.setVisible(true);
	}
	public void paint(Graphics g){
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("cool_cat.jpg");
		g.drawImage(i, 0, 0, this);
	}

}
