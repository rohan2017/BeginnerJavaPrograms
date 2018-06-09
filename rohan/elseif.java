package rohan;
import java.util.Scanner;
public class elseif {
	public static void main(String args[]){
		System.out.print("Type in your age here: ");
		Scanner user = new Scanner(System.in);
		double age = user.nextDouble(); 
		if (age >= 60){
			System.out.println("Congrats, your a senior citizen.");
		}
		else if (age >= 50){
			System.out.println("You're in your fifties.");
		}
		else if (age >= 40){
			System.out.println("You're in your fourties.");
		}
		else if (age >= 30){
			System.out.println("You're in your thirties.");
		}
		else{
			System.out.println("You're age is less than 30.\nYou've got a long way to go!");
		}
	}
}
