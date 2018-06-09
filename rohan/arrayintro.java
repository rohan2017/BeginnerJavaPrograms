package rohan;

public class arrayintro {
	public static void main (String args[]){
		int rohan[]={1, 2, 3, 4, 5, 6};
		int size = rohan.length;
		int[] nahor;
		nahor = new int[size];
		int counter = 0;
		System.out.println(size);
		System.out.println(rohan[0]+" "+rohan[1]+" "+rohan[2]+" "+rohan[3]+ " "+rohan[4]+ " "+rohan[5]);
		while(size > 0){			
			size = size -1;
			System.out.println("size:"+size+" counter:"+counter+" value in Rohan "+rohan[size]);
			nahor[counter] = rohan[size];
			counter = counter + 1;
		}
		System.out.println(nahor[0]+","+nahor[1]+","+nahor[2]+","+nahor[3]+","+nahor[4]+","+nahor[5]);
	}
}
