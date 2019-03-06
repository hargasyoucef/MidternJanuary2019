package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

//		Map<String , String> map = new HashMap<String , String>();
//		map.put("USA", "New York");
//		map.put("UK", "Londo");
//		map.put("Kabily", "Tizi Bejaia");
//		map.put("Bagal", "Dhaka");
//



		List<String> cityOfUSA = new ArrayList<String>();
		cityOfUSA.add("NY");
		cityOfUSA.add("CA");
		cityOfUSA.add("FL");

		List<String> cityOfUK = new ArrayList<String>();
		cityOfUK.add("London");
		cityOfUK.add("Manchester");

		List<String> cityOfCanada = new ArrayList<String>();
		cityOfCanada.add("Montreal");
		cityOfCanada.add("Toronto");

		Map<String , List<String>> map = new LinkedHashMap<String, List<String>>()	;
		map.put("USA" , cityOfUSA);
		map.put("UK", cityOfUK);
		map.put("Canada", cityOfCanada);

		// Use For Each loop to retrieve data.
		for (Map.Entry<String, List<String>> country:map.entrySet() ) {
			System.out.println(country.getKey()+ " " + country.getValue());
		}

		// Using while loop with Iterator to retrieve data.
		System.out.println("Using while loop with Iterator to retrieve data.\n");

		Iterator<Map.Entry<String, List<String>>> itr = map.entrySet().iterator();

		while(itr.hasNext())
		{
			Map.Entry<String, List<String>> entry = itr.next();
			System.out.println("Key = " + entry.getKey() +	", Value = " + entry.getValue());
		}

	}

}
