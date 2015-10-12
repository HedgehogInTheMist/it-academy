//Lesson Three HomeTaskEight;
package ThirdLesson.hometask08;
/**
 * Implements multiplication elements of array till encounter the null element
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		ArrayIninitialization arrayIninitialization = new ArrayIninitialization();
		int[] array = arrayIninitialization.arrayInit();
		int multElement = 1;
		System.out.print("Initial array: ");
		for(int element: array) {
			System.out.print(element + " ");
		}
		if(array[0] == 0) {
			System.out.println("\nFirst element of array is null!");
			multElement = 0;
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i] != 0) {
				multElement = multElement * array[i];
			} else break;
		}
		System.out.println("\nMultiplication: " + multElement);
	}
}
