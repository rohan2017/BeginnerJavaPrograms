package rohan;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

public class SpamClick {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpamClick window = new SpamClick();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SpamClick() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JTextArea textArea = new JTextArea();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClick = new JButton("CLICK!!");
		btnClick.addActionListener(new ActionListener(){
			int height = 110;
			public void actionPerformed(ActionEvent e) {
			//button clicked
				
				height = height - 3;
				textArea.setEditable(false);
				textArea.setBackground(new Color(173, 216, 230));
				textArea.setFont(new Font("SansSerif", Font.BOLD, 14));
				textArea.setText("-('^')-");
				textArea.setBounds(204, height, 38, 22);
				frame.getContentPane().add(textArea);
			}
		
		});
		btnClick.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 35));
		btnClick.setBackground(new Color(255, 0, 0));
		btnClick.setBounds(148, 135, 178, 72);
		frame.getContentPane().add(btnClick);
		

		

	
		
		
		
	
			
	}
}
