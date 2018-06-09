package rohan;
import java.awt.*;
import javax.swing.*;

public class DrawingMoreMain {
	public static void main(String[] args){
		JFrame f = new JFrame ("Drawing More Stuff");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawingMore d = new DrawingMore();
		d.setBackground(Color.WHITE);
		f.add(d);
		f.setSize(500, 270);
		f.setVisible(true);
	}
}
