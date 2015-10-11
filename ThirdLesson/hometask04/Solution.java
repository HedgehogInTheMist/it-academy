package ThirdLesson.hometask04;

/**
 * Contains implementation of searching max element of array and its index
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		ArrayInit arrayInit = new ArrayInit();
		int array[] = arrayInit.initArray();
		int max = array[0];
		int index = 0;
		System.out.print("Randomly filled array with 15 integer elements: ");

		for (int j = 0; j < array.length - 1; j++) {
			if (array[j] >= max) {
				max = array[j];
				index = j;
			}
			System.out.print(array[j] + " ");
		}
		System.out.println("\nMax element of array: " + max + " and its index: " + index);
	}
}
