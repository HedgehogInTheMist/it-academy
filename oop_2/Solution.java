package oop_2;
import java.util.Scanner;
import oop_2.gemsProduction.ProductionShift;
import oop_2.util.UserInterfaceProcessing;

/**
 * Inmlements main method and build user-interface menu
 * @author Hedgehog
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		
		ProductionShift productionShift = new ProductionShift();
		UserInterfaceProcessing userInterfaceProcessing = new UserInterfaceProcessing();
		Scanner scanner = new Scanner(System.in);
		String inputString;
		String userAnswer;
		Scanner repeatAgain = new Scanner(System.in);

		do {
			productionShift.buildJewellerWorkers();	    //Creates two working jewellers
			productionShift.jewellerRotation();		    //Our jewellers change each other in production. (Either of two jewellers may work immediatly)
			productionShift.preciousOrSemiPrecious();	//Selection production resource (Produce jewelry either out of precious gems or semi-precious gems
			printUserInterface();        			    //Prints user - interface menu
			while (true) {
				inputString = scanner.nextLine();
				switch (inputString) {
				case "1":		// Prints list of jewelry sorted weight in carat
					productionShift.mapCarat.clear();
					productionShift.buildMapOfGemsValue(productionShift.listForAssessment, productionShift.mapCarat);
					userInterfaceProcessing.gemsAssessment(productionShift.mapCarat);
					printUserInterface();
					break;
				case "2":		//Prints total weight (in carat) and total price for jewelry
					userInterfaceProcessing.totalGemsValueEstimation(productionShift.mapCarat);
					printUserInterface();
					break;
				case "3":		//Prints list of gems which transparency characteristics is surpasses given value from keyboard
					System.out.println("Enter transparency value for further selection");
					int value = Integer.valueOf(scanner.nextLine());
					userInterfaceProcessing.transparencyEstimation(productionShift.listForAssessment, value);
					printUserInterface();
					break;
				case "4":
					userInterfaceProcessing.transferToFile(productionShift.listForAssessment);
					System.out.println("Object send to file");
					break;
				case "5":
					userInterfaceProcessing.transferFromFile();
					System.out.println("Object read from file and printed");
					break;
				default:
					break;
				}
				if (inputString.startsWith("q") || (inputString.startsWith("Q"))) {
					break;
				}
			}
			System.out.println("\nRepeat production again? (y/n)");
			userAnswer = repeatAgain.nextLine();
		} while((userAnswer.startsWith("y")) || (userAnswer.startsWith("Y")));
		repeatAgain.close();
		scanner.close();
	}

	/**
	 * Prints options of user-interface menu 
	 */
	private static void printUserInterface() {
		System.out.println("____________________________________________________________________________________________");
		System.out.println("Here is user-interface. For exit press 'q/Q'");
		System.out.println("1: Fetch list of jewelry sorted by weight in carat");
		System.out.println("2: Fetch general value and weigth of jewelry (price/carat)");
		System.out.println("3: Fetch list of gems which transparency is surpasses given value (from keyboard)");
		System.out.println("4: Checking serialization");
		System.out.println("5: Checking deserialization");
	}
}