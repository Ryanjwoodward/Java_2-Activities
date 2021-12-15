//Author: Ryan Woodward
//Class: CST-239
//Date Started: 9/9/2021

package car;

public class Car {
	
	private Engine _engine;
	private Tire _tire1, _tire2, _tire3, _tire4;
	private int _designationNum;
	private int _speed;
	
	
	public Car() {
		
		_engine = new Engine();
		_tire1 = new Tire();
		_tire2 = new Tire();
		_tire3 = new Tire();
		_tire4 = new Tire();
		_designationNum = 0;
		_speed = 0;
	}

	public Car(double engineNum, int tirePressure, int designationNum) {
		
		System.out.println("CAR overloaded constr accessed!");
		
		_engine = new Engine(engineNum);
		_tire1 = new Tire(tirePressure, 1);
		_tire2 = new Tire(tirePressure, 2);
		_tire3 = new Tire(tirePressure, 3);
		_tire4 = new Tire(tirePressure, 4);
		this._designationNum = designationNum;
		_speed = 0;
		
	}
	
	public Engine get_engine() {
		return _engine;
	}

	public int get_designationNum() {
		return _designationNum;
	}

	public void set_designationNum(int _designationNum) {
		this._designationNum = _designationNum;
	}

	public int get_speed() {
		return _speed;
	}

	public void set_speed(int _speed) {
		this._speed = _speed;
	}
	
	public int getTirePressure() {
		
		int tp;
		
		tp = _tire1.get_tirePressure();
		
		return tp;
	}
	
	public void setTirePressure(int tp) {
		
		_tire1.set_tirePressure(tp);
	}
	
	
	
	

}
