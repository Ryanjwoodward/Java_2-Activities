package app;

public class ShapeBase implements ShapeInterface{

	protected String name;
	protected int width, height;
	
	public ShapeBase(String name, int width, int height) {
		
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	public String getName() {
		
		return this.name;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return -1;
	}
}
