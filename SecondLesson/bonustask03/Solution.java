package SecondLesson.bonustask03;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Calculate factorial with the help of BigInteger in order to avoid overflow Integer type
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.print("Enter number N (factorial): ");
		int n = getInt();
		System.out.println("Factorial of " + n + " equals: " + factorial(n));
	}

/**
 * In fact, the method calculates factorial
 * @param n - incoming parameter gives computing boundary
 * @return - returns factorial N;
 */
	public static BigInteger factorial(int n) {
		BigInteger returnValue = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			returnValue = returnValue.multiply(BigInteger.valueOf(i));
		}
		return returnValue;

	}

	public static int getInt() {
		Scanner in = new Scanner(System.in);
		String inputString;
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = null;
		do {
			inputString = in.nextLine();
			matcher = pattern.matcher(inputString);
		} while (!matcher.matches());
		in.close();
		return Integer.parseInt(inputString);
	}
}

