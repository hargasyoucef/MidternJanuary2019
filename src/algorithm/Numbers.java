package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[100];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();

		algo.selectionSort(num);

		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);

		/****************************************************************************************************************/

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Insertion_sort", "SortingNumbers");
		List<String> number2 = connectToSqlDB.readDataBase("Insertion_sort", "SortingNumbers");
		printValue(number2);
		int n2 = num.length;
		randomize (num, n2);
		//By following above, Continue for rest of the Sorting Algorithm....

		/*************************************************************************************************************************/

		// Merge Sort

		algo.mergeSort(num,0 , num.length-1);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Merge_sort", "SortingNumbers");
		List<String> number3 = connectToSqlDB.readDataBase("Merge_sort", "SortingNumbers");
		printValue(number3);
		int n3 = num.length;
		randomize (num, n3);


		/********************************************************************************************************************************/
		// Quick Sort
		algo.quickSort(num , 0 , num.length-1);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Quick_sort", "SortingNumbers");
		List<String> number4 = connectToSqlDB.readDataBase("Quick_sort", "SortingNumbers");
		printValue(number4);
		int n4 = num.length;
		randomize (num, n4);

		/************************************************< HeapSort >*****************************************************/
		// HeapSort

		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Heap_sort", "SortingNumbers");
		List<String> number5 = connectToSqlDB.readDataBase("Heap_sort", "SortingNumbers");
		printValue(number5);
		int n5 = num.length;
		randomize (num, n5);

		/************************************************< bucketSort >*****************************************************/

		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Bucket_sort", "SortingNumbers");
		List<String> number6 = connectToSqlDB.readDataBase("Bucket_sort", "SortingNumbers");
		printValue(number6);
		int n6 = num.length;
		randomize (num, n6);

		/************************************************< Shell Sort >*****************************************************/

		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Shell_sort", "SortingNumbers");
		List<String> number7 = connectToSqlDB.readDataBase("Shell_sort", "SortingNumbers");
		printValue(number7);
		int n7 = num.length;
		randomize (num, n6);





		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(10);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.print(st+",");
		}
		System.out.println();
	}
}
