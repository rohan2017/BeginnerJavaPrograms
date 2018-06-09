package rohan;

public class MainFCreatorWriteToFile {
	public static void main(String[] args){
		FCreatorWriteToFile o = new FCreatorWriteToFile();
		o.openFile();
		o.addRecords();
		o.closeFile();
		
	}
}
