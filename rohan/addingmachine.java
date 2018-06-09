package rohan;
import java.util.Scanner;

public class addingmachine {
	public static void main(String args[]){
		Scanner rohan = new Scanner(System.in);
		double num1, num2, answer;
		System.out.print("type in your first number: ");
		num1 = rohan.nextDouble();
		System.out.print("type in your second number: ");
		num2 = rohan.nextDouble();
		answer = num1+num2;
		System.out.println(answer);
	}
}
