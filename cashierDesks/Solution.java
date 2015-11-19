package cashierDesks;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Solution {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(2);
		Random random = new Random();
		
		
		for(int i = 1; i <= 10; i++) {
			new Customer(semaphore, "Customer " + i);
			try {
				Thread.sleep(1000);
//				Thread.sleep((random.nextInt(4) + 1)*1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}

}
