package SecondLesson.hometask05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lesson Two HomeTaskFive;
 * <br>Calculating ideal weight
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println("Calculating your ideal weight.");
		System.out.print("Enter your height (cm): " );
		int height = getInt();
		System.out.print("Enter your weight (kg): ");
		int weight = getInt();
		calcIdealWeight(height, weight);
	}
/**
 * Calculate user's ideal weight, based on their current height and weight
 * @param height - user's current height
 * @param weight - user's current weight
 */
	private static void calcIdealWeight(int height, int weight) {
		int idealWeight = height - weight - 100;
		if (idealWeight == 0) {
			System.out.println("You have ideal weight!");
		} else if(idealWeight > 0) {
				System.out.println("You too skinny and need to gain " + idealWeight + " kg.");
			} else if (idealWeight < 0) {
				System.out.println("It seems to me you need to loose " + Math.abs(idealWeight) + " kg.");
			}
	}
	

/**
 * Discarted everything from System.in apart integers.
 * 
 * @return integers from System.in
 */
	public static int getInt() {
		String inputStr;
		Scanner in = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^\\d+$");
		Matcher matcher = null;
		do {
			inputStr = in.nextLine();
			matcher = pattern.matcher(inputStr);					
		} while(!matcher.matches());
		in.close();
		return Integer.parseInt(inputStr);
	}
}
