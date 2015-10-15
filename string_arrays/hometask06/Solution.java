package string_arrays.hometask06;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first string: ");
		String firstString = scanner.nextLine();
		System.out.println("Enter your second string: ");
		String secondString = scanner.nextLine();

		firstString = sort(firstString);
		secondString = sort(secondString);
		if (rearrangement(firstString, secondString)) {
			System.out.println("String's transformation are possible");
		} else
			System.out.println("String's transformation aren't possible!");
		scanner.close();
	}

	public static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	public static boolean rearrangement(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
}
