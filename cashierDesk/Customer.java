package cashierDesk;

import java.util.concurrent.locks.ReentrantLock;

public class Customer implements Runnable {
	
	private String name;
	private long creditCard;
	
	ReentrantLock lock = new ReentrantLock();
	
	//public Customer(String name){
	public Customer(int creditCard){
		this.creditCard = creditCard;
		//this.name= name;
	}
	
	 synchronized  public void run(){
		lock.lock();
		//System.out.println(this.name+ " checking out on the cashier desk ");
		System.out.println("Credit card №:" + this.creditCard+ " checking out on the cashier desk ");
		lock.unlock();
		
	}
	
}