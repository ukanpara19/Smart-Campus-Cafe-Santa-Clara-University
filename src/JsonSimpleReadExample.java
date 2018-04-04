import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

public class JsonSimpleReadExample {
	
	
	public static String user(String s1 , String s2)
	{
		
	
	

	

		JSONParser parser = new JSONParser();
		String s = "";
		try {

			Object obj = parser.parse(new FileReader("/Users/nirajmotiani/Desktop/JSON/test.json"));

			JSONObject jsonObject = (JSONObject) obj;
			// System.out.println(jsonObject);

			// String name = (String) jsonObject.get("name");
			// System.out.println(name);
			//
			// long age = (Long) jsonObject.get("age");
			// System.out.println(age);

			// loop array
			JSONArray msg = (JSONArray) jsonObject.get("Password");
			Iterator<String> iterator = msg.iterator();
			/*while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}*/

			JSONArray msg1 = (JSONArray) jsonObject.get("Username");
			Iterator<String> iterator1 = msg1.iterator();
			/*while (iterator1.hasNext()) {
				System.out.println(iterator1.next());

			}*/

			JSONArray msg2 = (JSONArray) jsonObject.get("Type");
			Iterator<String> iterator2 = msg2.iterator();
			/*while (iterator2.hasNext()) {
				System.out.println(iterator2.next());

			}*/
			
			while (iterator.hasNext() && iterator1.hasNext() && iterator2.hasNext()) {
				String a = iterator.next();
				String b = iterator1.next();
				//System.out.println(a);
				//System.out.println(b);
				String c = iterator2.next();
				if(a.equals(s2) && b.equals(s1))
				{
					 s = c;
					 break;
				}
				//iterator2.next();
			}
			//System.out.println("s "+s);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(s);
		return s;
		}

	}

