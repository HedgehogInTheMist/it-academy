package Threads;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		super.run();
		int number = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(Thread.currentThread().getName());
			for (int j = 1; j <= 10; j++) {
				System.out.print(" " + number + " ");
				number++;
			}
			System.out.println();
		}

	}
}
