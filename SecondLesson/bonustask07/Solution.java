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
		String inputString = null;
		Scanner sign = new Scanner(System.in);
		Scanner operands = new Scanner(System.in);
		
		System.out.println("Implementing Calculator.");
		System.out.println("Choose expression and enter one of the expression's signs (+, -, *, /). Enter 'q' for exit!");
		
			while(true) {
			inputString = sign.nextLine();
			switch(inputString) {
			case "+": 
				composition(operands);
				break;
			case "-":
				subtraction(operands);
				break;
			case "*":
				multiplication(operands);
				break;
			case "/":
				division(operands);
				break;
			default : break;
			}
			if(inputString.equals("q")) {
			 break;
			 }
		}
		sign.close();
	}

	/**
	 * Implement division of two operands 
	 * @param operands - receive operands from input stream
	 */
	public static void division(Scanner operands) {
		int firstOperand;
		int secondOperand;
		System.out.print("Enter first operand: ");
		firstOperand = getInt(operands);
		System.out.print("Enter second operand: ");
		secondOperand = getInt(operands);
		if(secondOperand == 0) {
			System.out.println("Divide-by-zero");
			System.exit(1);
		}
		System.out.println("Result of " + firstOperand + " / " + secondOperand + " equals: " + (double) (firstOperand / secondOperand));
	}
	
	/**
	 * Implement multiplication of two operands 
	 * @param operands - receive operands from input stream
	 */
	public static void multiplication(Scanner operands) {
		int firstOperand;
		int secondOperand;
		System.out.print("Enter first operand: ");
		firstOperand = getInt(operands);
		System.out.print("Enter second operand: ");
		secondOperand = getInt(operands);
		System.out.println("Result of " + firstOperand + " * " + secondOperand + " equals: " + (double) (firstOperand * secondOperand));
	}
	
	/**
	 * Implement subtraction of two operands 
	 * @param operands - receive operands from input stream
	 */
	public static void subtraction(Scanner operands) {
		int firstOperand;
		int secondOperand;
		System.out.print("Enter first operand: ");
		firstOperand = getInt(operands);
		System.out.print("Enter second operand: ");
		secondOperand = getInt(operands);
		System.out.println("Result of " + firstOperand + " - " + secondOperand + " equals: " + (double) (firstOperand - secondOperand));
	}
/**
 * Implement composition of two operands
 * @param operands - receive operands from input stream
 */
	public static void composition(Scanner operands) {
		int firstOperand;
		int secondOperand;
		System.out.print("Enter first operand: ");
		firstOperand = getInt(operands);
		System.out.print("Enter second operand: ");
		secondOperand = getInt(operands);
		System.out.println("Result of " + firstOperand + " + " + secondOperand + " equals: " + (double) (firstOperand + secondOperand));
	}
	
	public static int getInt(Scanner operands) {
		String inputString;
		Pattern pattern = Pattern.compile("^\\d+$");
		Matcher matcher = null;
		do {
			inputString = operands.nextLine();
			matcher = pattern.matcher(inputString);
		} while(!matcher.matches());
		return Integer.valueOf(inputString);
	}
	
		
}

