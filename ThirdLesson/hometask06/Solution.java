//Lesson Three HomeTaskSix;
package ThirdLesson.hometask06;
/**
 * Implements searching amount of negative elements in array.
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		ArrayInitialization arrayInitialization = new ArrayInitialization();
		int[] array = arrayInitialization.arrayInit();
		int sumOfNegativeElements = 0;
		System.out.println("Implementing search quantity of negative elements in array.");
		System.out.print("Initial array: ");
		for(int element: array) {
			if(element < 0) {
				sumOfNegativeElements++;
			}
			System.out.print(element + " ");
		}
		System.out.println("\nAmount of negative elements: " + sumOfNegativeElements);
		
	}

}
