package Threads;

public class Thread2 implements Runnable {
	Calculation calculation;
	
	Thread2(Calculation calculation) {
		this.calculation = calculation;
		new Thread(this, "Thread 2").start();
	}
	
	@Override
	public void run() {
		//int n;
		for(int i = 0; i < 5; i++) {
			calculation.print10_v2();
			System.out.println();
		}
	}
}
