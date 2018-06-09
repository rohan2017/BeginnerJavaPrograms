package rohan;
import java.util.*;

public class Fliecreator {
	public static void main(String args[]){
		final Formatter x;
		try{
			x = new Formatter("CreatedJavaFile");
			System.out.print("You succesfully created a file!");
		}catch(Exception e){
			System.out.print("Error!");
		}
	}
}
