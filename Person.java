package app;

public class Person {
	
	private String _name;
	private int _age;
	private double _weight, _height;
	private boolean _hungry;
	

	public Person(String name, int age, double weight, double height, boolean hungry) {
		
		super();
		this._name = name;
		this._age = age;
		this._weight = weight;
		this._height = height;
		this._hungry = hungry;
	}
	
	//----------------------------------
	//Accessors and Mutators
	//----------------------------------
	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public int get_age() {
		return _age;
	}

	public void set_age(int _age) {
		this._age = _age;
	}

	public double get_weight() {
		return _weight;
	}

	public void set_weight(double _weight) {
		this._weight = _weight;
	}

	public double get_height() {
		return _height;
	}

	public void set_height(double _height) {
		this._height = _height;
	}

	public boolean is_hungry() {
		return _hungry;
	}

	public void set_hungry(boolean _hungry) {
		this._hungry = _hungry;
	}

	
	//------------------------------------
	//Behavior Methods
	//------------------------------------
	
	public void walk() {
		
		System.out.println("I am in walk()");
	}
	
	public float run(float distance) {
		
		System.out.println("I am in run()");
		
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person aPerson = new Person("Till", 53, 205.4, 6.2, true);
		System.out.println("My name is " + aPerson.get_name());
		
		aPerson.walk();
		aPerson.run((float)25.2);
	}

}

/*

 */
