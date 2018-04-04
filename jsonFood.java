
//package actualJSON;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jsonFood {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		// obj.put("name", "mkyong.com");
		// obj.put("age", new Integer(100));
		// Items
		JSONArray Items = new JSONArray();
		Items.add("Freshbrewedcoffee");
		Items.add("mocha");
		Items.add("AppleCider");
		Items.add("Latte");
		Items.add("WhiteMocha");
		Items.add("HotChocolate");
		Items.add("IcedCoffee");
		Items.add("IcedMocha");
		Items.add("ItalianSoda");
		Items.add("lemonade");
		Items.add("IcedWhiteMocha");
		Items.add("IcedTea");
		Items.add("Bagel");
		Items.add("Muffin");
		Items.add("BearClaw");
		Items.add("Scone");
		Items.add("Donut");
		Items.add("AppleFritter");
		Items.add("Pizza");
		Items.add("Burger");
		Items.add("Sandwiches");

		// Prices
		obj.put("Items", Items);

		JSONArray prices = new JSONArray();
		prices.add(new Double(2.05));
		prices.add(new Double(4.35));
		prices.add(new Double(2.49));
		prices.add(new Double(3.35));
		prices.add(new Double(4.05));
		prices.add(new Double(2.3));
		prices.add(new Double(2.55));
		prices.add(new Double(3.45));
		prices.add(new Double(2.45));
		prices.add(new Double(2.05));
		prices.add(new Double(4.05));
		prices.add(new Double(1.95));
		prices.add(new Double(1.59));
		prices.add(new Double(2.99));
		prices.add(new Double(3.29));
		prices.add(new Double(3.09));
		prices.add(new Double(2.56));
		prices.add(new Double(3.05));
		prices.add(new Double(7.99));
		prices.add(new Double(5.99));
		prices.add(new Double(6.25));
		

		obj.put("Prices", prices);

		try (FileWriter file = new FileWriter("/Users/nirajmotiani/Desktop/JSON/foodSunStream.json")) {

			file.write(obj.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(obj);

	}

}
