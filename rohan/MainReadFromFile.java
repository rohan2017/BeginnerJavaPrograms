package rohan;

public class MainReadFromFile {
	public static void main(String[] args){
		Readfromfile r = new Readfromfile();
		r.openFile();
		r.readFile();
		r.closeFile();
	}
}
