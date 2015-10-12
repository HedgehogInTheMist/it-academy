//Lesson Three HomeTaskFive;
package ThirdLesson.hometask05;

/**
 * Contains implementation of searching min element of array and its index
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		ArrayInitialization arrayInitialization = new ArrayInitialization();
		int array[] = arrayInitialization.initArray();
		int min = array[0];
		int index = 0;
		System.out.print("Randomly filled array with 15 integer elements: ");

		for (int j = 0; j < array.length - 1; j++) {
			if (array[j] <= min) {
				min = array[j];
				index = j;
			}
			System.out.print(array[j] + " ");
		}
		System.out.println("\nMin element of array: " + min + " and its index: " + index);
	}
}
