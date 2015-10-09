package SecondLesson.bonustask07;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Calculator
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println("Implementing Calculator.");
		System.out.println("Choose expression and enter one of the expression's signs (+, -, *, /). Enter q for exit!");
		String inputString;
		String firstOperand, secondOperand;
		Scanner sign = new Scanner(System.in);
		Scanner operands = new Scanner(System.in);
		inputString = getSign();
		System.out.println(inputString);
			/*while(true) {
			inputString = getSign;
			
			switch(inputString) {
			case '+': 
				System.out.print("Enter first operand: ");
				
			}
			if(inputString.equals("q")) {
			 break;
			 }
		}
		sign.close();*/
	}
	public static String getSign() {
		String input;
		Scanner in = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^.*+-/*.*$");
		Matcher matcher = null;
		do {
			input = in.nextLine();
			matcher = pattern.matcher(input);
		} while(!matcher.matches());
		return input;
	}
		
	}

