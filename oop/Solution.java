package oop;

import java.util.Scanner;


public class Solution {
	public static PhoneAbonent[] abonents;
	
	public static void main(String[] args) {
		 abonents = buildAbonent();
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		System.out.println("Here is user-interface. For exit press 'q'");
		System.out.println("1: Сведения об абонентах, у которых время внутригородских разговоров превышает заданное");
		System.out.println("2: Сведения об абонентах, которые пользовались междугородной связью");
		System.out.println("3: Сведения об абонентах в алфавитном порядке");
		
		while (true) {
			inputString = scanner.nextLine();
			switch (inputString) {
			case "1":
				System.out.println("Введите контрольное время внутригородских переговоров");
				double citytalk = Double.valueOf(scanner.nextLine());
				longTimeSpeaking(citytalk);
				break;
			case "2":
				System.out.println("Сведения об абонентах, которые пользовались междугородней связью");
				interCitySpeaking(abonents);
				break;
			case "3":
				System.out.println("Cведения об абонентах в алфавитном порядке");
				fullAbonetsDetails(abonents);
				break;
			default:
				break;
			}
			if (inputString.equals("q")) {
				break;
			}
		}
	
		scanner.close();
	}

	/**
	 * @param citytalk
	 */
	public static void longTimeSpeaking(double citytalk) {
		System.out.println("Cведения об абонентах, у которых время внутригородских разговоров превышает " + citytalk + " минут");
		PhoneAbonent [] foundAbonents = new PhoneAbonent[10];
		for (int i = 0; i < abonents.length; i++) {
			if(abonents[i].getCityTalktime() > citytalk) {
				foundAbonents[i] = abonents[i];
			}  
		}
		if (foundAbonents != null) {
			headerPrint();
			showAbonentInfo(foundAbonents);
		}
	}
	
	public static void interCitySpeaking(PhoneAbonent[] abonents) {
		PhoneAbonent[] foundAbonents = new PhoneAbonent[10];
		for (int i = 0; i < abonents.length; i++) {
			if(abonents[i].getInterCityTalktime() > 0) {
				foundAbonents[i] = abonents[i];
			}
		}
		if (foundAbonents != null) {
			headerPrint();
			showAbonentInfo(foundAbonents);
		}
	}

	public static void fullAbonetsDetails(PhoneAbonent[] abonents) {
		//Arrays.sort(abonents);
		PhoneAbonent[] foundAbonents = new PhoneAbonent[10];
			if (abonents != null) {
				headerPrint();
				showAbonentInfo(abonents);
		}
	}
	
	public static void headerPrint() {
		System.out.format("%-6s%-10s%-10s%-12s%-12s%-12s%-10s", "№п/п", "Фамилия", "Имя", "Адрес", "Кредитка", "Город (мин)", "Межгород (мин)");
		System.out.println();
	}
	
	public static void showAbonentInfo(PhoneAbonent [] foundAbonents) {
		for(PhoneAbonent abonent: foundAbonents) {
			if(abonent != null) {	
				System.out.format("%-6s%-10s%-10s%-12s%-12s%-12s%-10s", abonent.getId(), abonent.getSurname(), abonent.getName(), abonent.getAddress(), abonent.getCreditCardNumber(), abonent.getCityTalktime(), abonent.getInterCityTalktime());
				System.out.println();
			}
		}
	}
	
	/**
	 * @return
	 */
	public static PhoneAbonent[] buildAbonent() {
		PhoneAbonent[] abonents = new PhoneAbonent[10];
		PhoneAbonent phoneAbonent = new PhoneAbonent(1, "Marshall", "George", "Nelidenga", 346764900, 260, 0);
		abonents[0] = phoneAbonent;
		PhoneAbonent phoneAbonent1 = new PhoneAbonent(2, "Walsh", "Robert", "Slobino", 342751843, 2602, 224);
		abonents[1] = phoneAbonent1;
		PhoneAbonent phoneAbonent2 = new PhoneAbonent(3, "Page", "Elvin", "Panteleevo", 342751233, 540, 24);
		abonents[2] = phoneAbonent2;
		PhoneAbonent phoneAbonent3 = new PhoneAbonent(4, "French", "Magdalen", "Punteangus", 342751843, 45, 0);
		abonents[3] = phoneAbonent3;
		PhoneAbonent phoneAbonent4 = new PhoneAbonent(5, "Greene", "Donna", "Koshuhinn", 566751843, 340, 24);
		abonents[4] = phoneAbonent4;
		PhoneAbonent phoneAbonent5 = new PhoneAbonent(6, "Verity", "Dennis", "Pelevinino", 566271863, 40, 0);
		abonents[5] = phoneAbonent5;
		PhoneAbonent phoneAbonent6 = new PhoneAbonent(7, "Atkins", "Julius", "Kichigoda", 562374865, 58, 0);
		abonents[6] = phoneAbonent6;
		PhoneAbonent phoneAbonent7 = new PhoneAbonent(8, "Little", "Dorothy", "Sheybeng", 346452718, 87, 24);
		abonents[7] = phoneAbonent7;
		PhoneAbonent phoneAbonent8 = new PhoneAbonent(9, "McKenzie", "Margaret", "Yermakega", 346452718, 878, 245);
		abonents[8] = phoneAbonent8;
		PhoneAbonent phoneAbonent9 = new PhoneAbonent(10, "Miller", "Robert", "Gorkiha", 346452718, 740, 442);
		abonents[9] = phoneAbonent9;
		return abonents;
	}


}
	