package rohan;

public class compoundintrest {
	public static void main(String args[]){
		double amount;
		double principal = 10000;
		double rate = 0.01;
		for(int day = 1; day<=200; day++){
			amount = principal*Math.pow(1+rate, day);
			System.out.println("day " + day + " ....... " + amount);
		}
	}
}
