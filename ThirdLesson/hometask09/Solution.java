//Lesson Three HomeTaskNine;
package ThirdLesson.hometask09;
/**
 * Implements replacing zero elements of array to the end of the array
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		ArrayInitialization arrayInitialization = new ArrayInitialization();
		int[] array = arrayInitialization.arrayInit();
		int[] arrayZeroEnd = new int [array.length];
		System.out.print("Initial array: ");
		for(int element: array) {
			System.out.print(element + " ");
		}
		int j = 0;
		for (int i = 0; i < array.length; i++) {
				if(array[i] == 0) {
					continue;
				}
				arrayZeroEnd[j] = array[i];
				j++;
			}
		System.out.println("\nNull elements pushed at the end of the array: " );
		for(int element: arrayZeroEnd) {
			System.out.print(element + " ");
		}
	}
		
}

