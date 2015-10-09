package SecondLesson.hometask02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lesson Two Exercise Two 
 * Enter two numbers and compare them.
 * 
 * @author Hedgehog
 */
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Compare two numbers.");
		System.out.print("Enter number one: ");
		int numberOne = getInt(in);
	    System.out.print("Enter number two: ");
	    int numberTwo = getInt(in);
	    compareNumbers(numberOne, numberTwo);
	}

	private static void compareNumbers(int numberOne, int numberTwo) {
		if (numberOne == numberTwo) {
	    	System.out.println("Numbers are equal");
	    } else
	    	if (numberOne > numberTwo) {
	    		System.out.print("Number one more than number two");
	    	} else 
	    		System.out.println("Number one less than number two");
	}
	
	public static int getInt(Scanner in) {
		String str = null;
		Pattern pattern = Pattern.compile("^\\d+$");
		Matcher matcher = null;
			do {
				str = in.nextLine();
				matcher = pattern.matcher(str);
			} while(!matcher.matches());
		return Integer.parseInt(str);
	}
}
