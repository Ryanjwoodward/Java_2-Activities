package app;

public class MyThread1 extends Thread{
	
	public void run() {
		for(int idx = 0; idx < 1000; idx++) {
			System.out.println("MyThread1 is running. idx: " + idx);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
