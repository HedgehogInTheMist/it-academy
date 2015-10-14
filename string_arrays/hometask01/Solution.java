//string_arrays HomeTaskOne
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
		int symbolPosition = inputInitialData.nextInt();

		System.out.print("Enter symbol for substitution: ");
		Scanner substitution = new Scanner(System.in);
		String substitutSymbol = substitution.nextLine();
		
		char symbol = substitutSymbol.charAt(0); //Determine symbol for substitution
		String[] actionString = inputText.split(" "); //Splitting initial string on words and putting them in arrayWholeString

		for (int i = 0; i < actionString.length; i++) {
			char[] arrayWholeString = actionString[i].toCharArray();
													  //running though arrayWholeString and modifying symbol in accordance with requirements
			if (symbolPosition - 1 < arrayWholeString.length) {			
				for (int j = 0; j < arrayWholeString.length; j++) {
					arrayWholeString[symbolPosition - 1] = symbol;
					System.out.print(arrayWholeString[j]);
				}
			} else {
				System.out.print(actionString[i]);
			}
			System.out.print(" ");
		}
		inputInitialData.close();
		substitution.close();
	}
}
