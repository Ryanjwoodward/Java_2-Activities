package app;

public class Test {

	public static void main(String[] args) {

		ShapeBase[] shapes = new ShapeBase[4];
		shapes[0] = new Rectangle("rectangle", 10, 200);
		shapes[1] = new Triangle("Triangle", 10, 50);
		shapes[2] = new Trapezoid("Trapezoid", 10, 8, 13);
		shapes[3] = new Circle("Circle", 5, 5);

		for (int idx = 0; idx < shapes.length; idx++) {
			
			displayArea(shapes[idx]);
		}

	}

	private static void displayArea(ShapeBase shape) {
		System.out.println("This shape is a " + shape.getName() + " with an area of " + shape.calculateArea());
	}
}
