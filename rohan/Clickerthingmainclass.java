package rohan;
import javax.swing.*;
import java.awt.*;
//DO NOT RUN THIS IT DOESN"T CLOSE
public class Clickerthingmainclass {
	public static void main(String[] args){
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clickerthing p = new clickerthing();
		p.setBackground(Color.WHITE);
		f.add(p);
		f.setSize(500, 270);
		f.setVisible(true);
		
	}
}
