package ThirdLesson.hometask07;

import java.util.Random;
/**
 * Implements initialization of array on 10 elements. Within the range from -10 up to 10 
 * @author Hedgehog
 *
 */
public class ArrayInitialization {
	public int[] arrayInit() {
		Random random = new Random();
		int[] sumElemArray = new int[10];
		for (int i = 0; i < sumElemArray.length; i++) {
			sumElemArray[i] = random.nextInt(21) - 10;
		}
		return sumElemArray;
	}
}
