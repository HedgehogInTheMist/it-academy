//Lesson Three HomeTaskOne;
package ThirdLesson.hometask01;

import java.util.Scanner;


/**
 * Filling array of type float with 10 values and calculate average value
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float sum = 0;
		float[] justFloatArray = new float[10];
		System.out.println("Filling array of type float with 10 values and calculate average value");
		System.out.println("Enter values one by one: ");
		for (int i = 0; i < justFloatArray.length; i++) {
			justFloatArray[i] = in.nextFloat();
			sum += justFloatArray[i];
		}
		
		for(float element: justFloatArray) {
			System.out.print(element + " | ");
		}
		
		System.out.println("\naverage value = " + sum/10);
		in.close();
	}
}
