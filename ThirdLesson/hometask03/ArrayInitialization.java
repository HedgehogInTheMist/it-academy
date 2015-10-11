package ThirdLesson.hometask03;

import java.util.Scanner;
/**
* Implement three cases of array intialization.
* <br>1. Pre-defined array.
* <br>2. Array filled from System.in (keyboard)
* <br>3. Array filled randomly.
*/
public class ArrayInitialization {
	Scanner in = new Scanner(System.in);
	public void initArray() {

		while (true) {
			switch (in.nextLine()) {
			case "1":
				int[] firstArray = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
				System.out.print("Pre-defined array: ");
				for (int element : firstArray) {
					System.out.print(element + " ");
				}
				System.out.println();
				break;
			case "2":
				int[] secondArray = new int[15];
				System.out.println("Enter value one by one (15 elements): ");
				for (int i = 0; i < secondArray.length; i++) {
					secondArray[i] = in.nextInt();
				}
				System.out.print("Array filled from keyboard: ");
				for(int element: secondArray) {
					System.out.print(element + " ");
				}
				System.out.println();
			case "3":
				int[] thirdArray = new int[15];
				for (int i = 0; i < thirdArray.length; i++) {
					thirdArray[i] = (int)(Math.random() * 10);
				}
				for(int element: thirdArray) {
					System.out.print(element + " ");
				}
			case "q":
				System.exit(0);

			default:
				break;
			}
		}
		
	}
	
}
