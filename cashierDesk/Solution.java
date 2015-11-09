package cashierDesk;

import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Solution{
	
	public static void main(String[] args){
		System.out.println("Here is log-file's monitoring from casier desks in shop\n");
		addThreadsToPool();
	}
	
	public static void addThreadsToPool(){
		
		Random random = new Random();
				
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(2);
		
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 1, SECONDS);
				
		eventPool.scheduleAtFixedRate(new Customer(random.nextInt(1000000) + 1), random.nextInt(12), random.nextInt(14) + 2, SECONDS);
		eventPool.scheduleAtFixedRate(new Customer(random.nextInt(1000000) + 1), random.nextInt(3), random.nextInt(10) + 3, SECONDS);
		eventPool.scheduleAtFixedRate(new Customer(random.nextInt(1000000) + 1), random.nextInt(4), random.nextInt(10) + 1, SECONDS);
		eventPool.scheduleAtFixedRate(new Customer(random.nextInt(1000000) + 1), random.nextInt(6), random.nextInt(16) + 2, SECONDS);
		eventPool.scheduleAtFixedRate(new Customer(random.nextInt(1000000) + 1), random.nextInt(1), random.nextInt(11) + 1, SECONDS);
		eventPool.scheduleAtFixedRate(new Customer(random.nextInt(1000000) + 1), random.nextInt(20), random.nextInt(23) + 1, SECONDS);
		
		
		/*eventPool.scheduleAtFixedRate(new PerformSystemCheck("Customer (man) "), indexFirstM, indexSecondM, SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Customer (woman) "), indexFirstW, indexSecondW, SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Customer (kid) "), indexFirstK, indexSecondK, SECONDS);*/
				
		try{
			Thread.sleep(20000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		 eventPool.shutdown();
		
	}
	
}