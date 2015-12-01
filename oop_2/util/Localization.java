package oop_2.util;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import oop_2.Logger;

public class Localization {
	
	public static Logger logger = Logger.getInstance();
	
	/**
	 * @param scanner
	 * @return
	 */
	public ResourceBundle localization(Scanner scanner) {
		String language;
		System.out.println("Choose language/Выберите язык");
		System.out.println("1: English\n2: Русский");
			
		ResourceBundle bundle;
			language = scanner.nextLine();
			switch (language) {
			case "1": 
				Locale enLoc = new Locale("en", "US");
				logger.logging("User selected English language.");
				bundle = ResourceBundle.getBundle("oop_2/resources/LangResources", enLoc);
				break;
			case "2":
				Locale ruLoc = new Locale("ru", "RU");
				logger.logging("User selected Russian language.");
				bundle = ResourceBundle.getBundle("oop_2/resources/LangResources", ruLoc);
				break;
			default:
				Locale defaultLoc = new Locale("en", "US");
				bundle = ResourceBundle.getBundle("oop_2/resources/LangResources", defaultLoc);
				break;
			}
		return bundle;
	}
}
