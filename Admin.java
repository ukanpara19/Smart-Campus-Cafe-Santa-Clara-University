import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Admin {
	String name;
	String id;
	private String password;
	Scanner scan;
	String[] entries;
	Food f;
	final String file =  "/Users/nirajmotiani/eclipse-workspace/Smart Cafe/src/admin.csv" ;
	 public Admin() throws FileNotFoundException {
		 scan = new Scanner(new File(file));
		 f = new Food();
	 }
	 boolean checkPassword(String a,String b) {
			while (scan.hasNextLine()) {
		        String line = scan.nextLine();
		        entries = line.split(",");
		        System.out.println(entries);
		        if(entries[0].equals(a)) {
		        	   if(entries[1].equals(b)) 
		        		   return true;
		        	   else
		        		   return false;
		        }
			}
			
			return false;
		}
	public void addFood() {
		
	}
	public void status() {
		
	}
	public void addUser() {
	
	}
	public void deleteUser() {
		
	}
}
