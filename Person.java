package app;

public class Person implements PersonInterface, Comparable<Person> {

	private boolean running;
	private String _firstName;
	private String _lastName;
	
	
	public String get_firstName() {
		return _firstName;
	}
	public String get_lastName() {
		return _lastName;
	}
	
	
	public Person(String firstName, String lastName) {
		
		this._firstName = firstName;
		this._lastName = lastName;
	}
	
	public Person(Person person) {
		
		this._firstName = person.get_firstName();
		this._lastName = person.get_lastName();
	}
	
	@Override
	public void walk() {
		System.out.println("I am Walking");
		running = false;
	}

	@Override
	public void run() {
		System.out.println("I am running");
		running = true;
	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return running;
	}
	
	
	@Override
	public int compareTo(Person o) {
		
		int value = this._lastName.compareTo(o._lastName);
		
		if(value == 0) {
			
			return this._firstName.compareTo(o._firstName);
		}else {
			
			return value;
		}
	}

	
	
}//PersonClass
