package app;

public class Circle extends ShapeBase{
	
	private final int pi = 3;

public Circle(String name, int width, int height) {
		
		super(name, width, height);
	}

	@Override
	public int calculateArea() {

		return width * height * pi;
	}
}
