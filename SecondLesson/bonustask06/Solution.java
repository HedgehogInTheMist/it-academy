package SecondLesson.bonustask06;

/**
 * Given expression 2^2*x-5*x-8. 
 * <br> Program calculates its range of values with x from x = -4 up to x = 4 with step 0,5
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println("Given expression 2^2*x-5*x-8. " + "Program calculates its range of values "
				+ "with x from x = -4 up to x = 4 with step 0,5");
		for (double x = -4.0; x <= 4; x += 0.5) {
			System.out.println("For x = " + x + " function takes on a value: " + (2 * x * x - 5 * x - 8));
		}
	}
}
