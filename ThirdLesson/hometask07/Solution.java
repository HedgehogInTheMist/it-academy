//Lesson Three HomeTaskSeven;
package ThirdLesson.hometask07;
/**
 * Implements summ elements of array till encounter the null element 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		ArrayInitialization arrayInitialization = new ArrayInitialization();
		int[] array = arrayInitialization.arrayInit();
		int elementsSumm = 0;
		System.out.print("Initial array: ");
		for(int element: array) {
			System.out.print(element + " ");
		}
		
			if(array[0]==0) {
				System.out.print("\nFirst element of array is null!");
			}
		
				for (int i = 0; i < array.length; i++) {
					if(array[i] != 0) {
						elementsSumm = elementsSumm + array[i];
					} else break;
				}
				System.out.println("\nSumm elements of array until encounter null: " + elementsSumm);
	}

}
