package Threads;

public class Calculation {
	int number;
	boolean check = false;
	
	synchronized void print10_v1() {
		while(!check)
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(Thread.currentThread().getName() + ": ");
		for(int i = 1; i <= 10; i++) {
			System.out.print(" " + number + " ");
			number++;
			check = false;
			notify();
		}
	}
	
	synchronized void print10_v2() {
		while(check)
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(Thread.currentThread().getName() + ": ");
		for(int i = 1; i <= 10; i++) {
			System.out.print(" " + number + " ");
			number++;
			check = true;
			notify();
		}
	}
}
