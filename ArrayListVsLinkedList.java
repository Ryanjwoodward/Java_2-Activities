package app;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 * @author Ryan Woodward
 *
 * Date:11/2/2021
 * Class: CST-239
 * Description: Class for Research Question 1 from Activity 5. This class demostrates the 
 * 				the pros and cons for the ArrayList and the LinkedList when insert/delete-ing
 * 				elements at the beginning of the list.
 */
public class ArrayListVsLinkedList {
	
	private static ArrayList<Integer> arrList = new ArrayList<Integer>();
	private static LinkedList<Integer> lnkList = new LinkedList<Integer>();
	private static Integer element = 117;
	
	public static void main(String[] args) {
		
		// Populate each List with some values
		arrList.add(5);
		arrList.add(9);
		lnkList.add(5);
		lnkList.add(9);

		System.out.println("ArrayList: " + arrList.toString());
		System.out.println("LinkedList: " + lnkList.toString());

		//--------Adding an Element to the beginning----------//
		//ArrayList
		arrList.add(0, element);
		lnkList.addFirst(element);
		System.out.println("\nAdd Element to Beginning:");
		System.out.printf("\tArrayList index 0= %d\n\tLinkedList index 0= %d \n", arrList.get(0), lnkList.getFirst());
		
		//--------Removing an Element at the beginning----------//
		arrList.remove(0);
		lnkList.remove();
		System.out.println("\nRemove Element from Beginning:");
		System.out.printf("\tArrayList index 0= %d\n\tLinkedList index 0= %d \n", arrList.get(0), lnkList.getFirst());
		
		//--------Adding an Element to the End------------------//
		arrList.add(element);
		lnkList.addLast(element);
		System.out.println("\nAdd Element to End:");
		System.out.printf("\tArrayList last idx= %d\n\tLinkedList tail= %d \n", arrList.get(2), lnkList.getLast());

		//--------Removing an Element at the End----------------//
		arrList.remove(element);
		lnkList.removeLast();
		System.out.println("\nRemove Element from End:");
		System.out.printf("\tArrayList last idx= %d\n\tLinkedList tail= %d \n", arrList.get(1), lnkList.getLast());

	}//main
}//ArrayListVsLinkedLsit
