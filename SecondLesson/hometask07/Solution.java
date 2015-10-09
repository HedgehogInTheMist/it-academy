package SecondLesson.hometask07;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Correlate number with days of the week
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println("Enter day of the week (numbers 1-7): ");
		int dayOfTheWeek = getInt();
		switch(dayOfTheWeek) {
			case 1: 
				System.out.println("1st day of the week is Monday");
				break;
			case 2:
				System.out.println("2d day of the week is Tuesday");
				break;
			case 3:
				System.out.println("3d day of the week is Wednesday");
				break;
			case 4:
				System.out.println("4th day of the week is Thursday");
				break;
			case 5:
				System.out.println("5th day of the week is Friday");
				break;
			case 6:
				System.out.println("6th day of the week is Saturday");
				break;
			case 7:
				System.out.println("1st day of the week is Sunday");
				break;
			default: System.out.println("Day " + dayOfTheWeek + " doesn't exist. You've been warn to enter number 1-7");
		}
	}

	private static int getInt() {
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