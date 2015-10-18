package string_arrays.hometask05;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your text: ");
		String inputString = scanner.nextLine();
		
		if((isUniqueChar(inputString))) {
			System.out.println("All symbols in the string are unique!");
		} else 
			System.out.println("Symbols in the string aren't unique!");
		scanner.close();
	}
	
	public static boolean isUniqueChar(String str) {
		boolean[] chars = new boolean[1024];
		for(int i = 0; i < str.length(); i++) {
			char indexValue = str.charAt(i);
			if(chars[indexValue]) {
				System.out.println(chars[indexValue]);
				return false;
			}
			chars[indexValue] = true;
		}
		return true;
	}
}
