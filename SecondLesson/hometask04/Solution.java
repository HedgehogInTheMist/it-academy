package SecondLesson.hometask04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lesson Two Exercise Four
 * 
 * Checking out System.in on whether entered year is leap year or not.
 *   
 * @author Hedgehog
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println("Searching leap year.");
		System.out.print("Enter year (example: 1874): ");
		int year = getInt();	//Receiving from 'System.in' year in Integer
		isLeapYear(year);		
	}
	
	private static void isLeapYear(int year) {
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is leap year!");
			} else System.out.println(year + " isn't leap year");
	}
/**
 * Putting in only integers, other values discarding
 * 	
 * @return
 */
	public static int getInt() {
		String str;
		Scanner in = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^\\d+$");
		Matcher matcher = null;
		do {
			str = in.nextLine();
			matcher = pattern.matcher(str);
		} while (!matcher.matches());
		in.close();
		return Integer.parseInt(str);
	}
}


