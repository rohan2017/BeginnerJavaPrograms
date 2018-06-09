package rohan;
import java.util.Scanner; 
public class dowhileloop {
	public static void main(String args[]){
		int numcount = 1;
		Scanner user = new Scanner (System.in);
		System.out.print("type in your starting number:");
		double counter = user.nextDouble();
		System.out.print("type in the increment:");
		double increment = user.nextDouble();
		System.out.print("type in the end number:");
		double end = user.nextDouble();
		System.out.print("\n");
		do{
			System.out.println(counter + "  " + numcount);
			counter = counter + increment;
			numcount++;
		}while(counter <= end);
	}
}
