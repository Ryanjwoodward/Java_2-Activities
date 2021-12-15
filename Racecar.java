package racecar;

import car.Car;

public class Racecar extends Car{
	
	private int _racingNumber;
	
	
	public Racecar() {
		
		Car racecar = new Car();
		this._racingNumber = 0;
	}
	
	//This Constructor is used if the engineNum, require tire pressure, car's designation Number, and racing Number are known
	public Racecar(int engineNum, int tirePressure, int designationNum, int racingNum) {
		
		System.out.println("RACECAR overloaded constr accessed!");
		Car racecar = new Car(engineNum, tirePressure, designationNum);
		this._racingNumber = racingNum;
	}
	

	public int get_racingNumber() {
		return _racingNumber;
	}

	public void set_racingNumber(int _racingNumber) {
		this._racingNumber = _racingNumber;
	}
	
	

}
