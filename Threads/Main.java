package Threads;

public class Main {
	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		new Thread1(calculation);
		new Thread2(calculation);
	}
}
