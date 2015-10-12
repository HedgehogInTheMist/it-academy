package ThirdLesson.hometask06;

import java.util.Random;
/**
 * Implements array intialization within the limits from -100 up to 100.
 * @author Hedgehog
 *
 */
public class ArrayInitialization {
	public int[] arrayInit() {
		int[] arrayWithNegarive = new int [10];
		Random random = new Random();
		for (int i = 0; i < arrayWithNegarive.length; i++) {
			arrayWithNegarive[i] = random.nextInt(201) - 100;
		}
		return arrayWithNegarive;
	}
}
