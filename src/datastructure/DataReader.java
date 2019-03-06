package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static algorithm.Numbers.printValue;

public class DataReader {

	public static void main(String[] args) throws Exception {

		// ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String path = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		FileReader fr = null;
		BufferedReader br = null;
		//String path = "C:\\Users\\Youcef\\Desktop\\Classss\\MidtermJanuary2019\\src\\data\\self-driving-car.txt ";textFile

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String [] array = new String [10];
		String [] arr = new String [10];

		String st="";
		int count = 0;

		try {
			while ((st = br.readLine()) !=null) {
				System.out.println(st);
				array[count] = st;
				arr[count] = array[count] ;
				count ++;
				}
			System.out.println("the length of the LinkedList is: "+count);
		}

		catch (IOException e) {
			e.printStackTrace();

		}finally {
			if (fr !=null) {
				fr = null;
			}
			if (br != null) {
				br = null;
			}
		}
		System.out.println(" -----*******************----------********************-------------***********************-------");

		System.out.println(count);
		for (int j =0 ; j<count; j++){
			System.out.println("/* -   "+ array[j]);
		}

		System.out.println(" -----*******************----------********************-------------***********************-------");

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		connectToSqlDB.insertDataFromArrayToSqlTable2(array, "DataReader22", "SortingNumbers");
		List<String> numbers10 = connectToSqlDB.readDataBase("DataReader22" , "SortingNumbers"); //readDataBase("DataReader22", "FileData");
		printValue(numbers10);

	}

}


