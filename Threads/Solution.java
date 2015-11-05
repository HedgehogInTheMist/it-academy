package Threads;

public class Solution extends Thread {
	public static void main(String[] args) throws InterruptedException {

		ThreadTest threadTest = new ThreadTest();

		/*Thread t1 = new Thread(threadTest);
		Thread t2 = new Thread(threadTest);*/
		
		Thread t1 = new ThreadTest();
		Thread t2 = new ThreadTest();
				
		t1.setName("Thread 1:");
		t2.setName("Thread 2:");

		t1.start();
		//Thread.sleep(500);
		t2.start();
		// t2.join();
						////Aaaarrrrgh!!! BULLSHIT
	}
}
