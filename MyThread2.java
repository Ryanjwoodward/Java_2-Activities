package app;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for(int idx = 0; idx < 1000; idx++) {
			System.out.println("MyThread2 is running. idx: " + idx);
		}
	}

}
