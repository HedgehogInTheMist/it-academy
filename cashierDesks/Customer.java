package cashierDesks;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Customer implements Runnable {

	Semaphore semaphore;
	Random random = new Random();
	Shop shop = new Shop();
	
	private String name;
	
	Customer(Semaphore sem, String name) {
		semaphore = sem;
		this.name = name;
		new Thread(this).start();
	}
		
	@Override
	public void run() {
		System.out.println(name + " come to a shop and picking product.");
		try {
		System.out.println(name + " stands in a queue.");
		semaphore.acquire();

		String product = "Kefir";
		Iterator<Map.Entry<String, Integer>> iterator = Shop.getAmountOfProduct().entrySet().iterator();
			while(iterator.hasNext()) {
				Map.Entry<String, Integer> pair = iterator.next();
				if(pair.getKey().equals(product)) {
					Integer temp = pair.getValue();
					temp = temp - 1;
					pair.setValue(temp);
//					Shop.amountOfProduct.put(product, temp);
					System.out.println(product + " remain: " + pair.getValue());
				}
			}
		
		
		Thread.sleep(10); //Try to use random for value generation
//		Thread.sleep((random.nextInt(5) + 1) * 1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " left shop");
		semaphore.release();
	}
	
}
