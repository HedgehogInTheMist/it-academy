package oop;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		PhoneAbonent[] abonents = new PhoneAbonent[10];
		abonents[0] = new PhoneAbonent(1, "Marshall", "George", "Nelidenga", 346764900, 260, 0);
		abonents[1] = new PhoneAbonent(2, "Walsh", "Robert", "Slobino", 342751843, 2602, 224);
		abonents[2] = new PhoneAbonent(3, "Page", "Elvin", "Panteleevo", 342751233, 540, 24);
		abonents[3] = new PhoneAbonent(4, "French", "Magdalen", "Punteangus", 342751843, 45, 0);
		abonents[4] = new PhoneAbonent(5, "Greene", "Donna", "Koshuhinn", 566751843, 340, 24);
		abonents[5] = new PhoneAbonent(6, "Verity", "Dennis", "Pelevinino", 566271863, 40, 0);
		abonents[6] = new PhoneAbonent(7, "Atkins", "Julius", "Kichigoda", 562374865, 58, 0);
		abonents[7] = new PhoneAbonent(8, "Little", "Dorothy", "Sheybeng", 346452718, 87, 24);
		abonents[8] = new PhoneAbonent(9, "McKenzie", "Margaret", "Yermakega", 346452718, 878, 245);
		abonents[9] = new PhoneAbonent(10, "Miller", "Robert", "Gorkiha", 346452718, 740, 442);
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		System.out.println("Here is user-interface. For exit press 'q'");
		System.out.println(
				"1: для выбора сведений об абонентах, у которых время внутригородских разговоров превышает заданное");
		System.out.println("2: для выбора сведений об абонентах, которые пользовались междугородной связью");
		System.out.println("3: для выбора сведений об абонентах в алфавитном порядке");
		PhoneAbonent phoneAbonent = new PhoneAbonent();
		
		while (true) {
			inputString = scanner.nextLine();
			switch (inputString) {
			case "1":
				System.out.println("Введите контрольное время внутригородских переговоров");
				phoneAbonent.headerPrint();
				phoneAbonent.longTimeSpeaking(Integer.valueOf(scanner.nextLine()), abonents);
				
				break;
			case "2":
				System.out.println("Сведения об абонентах, которые пользовались междугородней связью");
				phoneAbonent.headerPrint();
				phoneAbonent.interCitySpeaking(abonents);
				break;
			case "3":
				System.out.println("Cведенич об абонентах в алфавитном порядке");
				phoneAbonent.headerPrint();
				phoneAbonent.abonetsDetails(abonents);
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
}