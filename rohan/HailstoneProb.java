package rohan;

public class HailstoneProb {
	public static void main(String[] args){
		int inputNum = 1234;
		while(inputNum != 1){
			System.out.println(inputNum);
			if(inputNum%2 == 0){
				inputNum = inputNum/2;
			}else{
				inputNum = inputNum * 3 + 1;
			}
		}
		System.out.println(inputNum);
	}
}
