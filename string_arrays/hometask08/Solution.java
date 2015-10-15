package string_arrays.hometask08;
/**
 * Implements setting row and column to zero when zero element is found at the intersection of matrix.
 */
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter matrix dimention n: ");
		int n = scanner.nextInt();
		System.out.println("Enter matrix dimention m");
		int m = scanner.nextInt();
		ArrayInitialization arrayInitialization = new ArrayInitialization();
		int[][] arrayWithZeros = arrayInitialization.arrayInit(n, m);

		System.out.println("Initial randomly formed Matrix: ");
		printArray(arrayWithZeros);
		// Method setting rows and columns to zero in accordance with requirements
		turnToZero(arrayWithZeros); 
		// Printing arrayWithZeros with reduced to nothing rows and columns
		System.out.println("\nMatrix after reorganization: ");
		printArray(arrayWithZeros);
		scanner.close();
	}

	private static void printArray(int[][] arrayWithZeros) {
		for (int i = 0; i < arrayWithZeros.length; i++) {
			for (int j = 0; j < arrayWithZeros[0].length; j++) {
				System.out.print(arrayWithZeros[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void turnToZero(int[][] arrayWithZeros) {
		int[] row = new int[arrayWithZeros.length];
		int[] column = new int[arrayWithZeros[0].length];
		for (int i = 0; i < arrayWithZeros.length; i++) {
			for (int j = 0; j < arrayWithZeros[0].length; j++) {
				if (arrayWithZeros[i][j] == 0) {
					row[i] = 2;
					column[j] = 2;
				}
			}
		}

		for (int i = 0; i < arrayWithZeros.length; i++) {
			for (int j = 0; j < arrayWithZeros[0].length; j++)
				if (row[i] == 2 || column[j] == 2) {
					arrayWithZeros[i][j] = 0;
				}
		}
	}
}
