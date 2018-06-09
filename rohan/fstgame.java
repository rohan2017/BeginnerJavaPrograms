package rohan;
import java.util.Scanner;
public class fstgame {
public static void main(String args[]){
	Scanner user = new Scanner(System.in);
	double yn = 1;
	System.out.println("You are flying around the world,\nyou are on the runway. Do you want to take off?(1/0):");
	yn = user.nextDouble();
	if (yn == 1){
		System.out.println("you speed down the runway and head over the ocean");
		System.out.println("you are halfway across the Atlantic.\nYou are low on fuel.\nDo You want to turn back?");
		yn = user.nextDouble();
		if (yn == 0){
			System.out.println("You just make it to africa");
			// I'm going to add more stuff
		}else{
			System.out.println("GAME OVER");
		}
		}else{
			System.out.println("GAME OVER");
		}
	}
}
