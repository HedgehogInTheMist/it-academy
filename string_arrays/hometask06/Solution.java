package string_arrays.hometask06;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first string: ");
		String firstString = scanner.nextLine();
		
		System.out.println("Enter your second string: ");
		String secondString = scanner.nextLine();
		char[] firstChars = firstString.toCharArray();
		char[] secondChars = secondString.toCharArray();
				firstString = sort(firstString);
				System.out.println(firstString);
				secondString = sort(secondString);
				if(permutation (firstString, secondString)) {
					System.out.println("String's transformation are possible");
				} else 
					System.out.println("String's transformation aren't possible!");
	}
				
							/*	for(int i = 0; i < firstChars.length ; i++) {
									 for(int j = i+1 ; j < firstChars.length-1; j++) {
										if(firstChars[i] > firstChars[j]) {
											char temp = firstChars[j];
											firstChars[j] = firstChars[j+1];
											firstChars[i+1] = temp;
										}
									}
								}
								System.out.println(Arrays.toString(firstChars)); */
	
	public static String sort(String s) {
	    char[] content = s.toCharArray();
	    java.util.Arrays.sort(content);
	    return new String(content);
	}
	 
	public static boolean permutation (String s,String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    return sort(s).equals(sort(t));
	}
}
