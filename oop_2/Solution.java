package oop_2;

import java.util.ResourceBundle;
import java.util.Scanner;

import oop_2.gemsProduction.GemSorting;
import oop_2.gemsProduction.ProductionShift;
import oop_2.util.Localization;
import oop_2.util.TransparencyLogicException;
import oop_2.util.UserInterfaceProcessing;

/**
 * Inmlements main method and build user-interface menu
 * @author Hedgehog
 *
 */
public class Solution {
	
	public static Logger logger = Logger.getInstance();
	
	public static void main(String[] args) {
		
		GemSorting gemSorting = new GemSorting();
		ProductionShift productionShift = new ProductionShift();
		UserInterfaceProcessing userInterfaceProcessing = new UserInterfaceProcessing();
		
		userInterfaceProcessing(gemSorting, productionShift, userInterfaceProcessing);
	}

	/**
	 * @param gemSorting
	 * @param productionShift
	 * @param userInterfaceProcessing
	 * @throws NumberFormatException
	 */
	private static void userInterfaceProcessing(GemSorting gemSorting, ProductionShift productionShift,
			UserInterfaceProcessing userInterfaceProcessing) throws NumberFormatException {
		String inputString;
		String userAnswer;
		Scanner scanner = new Scanner(System.in);
		Scanner repeatAgain = new Scanner(System.in);
		
		Localization local = new Localization();
		ResourceBundle bundle = local.localization(scanner);
		
		do {
			productionShift.buildJewellerWorkers();	    
			productionShift.jewellerRotation(bundle);		    
			productionShift.preciousOrSemiPrecious(bundle);	
			printUserInterface(bundle);        			    
			while (true) {
				inputString = scanner.nextLine();
				switch (inputString) {
				case "1":
					logger.logging("User selected first menu entry.");
					productionShift.mapCarat.clear();
					productionShift.buildMapOfGemsValue(productionShift.listForAssessment, productionShift.mapCarat);
					userInterfaceProcessing.gemsAssessment(productionShift.mapCarat, bundle);
					printUserInterface(bundle);
					break;
				case "2":
					logger.logging("User selected second menu entry.");
					userInterfaceProcessing.totalGemsValueEstimation(productionShift.mapCarat, bundle);
					printUserInterface(bundle);
					break;
				case "3":
					logger.logging("User selected third menu entry.");
					System.out.println(bundle.getString("transparencyValue"));
						int value = Integer.valueOf(scanner.nextLine());
						if(value < 0) {
							try {
								logger.logging("User entered inconrrect value of Transparency. Value can't be lower 0.");
								throw new TransparencyLogicException(bundle.getString("incorrectTransparency"));
							} catch (TransparencyLogicException e) {
									System.err.println(bundle.getString("errMessNoNegativeTransparency"));
							  }
						}
					gemSorting.headerPrint(bundle);
					userInterfaceProcessing.transparencyEstimation(productionShift.listForAssessment, value);
					printUserInterface(bundle);
					break;
				case "4":
					logger.logging("User selected fourth menu entry.");
					userInterfaceProcessing.transferToFile(productionShift.listForAssessment);
					System.out.println(bundle.getString("successfulSerializationMess"));
					break;
				case "5":
					logger.logging("User selected fifth menu entry.");
					gemSorting.headerPrint(bundle);
					userInterfaceProcessing.transferFromFile();
					System.out.println(bundle.getString("successfulDeserializationMess"));
					break;
				default:
					break;
				}
				if (inputString.startsWith("q") || (inputString.startsWith("Q"))) {
					logger.logging("User quit.");
					break;
				}
			}
			System.out.println();
			System.out.println(bundle.getString("alreadyQuitting?"));
			userAnswer = repeatAgain.nextLine();
		} while((userAnswer.startsWith("y")) || (userAnswer.startsWith("Y")));
		repeatAgain.close();
		scanner.close();
	}

	/**
	 * Prints options of user-interface menu 
	 */
	private static void printUserInterface(ResourceBundle bundle) {
		System.out.println("____________________________________________________________________________________________");
		System.out.println(bundle.getString("userInterfaceHeader"));
		System.out.println(bundle.getString("userInterfaceFirstEntry"));
		System.out.println(bundle.getString("userInterfaceSecondEntry"));
		System.out.println(bundle.getString("userInterfaceThirdEntry"));
		System.out.println(bundle.getString("userInterfaceFourthEntry"));
		System.out.println(bundle.getString("userInterfaceFifthEntry"));
	}
}