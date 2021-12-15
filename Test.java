package app;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("Till", "Lindemann");
		Person p2 = new Person("Niklas", "Karlsson");
		Person p3 = new Person(p1);
		
		if(p1 == p2) {
			System.out.println("p1 and p2 same w/ ==");
		}else {
			System.out.println("p1 and p2 not same w/ ==");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1 and p2 same w/ .equals()");
		}else {
			System.out.println("p1 and p2 not same w/ .quals()");
		}
		
		if(p1 == p3) {
			System.out.println("p1 and p3 same w/ ==");
		}else {
			System.out.println("p1 and p3 not same w/ ==");
		}
		
		if(p3.equals(p1)) {
			System.out.println("p1 and p3 same w/ .equals()");
		}else {
			System.out.println("p1 and p3 not same w/ .equals()");
		}
		
		System.out.println(p1);
		System.out.println(p2.toString());
		System.out.println(p3);
	}

}
