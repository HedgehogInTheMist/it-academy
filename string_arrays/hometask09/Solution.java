package string_arrays.hometask09;

import java.util.Scanner;

/* Допустим, что существует метод isSubstring, проверяющий, является ли одно слово подстрокой другого.
 * Для двух строк, s1 и s2, напишите код проверки, получена ли строка s2 циклическим сдвигом s1,
 * используя только один вызов метода isSubstring (пример: слово waterbottle получено циклическим сдвигом erbottlewat).
 */
/**
 * Implements method isSubstring for checking on whether target string is substring of original string or not.
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		Scanner firstString = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String s1 = firstString.nextLine();		//for checking purposes: "waterbottle";
		Scanner secondString = new Scanner(System.in);
		System.out.println("Enter second string: ");
		String s2 = secondString.nextLine();		//for checking purposes: "erbottlewat"
		
		if(isSubstring(s1, s2)) {
			System.out.println("String " + "\"" + s1 + "\"" + " is substring of string " + "\"" + s2 + "\".");
		} else {
			System.out.println("String " + "\"" + s1 + "\"" + " isn't substring of string " + "\"" + s2 + "\".");
		}

		firstString.close();
		secondString.close();
	}

	/**
	 * Implements checking on whether target string is substring of original string or not, producing circular shifting to the left 
	 * in target string and checkin on equality with original string.
	 * 
	 * @param s1 - target string
	 * @param s2 - original string 
	 * @return <b> true </b> - if target string is substring of original string, otherwise <b> false </b>.
	 */
	public static boolean isSubstring(String s1, String s2) {
		if(s1 == null || s2 == null) {
			return false;
		}
		boolean isMatch = false;
		char firstSymbol;
		
		char[] array = s1.toCharArray(); //transform string into an array
		int length = array.length;
		for(int i = 0; i < length; i++) {
			firstSymbol = array[0]; //first symbol from string
			for(int j = 0; j < length - 1; j++) {
				array[j] = array[j + 1]; //shifting whole string to the left on one symbol
			}
			//putting first sybmbol of original string at the end of the shifted word thereby finishing circular shifting
			array[length - 1] = firstSymbol;
			String resultString = String.valueOf(array);
			if(resultString.equals(s2)) {
				isMatch = true;
			}
		}
		return isMatch;
	}
}