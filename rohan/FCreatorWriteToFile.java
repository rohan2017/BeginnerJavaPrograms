package rohan;
import java.io.*;
import java.lang.*;
import java.util.*;

public class FCreatorWriteToFile {
	private Formatter x;
	public void openFile(){
		try{
			x = new Formatter("TheMostEpicJavaFileEver.txt");
			System.out.println("File created!");
		}
		catch(Exception e){
			System.out.println("Error!");
		}
	}
	public void addRecords(){
		x.format("%s%s%s", "2 ", "Rohan ", "Bandaru");
	}
	public void closeFile(){
		x.close();
	}
}
