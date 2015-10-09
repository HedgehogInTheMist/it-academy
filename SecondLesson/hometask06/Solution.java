package SecondLesson.hometask06;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Modify integer amount of currency in writing form
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.print("Введите сумму рублей от 1 до 999: ");
		int currency = getInt();
		modifyCurrency(currency);		
	}

	private static void modifyCurrency(int currency) {
		if(currency % 10 == 1 && currency != 11) {
			System.out.println("У вас " + currency + " рубль.");
		} else if((currency % 10 >= 2) && (currency % 10 <= 4) && ((currency % 100 < 10) || (currency % 100 >= 20))) {
			System.out.println("У вас " + currency + " рубля.");
		} else System.out.println("У вас " + currency + " рублей.");
	}

/**
 * 	Discarted everything from System.in apart integers.
 * @return - integers from System.in
 */
	public static int getInt() {
		String inputString;
		Scanner in = new Scanner(System.in);
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
