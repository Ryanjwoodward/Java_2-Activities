//Author: Ryan Woodward
//Class: CST-239
//Date Started: 9/9/2021

package car;

public class Tire{

	private int _tirePressure;
	private int _position;
	//private String brand;
	
	public Tire() {
		
		this._tirePressure = 32;
		this._position = 0;
	}
	
	public Tire(int pressure, int position) {
		
		System.out.println("TIRE overloaded constr accessed!");
		
		this._tirePressure = 32;
		this._position = position;
	}
	
	public Tire(int pressure) {
		
		this._tirePressure = pressure;
	}

	public int get_tirePressure() {
		return _tirePressure;
	}

	public void set_tirePressure(int _tirePressure) {
		this._tirePressure = _tirePressure;
	}

	public int get_position() {
		return _position;
	}

	public void set_position(int _position) {
		this._position = _position;
	}
	
	
}
