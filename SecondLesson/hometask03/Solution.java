package SecondLesson.hometask03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lesson Two Exercise Three
 * 
 * Calculate quotient of two numbers 
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		
		System.out.println("Calculate quotient of two numbers.");
		System.out.print("Enter first number: ");
		Scanner in = new Scanner(System.in);
		int dividend = getInt(in);

		System.out.print("Enter second number: ");
		int divider = getInt(in);
		
		double quotient = (double) dividend / divider; 
		System.out.println("Quotient of numbers " + dividend + " and " + divider + " is " + quotient);
		in.close();
	}
/**
 * 	Putting in only integers, other values discarding
 * 
 * @return
 */
	public static int getInt(Scanner in) {
		String str;
		Pattern pattern = Pattern.compile("^\\d+$");
		Matcher matcher = null;
		do {
			str = in.nextLine();
			matcher = pattern.matcher(str);
		} while(!matcher.matches());
		
		return Integer.parseInt(str);
	}
}