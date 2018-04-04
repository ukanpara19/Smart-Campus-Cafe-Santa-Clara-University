import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {
	String name,history;
	private String password;
	int id;
	Scanner scan;
	String[] entries;
	final String file =  "/Users/nirajmotiani/eclipse-workspace/Smart Cafe/src/user.csv" ;
	 public User() throws FileNotFoundException {
		 scan = new Scanner(new File(file));
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
	
	private String wrongCredentials(String a,String b) {
		while (scan.hasNextLine()) {
	        String line = scan.nextLine();
	        entries = line.split(",");
	        if(entries[0].equals(a)) {
	        	   if(!entries[1].equals(b)) {
	        		   return "The password entered is incorrect";
	        	   }
	        }
		}
		return "The UserID entered is incorrect";
	}
	
	private void history() {
		
	}
	private void order() {
		
	}
}
