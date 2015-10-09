package SecondLesson.bonustask02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Calculate series sum: 1 + 1/2 + 1/3 + 1/4 +... up to n.
 * <br> N Should be entered from keyboard.
 */
public class Solution {
	public static void main(String[] args) {
		float sum = 0;
		System.out.print("Enter N: ");
		int n = getInt();
		for(int i = 1; i <= n; i++) {
			sum += 1 / (float)i;
		}
		System.out.println(sum);
	}
	
	public static int getInt() {
		Scanner in = new Scanner(System.in);
		String inputString;
		Pattern pattern = Pattern.compile("^\\d+$");
		Matcher matcher = null;
		do {
			inputString = in.nextLine();
			matcher = pattern.matcher(inputString);
		} while(!matcher.matches());
		in.close();
		return Integer.parseInt(inputString);
	}
}