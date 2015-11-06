package Threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution extends Thread {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Enter \"start\" for starting threads or (q/Q) for Exit: ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String userAnswer;
		userAnswer = bufferedReader.readLine();
		
		while(true) {
			switch (userAnswer) {
			case "start": 
						Thread t1 = new ThreadTest();
						Thread t2 = new ThreadTest();
								
						t1.setName("Thread 1:");
						t2.setName("Thread 2:");
				
						t2.start();
						t1.start();
						/*Thread.sleep(5000);
						Thread.sleep(5000);*/
										////Aaaarrrrgh!!! BULLSHIT
				break;
			case "q": 
				break;
			}
		}
}

	/**
	 * Print numbers from 1 up to 100. Feeding 10 numbers in line separeted with space 
	 */
	//public synchronized static void print10() {
	public static void print10() {
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
