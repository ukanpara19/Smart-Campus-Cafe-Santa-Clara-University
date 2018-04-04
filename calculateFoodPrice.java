
//package actualJSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class calculateFoodPrice implements Runnable{
	Double total;

	public calculateFoodPrice() {
		total = 0d;
	}
	
	
	
	//public void extra(String )

	public void test(String s1) {
		JSONParser parser = new JSONParser();

		try {

			Object obj = parser.parse(new FileReader("/Users/nirajmotiani/Desktop/JSON/foodSunStream.json"));

			JSONObject jsonObject = (JSONObject) obj;
			JSONArray msg1 = (JSONArray) jsonObject.get("Items");
			Iterator<String> iterator1 = msg1.iterator();

			JSONArray msg2 = (JSONArray) jsonObject.get("Prices");
			Iterator<Double> iterator2 = msg2.iterator();
			
			

			while (iterator1.hasNext() && iterator2.hasNext()) {
				String a = iterator1.next();
				System.out.println(iterator2.next());
				Double b = iterator2.next();
				if (a.equals(s1)) {
					total += b;
					break;
				}
			}
			//System.out.println("From the calculate price class "+ total);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}



	//add for the size
	public void addSizePrice(double d) {
		total+=d;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
