/**
 * 
 */
package app;

/**
 * @author Ryan Woodward

 */
public class Storage<T> {
	
	private T s = null;
	
	/**
	 * @param s, constructor
	 */
	public Storage(T s) {
		
		this.s = s;
	}
	
	/**
	 * getter for generic object data
	 * @return
	 */
	public T getData() {
		
		return this.s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Storage<String> storage1 = new Storage<String>("Marc Vlasic");
		System.out.println("This is the data: " + storage1.getData());
		
		Storage<Integer> storage2 = new Storage<Integer>(0);
		System.out.println("This is the data: " + storage2.getData());

	}//main

}//Storage<T> class
