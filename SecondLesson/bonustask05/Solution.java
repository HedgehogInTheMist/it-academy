package SecondLesson.bonustask05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Calculate arithmetical progression. Find sum of all numbers from 1 to n
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number n: ");
		int n = getInt(in);
		System.out.println("Sum all numbers from 1 upto " + n + " is " + arithmeticProgression(n));
		in.close();
	}

/**
 * 
 * @param n - boundary value
 * @return - sum all integers upto n
 */
	public static int arithmeticProgression(int n) {
		return n*(n+1) / 2;
	}

/**
 * 
 * @return
 */
	
	public static int getInt(Scanner in) {
		String inputString;
		Pattern pattern = Pattern.compile("^\\d+$");
		Matcher matcher = null;
		do {
			inputString = in.nextLine();
			matcher = pattern.matcher(inputString);
		} while(!matcher.matches());
		return Integer.parseInt(inputString);
	}
}
































