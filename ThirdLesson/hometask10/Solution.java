//Lesson Three HomeTaskTen;
package ThirdLesson.hometask10;

import java.util.Scanner;
/**
 * Implements search of elements main and secondary diagonals. 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		int dimention;
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter the dimention of bidimensional array: ");
		dimention = input.nextInt();
		
		MatrixInitialization matrixInitialization = new MatrixInitialization();
		int array[][] = matrixInitialization.arrayInit(dimention);
		//Printing initial matrix
		System.out.print("Initial matrix with dimention " + dimention);
		for (int i = 0; i < dimention; i++) {
			System.out.println();
			for (int j = 0; j < dimention; j++) {
				System.out.print(array[i][j] + " ");
			}
		}

		//Printing main diagonal of matrix
		System.out.print("\nMain diagonal of a matrix: ");
		for (int i = 0; i < dimention; i++) {
			for (int j = 0; j < dimention; j++) {
				if(i == j)
					System.out.print(array[i][j] + " ");
			}
		}

		//Printing secondary diagonal of matrix
		System.out.print("\nSecondary diagonal of a matrix: ");
		for (int i = 0; i < dimention; i++) {
			for (int j = 0; j < dimention; j++) {
				if((i+j) == (dimention - 1)) {
					System.out.print(array[i][j] + " ");
				}
			}
			
		}
	}
}
