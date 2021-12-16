package app;

import java.util.ArrayList;

/**
 * 
 * @author Ryan Woodward
 *
 * Date: 11/1/2021
 * Class: CST-239
 * Description: Class to demonstrate the advantages of Generic types over
 * 				specified collections of java defined types
 */
public class GenericsDemo {
	
	public static void main(String[] args) {
		
	
		
		Gerry<Object> genericO = new Gerry<Object>();
		String str = "Some String";
		Integer string = 1;
		Object obj = new Object();
		String str2 = "Stringy";
		Double dbl = 117.1;
		
		genericO.add(str);
		genericO.add(string);
		genericO.add(obj);
		genericO.add(str2);
		genericO.add(dbl);
		
		for(int idx = 0; idx < 5; idx++) {
			System.out.println("Obj at Index " + idx + ": " + genericO.get(idx));
		}
		
		
	}	
}//GenericsDemo

class Gerry<O>{
	
	private ArrayList<O> genList;
	
	public Gerry() {
		
		genList = new ArrayList<O>(5);
	}
	
	public void add(O obi) {
		this.genList.add(obi);
	}
	
	public O get(int idx) {
		return this.genList.get(idx);
	}
}//Gerry


