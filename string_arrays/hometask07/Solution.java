//string_arrays HomeTaskSeven
package string_arrays.hometask07;

import java.util.Scanner;

/**
 * Performs String's contraction. For instance  "aabcccccaaa" turns to "a2b1c5a3"
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string to perform contraction on it.");
		System.out.println("For instance, string \"aabcccccaaa\" turns to \"a2b1c5a3\"");
		
		System.out.println(stringContraction(scanner));
	}

	/**
	 * Expects string from System.in, counts chars in it, and modifies string in accordance with conditions.
	 * In StringBuffer returns a resulting string. If contracted string longer than source string, returns back source string.
	 * 
	 * @param scanner inputs string from System.in for implementing contraction on it.
	 */
	public static StringBuffer stringContraction(Scanner scanner) {
		String inputString = scanner.nextLine();
		StringBuffer contractedString = new StringBuffer();
		int count = 1; 										//counts amount of repeating chars
		char charInCurrentPos = inputString.charAt(0);

		//running through source string, counting chars, and modifying inputString in accordance with conditions
		for(int i = 1; i < inputString.length(); i++) {		
			if(inputString.charAt(i) == charInCurrentPos) {
				count++;
			} else {
				contractedString.append(charInCurrentPos);
				contractedString.append(count);
				count = 1;
				charInCurrentPos = inputString.charAt(i);
			}
		}
		contractedString.append(charInCurrentPos);
		contractedString.append(count);

		//Checking on whether contractedString turned longer than inputString or not, after contraction 
		if(inputString.length() <= contractedString.length()) {
			contractedString.delete(0, contractedString.length());
			contractedString.append(inputString);
			System.out.println("Futile to perform contraction. String returned back intact:");
			return contractedString;
		}
		System.out.println("Contracted string:");
		scanner.close();
		return contractedString;
	}
}
