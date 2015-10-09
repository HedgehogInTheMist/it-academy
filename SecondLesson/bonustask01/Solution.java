package SecondLesson.bonustask01;


import java.io.IOException;
import java.util.Scanner;

/**
 * Searching day of the week by the certain date entered from keyboard
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) throws IOException {
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter date in format dd.mm.yyyy with . as delimeters: ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		String[] date = inputString.split("\\D+");
		dayOfTheWeek(date);
		scanner.close();
	}
/**
 * Method calculates day of the week according to the formula
 * <br> It seems to me formula contains error. Gotten day is in advance by one day.
 * 
 * @param date - array where we keep our date
 */
	private static void dayOfTheWeek(String[] date) {
		int d = Integer.parseInt(date[0]);
		int m = Integer.parseInt(date[1]);
		int Y = Integer.parseInt(date[2].substring(2, 4));
		int c = Integer.parseInt(date[2].substring(0, 2));
		int rezult;
		rezult = (d + (1 / 5 * (13 * m - 1)) + Y + (Y / 4) + (c / 4) - 2 * c + 777) % 7;
		System.out.println(rezult);
		switch (rezult) {
		case 1:
			System.out.println("Это понедельник");
			break;
		case 2:
			System.out.println("Это вторник");
			break;
		case 3:
			System.out.println("Это среда");
			break;
		case 4:
			System.out.println("Это четверг");
			break;
		case 5:
			System.out.println("Это пятница");
			break;
		case 6:
			System.out.println("Это суббота");
			break;
		case 0:
			System.out.println("Это воскресенье");
			break;
		default:
			break;
		}
	}
}
