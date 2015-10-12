package ThirdLesson.hometask09;

import java.util.Random;

/**
 * Implements initialization of array on 10 elements. Within the range from -10 up to 10
 * @author Hedgehog
 *
 */
public class ArrayInitialization {
	public int[] arrayInit() {
		int[] nullRearrangment = new int[10];
		Random random = new Random();
		for (int i = 0; i < nullRearrangment.length; i++) {
			nullRearrangment[i] = random.nextInt(21) - 10;
		}
		return nullRearrangment;
	}
	
}
