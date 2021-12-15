//Author: Ryan Woodward
//Class: CST-239
//Date Started: 9/9/2021

package car;

public class Engine{
	
	private boolean _running;
	private double _engineNumber;
	
	
	public Engine() {
		
		this._running = false;
		this._engineNumber = 0;
	}
	
	public Engine(double engineNum) {
		
		System.out.println("ENGINE overloaded constr accessed!");
		
		this._running = false;
		this._engineNumber = engineNum;
	}
	
	
	public double get_engineNumber() {
		return _engineNumber;
	}
	
	public void set_engineNumber(double _engineNumber) {
		this._engineNumber = _engineNumber;
	}
	
	public boolean get_running() {
		
		return _running;
	}
	
	public void startEngine() {
		
		_running = true;
	}
	
	public void stopEngine() {
		
		_running = false;
	}

	
	
	
	

}//Engine Class
