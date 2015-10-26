package oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * @author Hedgehog
 *
 */
public class Solution {
	public static ArrayList<PhoneAbonent> listOfAbonent;
	public static ArrayList<PhoneAbonent> listOfFoundAbonent = new ArrayList<>();

	public static void main(String[] args) {
		listOfAbonent = buildAbonent(); //

		Scanner scanner = new Scanner(System.in);
		String inputString;
		System.out.println("Here is user-interface. For exit press 'q'");
		System.out.println("1: Fetch abonents whose continuance of intracity calls surpasses given (from keyboard)");
		System.out.println("2: Fetch abonents who make use of long-distance calls");
		System.out.println("3: Fetch abonents in alphabetical order of their surname");

		while (true) {
			inputString = scanner.nextLine();
			switch (inputString) {
			case "1":
				System.out.println("Enter time limit for checking continuance of intracity calls");
				double citytalk = Double.valueOf(scanner.nextLine());
				longTimeSpeaking(citytalk);
				break;
			case "2":
				System.out.println("List of abonents who use long-distance calls");
				interCitySpeaking(listOfAbonent);
				break;
			case "3":
				System.out.println("List of abonents in alphabetical order of their surname");
				fullAbonetsDetails(listOfAbonent);
				break;
			default:
				break;
			}
			if (inputString.startsWith("q") || (inputString.startsWith("Q"))) {
				break;
			}
		}

		scanner.close();
	}

	/**
	 * 
	 * @param citytalk
	 */
	public static void longTimeSpeaking(double citytalk) {
		System.out.println("List of abonents who make use of intracity calls more than " + citytalk + " minutes");
		/*clear collection "listOfFoundAbonent" before using for storing found 
		abonents in accordance with the conditions*/
		listOfFoundAbonent.clear();
		for (int i = 0; i < listOfAbonent.size(); i++) {
			if (listOfAbonent.get(i).getCityTalktime() > citytalk) {
				listOfFoundAbonent.add(listOfAbonent.get(i));
			}
		}
		headerPrint();
		showAbonentInfo(listOfFoundAbonent);
	}

	/**
	 * Searches and displays list of abonents who make use of inter-city calls
	 * 
	 * @param listOfAbonent - collection where is kept full list of abonents in the shape of objects
	 */
	public static void interCitySpeaking(ArrayList<PhoneAbonent> listOfAbonent) {
		/*clear collection "listOfFoundAbonent" before using for storing found 
		abonents in accordance with the conditions*/
		listOfFoundAbonent.clear();
		for (int i = 0; i < listOfAbonent.size(); i++) {
			if (listOfAbonent.get(i).getInterCityTalktime() > 0) {
				listOfFoundAbonent.add(listOfAbonent.get(i));
			}
		}
		headerPrint();
		showAbonentInfo(listOfFoundAbonent);
	}
	
	/**
	 * Searches and displays list of abonents who make use of long-distance calls
	 * @param listOfAbonent - listOfAbonent - collection where is kept full list of abonents in the shape of objects
	 */
	public static void fullAbonetsDetails(ArrayList<PhoneAbonent> listOfAbonent) {
		/*clear collection "listOfFoundAbonent" before using for storing found 
		abonents in accordance with the conditions*/
		listOfFoundAbonent.clear();
		for (PhoneAbonent element : listOfAbonent) {
			listOfFoundAbonent.add(element);
		}
		Collections.sort(listOfFoundAbonent);
		headerPrint();
		showAbonentInfo(listOfFoundAbonent);
	}

	/**
	 * Prints header of the table with abonent's information
	 */
	public static void headerPrint() {
		System.out.format("%-6s%-10s%-10s%-12s%-12s%-16s%-20s", "№п/п", "Surname", "Name", "Address", "Credit card",
				"IntraCity (min)", "Long-distance (min)");
		System.out.println();
	}

	/**
	 * Prints collection "listOfFoundAbonent" where different methods put information in accordance with the conditions 
	 * @param listOfFoundAbonent - collection List where is kept selection of information from different methods 
	 */
	public static void showAbonentInfo(ArrayList<PhoneAbonent> listOfFoundAbonent) {
		for (PhoneAbonent abonent : listOfFoundAbonent) {
			if (abonent != null) {
				System.out.format("%-6s%-10s%-10s%-12s%-12s%-16s%-20s", abonent.getId(), abonent.getSurname(),
						abonent.getName(), abonent.getAddress(), abonent.getCreditCardNumber(),
						abonent.getCityTalktime(), abonent.getInterCityTalktime());
				System.out.println();
			}
		}
	}

	/**
	 * Creates collection where is kept all information about Phone Abonents in the shape of objects 
	 * @return created ArrayList with information 
	 */
	public static ArrayList<PhoneAbonent> buildAbonent() {
		listOfAbonent = new ArrayList<PhoneAbonent>();

		PhoneAbonent phoneAbonent = new PhoneAbonent(1, "Marshall", "George", "Nelidenga", 346764900, 260, 0);
		listOfAbonent.add(phoneAbonent);
		PhoneAbonent phoneAbonent1 = new PhoneAbonent(2, "Walsh", "Robert", "Slobino", 342751843, 2602, 224);
		listOfAbonent.add(phoneAbonent1);
		PhoneAbonent phoneAbonent2 = new PhoneAbonent(3, "Page", "Elvin", "Panteleevo", 342751233, 540, 24);
		listOfAbonent.add(phoneAbonent2);
		PhoneAbonent phoneAbonent3 = new PhoneAbonent(4, "French", "Magdalen", "Punteangus", 342751843, 45, 0);
		listOfAbonent.add(phoneAbonent3);
		PhoneAbonent phoneAbonent4 = new PhoneAbonent(5, "Greene", "Donna", "Koshuhinn", 566751843, 340, 24);
		listOfAbonent.add(phoneAbonent4);
		PhoneAbonent phoneAbonent5 = new PhoneAbonent(6, "Verity", "Dennis", "Pelevinino", 566271863, 40, 0);
		listOfAbonent.add(phoneAbonent5);
		PhoneAbonent phoneAbonent6 = new PhoneAbonent(7, "Atkins", "Julius", "Kichigoda", 562374865, 58, 0);
		listOfAbonent.add(phoneAbonent6);
		PhoneAbonent phoneAbonent7 = new PhoneAbonent(8, "Little", "Dorothy", "Sheybeng", 346452718, 87, 24);
		listOfAbonent.add(phoneAbonent7);
		PhoneAbonent phoneAbonent8 = new PhoneAbonent(9, "McKenzie", "Margaret", "Yermakega", 346452718, 878, 245);
		listOfAbonent.add(phoneAbonent8);
		PhoneAbonent phoneAbonent9 = new PhoneAbonent(10, "Miller", "Robert", "Gorkiha", 346452718, 740, 442);
		listOfAbonent.add(phoneAbonent9);
		return listOfAbonent;
	}

}
