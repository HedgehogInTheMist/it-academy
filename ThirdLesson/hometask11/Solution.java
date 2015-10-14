//Lesson Three HomeTaskEleven;
package ThirdLesson.hometask11;

import java.util.Scanner;
/**
 * 				!!! UNFORTUNATELLY THIS TASK IS UNFINISHED YET !!!
 * Implements replacing columns in order to get elements of main diagonal ascending. 
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

		for (int i = 0; i < dimention; i++) {
			for (int j = i+1; j < dimention; j++) {
				if(array[0][i] > array[0][j]) {
					for(int k = 0; k < dimention; k++) {
						int temp = array[k][i];
						array[k][i] = array[k][j];
						array[k][j] = temp;
				}
				}
					//System.out.print(array[i][j] + " ");
			}
		}

		System.out.println("\n\nMatrix with new diagonal: ");
		   for(int i = 0; i < dimention; i++)
		   {
		     System.out.println();
		 
		     for(int j = 0; j < dimention; j++)
		       System.out.print(array[i][j] + " ");
		   }

			//Printing main diagonal of matrix
			System.out.print("\nMain diagonal of a matrix: ");
			for (int i = 0; i < dimention; i++) {
				for (int j = 0; j < dimention; j++) {
					if(i == j)
						System.out.print(array[i][j] + " ");
				}
			}

	}
}
