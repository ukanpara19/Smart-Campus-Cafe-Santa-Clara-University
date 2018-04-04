import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonExample1 {


    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
//        obj.put("name", "mkyong.com");
//        obj.put("age", new Integer(100));

        JSONArray username = new JSONArray();
        username.add("krunal");
        username.add("Niraj");
        username.add("Utsav");

        obj.put("Username", username);

        JSONArray password = new JSONArray();
        password.add("krunal");
        password.add("Niraj");
        password.add("Utsav");

        obj.put("Password", password);
        
        
        JSONArray type = new JSONArray();
        type.add("Admin");
        type.add("User");
        type.add("Admin");

        obj.put("Type", type);
        
        
        
        
        

        try (FileWriter file = new FileWriter("/Users/nirajmotiani/Desktop/JSON/test.json")) {

            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }

	        
	    }

	

		
	

