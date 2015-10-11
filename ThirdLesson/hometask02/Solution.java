//Lesson Three HomeTaskTwo;
package ThirdLesson.hometask02;

import java.util.Scanner;
/**
 * Implement filling array of Integer type and search min and max values in it.
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] justIntArray = new int[10];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < justIntArray.length; i++) {
			justIntArray[i] = in.nextInt();
		}
		int maxElement = justIntArray[0];
		int minElement = justIntArray[0];
		for (int i = 0; i < justIntArray.length; i++) {
			if(justIntArray[i] > maxElement) {
				maxElement = justIntArray[i];
			}
			if(justIntArray[i] < minElement) {
				minElement = justIntArray[i];
			}
		}
		System.out.println("min value = " + minElement);
		System.out.println("max value = " + maxElement);
		in.close();
	}
}
