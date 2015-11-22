package oop_2.gemsProduction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.TreeMap;

import oop_2.hierarchy.NaturalStone;
import oop_2.hierarchy.PreciousStone;
import oop_2.hierarchy.SemiPreciousStone;
import oop_2.util.Serializator;


public class ProductionShift implements Serializable {
	
	private static final long serialVersionUID = 16726693954669404L;
	
	double coefficient; 
	private String workOption;  
	private String[] jewelryVariety = {"Beads", "Pendants", "Earrings", "Diadems", "Neklaces"};
	protected String[] preciousStoneVariety = {"Diamond", "Corund", "Ruby", "Sapphire", "Beryl", "Aquamarine", "Alexandrite", "Pearl"};
	private ArrayList<Jeweller> jewellers = new ArrayList<Jeweller>();
	public TreeMap<Double, String> mapCarat = new TreeMap<>();
	public ArrayList<NaturalStone> listForAssessment = new ArrayList<>();
	
	public ProductionShift() {
	}

	Serializator serializator = new Serializator();
	GemSorting gemSorting = new GemSorting();
	//UserInterfaceProcessing userInterfaceProcessing = new UserInterfaceProcessing();

	/**
	 * Randomly jeweller chooses coefficient and consequently shape of gem cutting
	 * @return
	 */
	public double getCoefficient() {
		double[] arrayOfCoefficient = {0.0018, 0.0020, 0.00245, 0.0023, 0.00175};
		Random random = new Random();
		int length = arrayOfCoefficient.length;
		int randomIndex = random.nextInt(length - 1);
		return arrayOfCoefficient[randomIndex];
	}

	/**
	 * Estimates gems value in carat. Estimation bases on length, width, height and coefficient (shape of gem cutting)
	 * @param list where kept all objects of gems
	 * @param map 
	 */
	public void buildMapOfGemsValue(ArrayList<NaturalStone> list, TreeMap<Double, String> map) {
		for(NaturalStone element : list) {
			double carat = 0;
			if(element != null) 
			carat = (double) (element.getLength() * element.getWidth() * element.getHeight()) * getCoefficient() * 5;
			map.put(carat, element.getName());
		}
	}
	
	/**
	 * Chooses either precious or semi-precious gems for production jewelry 
	 */
	public void preciousOrSemiPrecious(ResourceBundle bundle) {
		int preciousOrSemiPrecious = (Math.random() < 0.5) ? 0 : 1;
			if(preciousOrSemiPrecious == 1)
				printPreciousGems(bundle);
			else {
				printSemiPreciousGems(bundle);
			}
	}

/**
 * Prints elements of user-interface menu and list of Semi-precious gems sorted by transparency field and forms transitional list "listForAssessment" for further work 
 */
	private void printSemiPreciousGems(ResourceBundle bundle) {
		System.out.println(" " + bundle.getString("SPG"));
		System.out.println(bundle.getString("tableDescription2"));
		gemSorting.listOfSemiPreciousGems.clear();			 /*Clearing collection "listOfSemiPreciousGems", in case we start production two and more times. 
																Here collection is required to be empty */ 	
		gemSorting.buildListOfSemiPreciousGems();
		Collections.sort(gemSorting.listOfSemiPreciousGems); //Sorting our collection by field transparency in accordance with condition
		gemSorting.headerPrint(bundle);							 //Printing rezult 
		gemSorting.showAllSemiPreciousStone(gemSorting.listOfSemiPreciousGems);

		//coping created list of gems for future carat and price assessment				
		listForAssessment.clear();	
		for(SemiPreciousStone element : gemSorting.listOfSemiPreciousGems) {
			if(element != null) {
			listForAssessment.add(element);
			}
		}
	}

/**
 * Prints elements of user-interface menu and list of Precious gems sorted by transparency field and forms transitional list "listForAssessment" for further work
 */
	private void printPreciousGems(ResourceBundle bundle) {
			System.out.println(" " + bundle.getString("PG"));
			System.out.println(bundle.getString("tableDescription1"));
			gemSorting.listOfPreciousGems.clear(); /*Clearing collection "listOfPreciousGems", in case we start production two and more times. 
													  Here collection is required to be empty */
			gemSorting.buildListOfPreciousGems();
			Collections.sort(gemSorting.listOfPreciousGems); //Sorting our collection by field transparency in accordance with condition
			gemSorting.headerPrint(bundle);
			gemSorting.showAllPreciousStone(gemSorting.listOfPreciousGems);

			//coping created list of gems for future carat and price assessment
			listForAssessment.clear();	
			for(PreciousStone element : gemSorting.listOfPreciousGems) {
				if(element != null) {
					listForAssessment.add(element);
				}
			}
		}

	/**
	 * Implements rotation production shift between two jewellers.
	 */
	public void jewellerRotation(ResourceBundle bundle) {
		int randIndex = (Math.random() < 0.5) ? 0 : 1;
		if (randIndex == 0) {
			System.out.println("\n" + jewellers.get(0).getName() + " " + jewellers.get(0).getSurname() + " " + bundle.getString("workUpon") + " " + getRandWorkOption());
			System.out.print(jewellers.get(0).getName() + " " + bundle.getString("consider"));
		} else {
			System.out.println("\n" + jewellers.get(1).getName() + " " + jewellers.get(1).getSurname() + " " + bundle.getString("workUpon") + " " + getRandWorkOption());
			System.out.print(jewellers.get(1).getName() + " " + bundle.getString("consider"));
		}
	}

	/**
	 * Filling "ArrayList jewellers" with our Jewellers Creates two working jewellers
	 */
	public void buildJewellerWorkers() {
		Jeweller jewellerOne = new Jeweller("Hubert", "J. Farnswort"); 
		jewellers.add(jewellerOne);
		Jeweller jewellerTwo = new Jeweller("Zapp", "Brannigan"); 
		jewellers.add(jewellerTwo);
	}
	
	/**
	 * Rendering a decision about, what kind of jewelry to produce out of array
	 * @return random index from 1 up to 4 of array "jewelryVariety"
	 */
	public String getRandWorkOption() {
		Random random = new Random();
		int randNumber = random.nextInt(4) + 1; 
		workOption = jewelryVariety[randNumber];
		return jewelryVariety[randNumber];
	}
	
	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public String getWorkOption() {
		return workOption;
	}

	public void setWorkOption(String workOption) {
		this.workOption = workOption;
	}

}
	
