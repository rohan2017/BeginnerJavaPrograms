package rohan;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class frame1 {

	private JFrame frame;
	private JTextField txtClickThisButton;
	private JTextField labelmessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		labelmessage = new JTextField();
		labelmessage.setText("You've clicked this button 0 times");
		frame = new JFrame();
		frame.setBounds(100, 100, 478, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPointlessButton = new JButton("pointless button");
		btnPointlessButton.addActionListener(new ActionListener() {
			int pointlesnumber = 0;
			
			public void actionPerformed(ActionEvent e) {
				pointlesnumber++;
				labelmessage.setText("You've clicked this button " + pointlesnumber + " times");
				labelmessage.setBounds(162, 71, 116, 22);
				frame.getContentPane().add(labelmessage);
				labelmessage.setColumns(10);
			}
		});
		btnPointlessButton.setForeground(Color.BLACK);
		btnPointlessButton.setBackground(Color.LIGHT_GRAY);
		btnPointlessButton.setFont(new Font("Gentium Basic", Font.ITALIC, 21));
		btnPointlessButton.setBounds(145, 126, 206, 68);
		frame.getContentPane().add(btnPointlessButton);
		
		txtClickThisButton = new JTextField();
		txtClickThisButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtClickThisButton.setBackground(Color.LIGHT_GRAY);
		txtClickThisButton.setText("click this button ^");
		txtClickThisButton.setBounds(132, 205, 146, 26);
		frame.getContentPane().add(txtClickThisButton);
		txtClickThisButton.setColumns(10);
		
		
	}
}
