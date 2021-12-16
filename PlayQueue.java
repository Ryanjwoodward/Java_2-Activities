package app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PlayQueue {
	
	/*
	 * Queue (FIFO)
	 * offer() inserts an element into the head of the queue
	 * add() inserts an element into the head of the queue
	 * peek() retrieves but does not remove from the head element of the queue
	 * remove() retrieves and removes an element from the head of the queue
	 * size() returns the number of elements in the queue
	 */

	public static void main(String[] args) {
		
		Queue<String> stringQueue = new LinkedList<String>();
		stringQueue.offer("Mark Vlasic");
		stringQueue.add("Edouard Vlasi");
		stringQueue.offer("Logan Couture");
		stringQueue.add("Mark McGwire");
		
		Queue<Integer> integerQueue = new LinkedList<Integer>();
		integerQueue.add(1);
		integerQueue.offer(-1);
		integerQueue.add(5);
		integerQueue.offer(10);
		
		System.out.println(integerQueue);
		System.out.printf("Integer Queue Tests: size if %d and head element is %d\n", integerQueue.size(), integerQueue.peek());
	
		Iterator<String> itr = stringQueue.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	
	
	}

}
