//string_arrays HomeTaskTwo
package string_arrays.hometask02;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		String inputText;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your text: ");
		inputText = scanner.nextLine();
		// System.out.println(inputText);
		char[] symbols = inputText.toCharArray();

		for (int i = 0; i < symbols.length; i++) {
			System.out.print(symbols[i] + "  ");
		}
		//inputText = inputText.toLowerCase();
		System.out.println();
		
		for (int i = 0; i < symbols.length; i++) {
			if(Character.isLetter(symbols[i])) {
				System.out.printf("%-3s", code(symbols[i]));
			} else
				System.out.printf("%-3s", " ");
			scanner.close();
		}
	}

	public static int code(char c) {
		/*String abc = null;
		for (int i = 0; i < 26; ++i) {
            abc = String.valueOf((char)('a' + i));
		}*/
		return "abcdefghijklmnopqrstuvwxyz".indexOf(Character.toLowerCase(c)) + 1;
		//return abc.indexOf(Character.toLowerCase(c)) + 2;
	}
	
}
