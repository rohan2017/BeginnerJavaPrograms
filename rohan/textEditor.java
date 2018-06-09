package rohan;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class textEditor {
	private Formatter x;
	public void openFile(){
		try{
			x = new Formatter("RohansJavaEditor.txt");
			System.out.println("File created!");
		}
		catch(Exception e){
			System.out.println("Error!");
		}
	}
	public void addRecords(){
		Scanner textinput = new Scanner(System.in);
		x.format(textinput);
	}
	public void closeFile(){
		x.close();
	}
}
