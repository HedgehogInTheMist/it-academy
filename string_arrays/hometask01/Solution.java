package string_arrays.hometask01;

import java.util.Scanner;

/**
 * Modifies symbol in a word in the position k. Initial text, position k and
 * symbol with which to perform modification are put from System.in. Doesn't
 * perform modification, if position k more than length of a word.
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		Scanner inputInitialData = new Scanner(System.in);
		System.out.print("Enter text for modification: ");
		String inputText = inputInitialData.nextLine();

		System.out.print("Enter position of a symbol: ");
		int position = inputInitialData.nextInt();

		System.out.print("Enter symbol for substitution: ");
		Scanner substitution = new Scanner(System.in);
		String subtitutSymbol = substitution.nextLine();

		char symbol = subtitutSymbol.charAt(0);
		int symbolPosition = position - 1;

		String[] workString = inputText.split(" ");

		for (int i = 0; i < workString.length; i++) {
			char[] arr = workString[i].toCharArray();

			if (arr.length > symbolPosition) {
				for (int j = 0; j < arr.length; j++) {
					arr[symbolPosition] = symbol;
					System.out.print(arr[j]);
				}
			} else {
				System.out.print(workString[i]);
			}
			System.out.print(" ");
		}
		inputInitialData.close();
		substitution.close();
	}
}
