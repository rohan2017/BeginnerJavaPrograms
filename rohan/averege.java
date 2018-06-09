package rohan;
import java.util.Scanner;
public class averege {
	public static void main(String args[]){
		System.out.println("Type in your grades here:");
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		int amount = 10;
		while (counter < amount){
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		average = total/amount;
		System.out.println("Your average is " + average);
	}
}
