package app;

public class Person {
	
	// TODO Auto-generated method stub
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
	public boolean equals(Object other) {
		
		if(other == this) {
			
			System.out.println("Iam here in other == this");
			return true;
		}
		
		if(other == null) {
			
			System.out.println("Iam her in other == null");
			return false;
		}
		
		if(getClass() != other.getClass()) {
			
			System.out.println("Iam her in getClass() != other.getClass()");
			return false;
		}
		
		Person person = (Person)other;
		return (this._firstName == person._firstName && this._lastName == person._lastName);
		
	}
	
	@Override
	public String toString() {
		
		return "My Class is " + getClass() + " " + this._firstName + " " + this._lastName;
	}
	
	
	
	
	
	
	
	
	
	

}//Person Class
