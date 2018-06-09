package rohan;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouseinput05142017 extends JFrame{
	private JPanel mousepanel;
	private JLabel statusbar;
	public Mouseinput05142017(){
		super("unimportant title");
		//mouse panel that detects mouse
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		//status bar that displays the state of the mouse
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		//other class that handles the events
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
	}
	private class Handlerclass implements MouseListener, MouseMotionListener{
		//mouse listeners
		public void mouseClicked(MouseEvent event){
			statusbar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
		}
		public void mousePressed(MouseEvent event){
			statusbar.setText("pressed");
		}
		public void mouseReleased(MouseEvent event){
			statusbar.setText("released");
		}
		public void mouseEntered(MouseEvent event){
			statusbar.setText("entered panel");
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event){
			statusbar.setText("exited panel");
			mousepanel.setBackground(Color.WHITE);
		}
		//motion listeners
		public void mouseDragged(MouseEvent event){
			statusbar.setText("dragged");
		}
		public void mouseMoved(MouseEvent event){
			statusbar.setText("moved");
		}
	}
}
