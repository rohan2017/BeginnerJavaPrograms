package rohan;

public class cnstrctr_othrclass {
	private String name;
	public cnstrctr_othrclass(String petname){
		name = petname;
	}
	public void SetName(String name1){
		name = name1 + "blah blah";
	}
	public String getName(){
		return name;
	}
	public void saying(){
		System.out.printf("your name is %s \n", getName());
	}
}
	

