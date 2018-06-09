package rohan;
import javax.swing.JOptionPane;

public class AddingGUItest05132017 {
	public static void main(String[] args){
		String fnum = JOptionPane.showInputDialog("Enter you're first number:");
		String snum = JOptionPane.showInputDialog("Enter you're seond number:");
		int num1 = Integer.parseInt(fnum);
		int num2 = Integer.parseInt(snum);
		int sum = num1 + num2;
		JOptionPane.showMessageDialog(null, "The sum is " +sum, "Unimportant title", JOptionPane.PLAIN_MESSAGE);
	}
}
