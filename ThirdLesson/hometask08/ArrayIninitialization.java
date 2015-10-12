package ThirdLesson.hometask08;

import java.util.Random;
/**
 * Implements initialization of array on 10 elements. Within the range from -10 up to 10
 * @author Hedgehog
 *
 */
public class ArrayIninitialization {
	public int[] arrayInit() {
		int[] multElemArray = new int[10];
		Random random = new Random();
		for (int i = 0; i < multElemArray.length; i++) {
			multElemArray[i] = random.nextInt(21) - 10;
		}
		return multElemArray;
	}
}
