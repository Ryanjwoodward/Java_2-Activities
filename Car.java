/**
 * 
 */
package app;

/**
 * @author Ryan Woodward
 *
 */
public class Car {
	
	private int _year;
	private String _make;
	private String _model;
	private int _odometer;
	private double _engineLiters;
	

	public Car() {
		this._year = 0;
		this._make = "";
		this._model="";
		this._odometer = 0;
		this._engineLiters = 0;
	}
	
	/**
	 * @param _year
	 * @param _make
	 * @param _model
	 * @param _odometer
	 * @param _engineLiters
	 */
	public Car(int _year, String _make, String _model, int _odometer, double _engineLiters) {
		this._year = _year;
		this._make = _make;
		this._model = _model;
		this._odometer = _odometer;
		this._engineLiters = _engineLiters;
	}
	/**
	 * @return the _year
	 */
	public int get_year() {
		return _year;
	}

	/**
	 * @param _year the _year to set
	 */
	public void set_year(int _year) {
		this._year = _year;
	}

	/**
	 * @return the _make
	 */
	public String get_make() {
		return _make;
	}

	/**
	 * @param _make the _make to set
	 */
	public void set_make(String _make) {
		this._make = _make;
	}

	/**
	 * @return the _model
	 */
	public String get_model() {
		return _model;
	}

	/**
	 * @param _model the _model to set
	 */
	public void set_model(String _model) {
		this._model = _model;
	}

	/**
	 * @return the _odometer
	 */
	public int get_odometer() {
		return _odometer;
	}

	/**
	 * @param _odometer the _odometer to set
	 */
	public void set_odometer(int _odometer) {
		this._odometer = _odometer;
	}

	/**
	 * @return the _engineLiters
	 */
	public double get_engineLiters() {
		return _engineLiters;
	}

	/**
	 * @param _engineLiters the _engineLiters to set
	 */
	public void set_engineLiters(double _engineLiters) {
		this._engineLiters = _engineLiters;
	}

}//Car Class
