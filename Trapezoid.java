package app;

public class Trapezoid extends ShapeBase{
	
	private int width2;

public Trapezoid(String name, int width, int height, int width2) {
		
		super(name, width, height);
		this.width2 = width2;
	}

	@Override
	public int calculateArea() {

		return (((width + width2)*height))/2;
	}

}
