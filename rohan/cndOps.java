package rohan;
import java.util.Scanner;
public class cndOps {
	public static void main(String args[]){
		System.out.print("Type in your age here: ");
		Scanner user = new Scanner(System.in);
		double age = user.nextDouble(); 
		System.out.println(age >= 39 ? "You are old." : "You are young");
	}
}
