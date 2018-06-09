package rohan;

public class sdv {
	public static void main(String args[]){
		System.out.println(choose(4,3));
	}
	public static long choose(long total, long choose){
	    if(total < choose)
	        return 0;
	    if(choose == 0 || choose == total)
	        return 1;
	    return choose(total-1,choose-1)+choose(total-1,choose);
	}
}
