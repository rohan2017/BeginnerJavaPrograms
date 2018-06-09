package rohan;
import java.util.Random;

public class dice_roller {
	public static void main(String args[]){
		Random dice = new Random();
		int number;
		number = 1 + dice.nextInt(6);
		System.out.println("...rolling dice :: ...");
		for(int counter = 1; counter<=10000; counter++){
			System.out.println("...rolling dice :: ...");
		}
		for(int counter = 1; counter<=1000; counter++){
			System.out.println("\n");
		}
		System.out.println("Your roll was " + number);
	}
}
