package datastructure;

import java.util.*;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> queue = new LinkedList();
		queue.add("NY");
		queue.add("PA");
		queue.add("NJ");
		queue.add("FL");
		queue.add("25");

		System.out.println(" Using For Each loop to retrieve data.");

		for (String it : queue){
			System.out.println(it);
		}

		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.peek());

		System.out.println("Using while loop with Iterator to retrieve data");


		Iterator <String> it = queue.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
	}

}
