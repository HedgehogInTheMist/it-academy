package Threads;

public class Thread1 implements Runnable{
	Calculation calculation;
	
	Thread1(Calculation calculation) {
		this.calculation = calculation;
		new Thread(this, "Thread 1").start();
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			calculation.print10_v1();
			System.out.println();
		}
	}
}
