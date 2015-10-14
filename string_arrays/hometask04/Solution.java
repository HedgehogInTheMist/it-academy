package string_arrays.hometask04;

import java.util.Scanner;

/** 
 * Implements deleting from text all words which started from consonant and have a certain given length 
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you text: ");
		String inputString = scanner.nextLine();
		System.out.println("Enter word's length: ");
		int index = scanner.nextInt();
		
		String[] wordsArray = inputString.split(" ");
		for (int i = 0; i < wordsArray.length; i++) {
			char firstSymbol = wordsArray[i].charAt(0);
			if(wordsArray[i].length() == index && isVowel(firstSymbol) == -1) {
				wordsArray[i] = "";
			}
			System.out.print(wordsArray[i] + " ");
		}
		scanner.close();
	}

/**
 * Establish whether first symbol of the word is consonant or not 
 * @param ch - first symbol of the word
 * @return the index of the first occurrence of the character in the character sequence represented by "aeiouy", or -1 if the character does not occur. 
 */
	public static int isVowel(char ch) {
		return ("aeiouy".indexOf(Character.toLowerCase(ch)));
	}
}
