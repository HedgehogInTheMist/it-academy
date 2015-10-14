package string_arrays.hometask03;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = null;
		System.out.println("Enter your text: ");
		inputString = scanner.nextLine();

		char symbols[] = inputString.toCharArray();
		for (int i = 0; i < symbols.length; i++) {
			if (Character.isLetter(symbols[i]) || symbols[i] == ' ') {
				System.out.print(symbols[i]);
			}
		}
		scanner.close();
	}
}
