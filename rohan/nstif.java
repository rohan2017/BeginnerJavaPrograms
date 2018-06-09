package rohan;
import java.util.Scanner;
public class nstif {
	public static void main(String args[]){
		System.out.print("type in a number:");
		Scanner user = new Scanner(System.in);
		double age = user.nextDouble();
		if (age < 9000){
			System.out.println("It's not over 9000.");
		}else{
			System.out.println("It's over 9000");
			if (age > 10000){
				System.out.println("It's over 10000");
			}
		}
	}
}
