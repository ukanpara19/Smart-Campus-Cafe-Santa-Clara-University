import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
	String name;
	String location,timing,specialities;
	boolean status;
	
	ArrayList<String[]> a;
	final String file =  "/Users/nirajmotiani/eclipse-workspace/Smart Cafe/src/cafe.csv" ;
	Scanner scan;
	
	public Cafe() {
		a = new ArrayList<>();;
	}
	public void addFood() {
		String[] entries = null;
		while (scan.hasNextLine()) {
	        String line = scan.nextLine();
	        entries = line.split(",");
	        
		}
	}
	public void deleteFood() {
		
	}
	public void takeOrder() {
		
	}
	public void payment() {
		
	}
}
