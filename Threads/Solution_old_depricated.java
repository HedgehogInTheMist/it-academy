package Threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_old_depricated extends Thread {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Enter \"start\" for starting threads or (q/Q) for Exit: ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String userAnswer;
		userAnswer = bufferedReader.readLine();

		while (true) {
			switch (userAnswer) {
			case "start":
				
				new Thread("Thread 1:") {
					public void run() {
						print10();
					}
				}.start();
				Thread.sleep(1000);
				
				new Thread("Thread 2:") {
					public void run() {
						print10();
					}
				}.start();
				Thread.sleep(1000);
				
				break;
			case "q":
				break;
			}
		}
	}

	/**
	 * Print numbers from 1 up to 100. Feeding 10 numbers in line separeted with
	 * space
	 */
	public synchronized static void print10() {
		// public static void print10() {
		int number = 1;
		System.out.print(Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				System.out.print(" " + number + " ");
				number++;
			}
			System.out.println();
		}
	}
}
