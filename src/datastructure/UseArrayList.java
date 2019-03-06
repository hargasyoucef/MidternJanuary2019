package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static algorithm.Numbers.printValue;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		List<String> list = new ArrayList<String>(); // de
		list.add("11");
		list.add("30");
		list.add("20");
		list.add("222");
		list.add("525585");

		list.add(0, "201");

		System.out.println(list.remove(2));
		System.out.println("the size is; " + list.size());
		list.remove(0);


		int[] array = new int[list.size()];
		// Using while loop with Iterator to retrieve data.
		System.out.println("Using while loop with Iterator to retrieve data");
		Iterator it = list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		// Using For Each loop to retrieve data.

		System.out.println(" Using For Each loop to retrieve data.");
		list.forEach((n) -> System.out.println(n));

		// Storing all the sorted data into one of the databases.

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		connectToSqlDB.insertDataFromArrayListToSqlTable3(list, "UseArray", "SortingNumbers");
		try {
			List<String> numbers11 = connectToSqlDB.readDataBase("UseArray", "SortingNumbers"); //readDataBase("DataReader22", "FileData");
			printValue(numbers11);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();

		}


	}
}







