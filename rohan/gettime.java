package rohan;

import java.util.Calendar;

public class gettime {
	public static void main(String args[]){
		int second;
		int minute;
		int hour;
		int counter = 1;
		while (counter > 0){
			Calendar cal = Calendar.getInstance();
			second = (cal.get(Calendar.SECOND));
			minute = (cal.get(Calendar.MINUTE));
			hour = (cal.get(Calendar.HOUR));
			System.out.println(hour+":"+minute+":"+second);
			
		}
	}
}
