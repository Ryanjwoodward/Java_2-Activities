package app;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		/*
		Person person1 = new Person("Jean-Luc", "Picard");
		
		person1.walk();
		person1.run();
		System.out.println(person1.get_lastName() + " is running " + person1.isRunning());
		person1.run();
		System.out.println(person1.get_lastName() + " is running " + person1.isRunning());
		*/
		
		Person[] persons = new Person[4];
		persons[0] = new Person("Jean-Luc", "Picard");
		persons[1] = new Person("William", "Riker");
		persons[2] = new Person("Lt.Cmdr", "Data");
		persons[3] = new Person("Beverly", "Crusher");
		
		Arrays.sort(persons);
		for(int idx =0; idx < 4; idx++) {
			
			System.out.println(persons[idx].get_firstName() + " " + persons[idx].get_lastName());
		}
		
	
	
	}

}
