package oop_2;

import java.awt.Transparency;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ProductionShift {

	private String workOption; //for choosing work shift - first or second 
	private String[] jewelryVariety = {"Beads", "Pendants", "Earrings", "Diadems", "Neklaces"};
	protected String[] preciousStoneVariety = {"Diamond", "Corund", "Ruby", "Sapphire", "Beryl", "Aquamarine", "Alexandrite", "Pearl"};
	private static ArrayList<Jeweller> jewellers = new ArrayList<Jeweller>();
	
	GemSorting gemSorting = new GemSorting();
	
	public String getWorkOption() {
		return workOption;
	}

	public void setWorkOption(String workOption) {
		this.workOption = workOption;
	}
	
	public ProductionShift() {
	}
	
	
	PreciousStone preciousStone = new PreciousStone();
	SemiPreciousStone semiPreciousStone = new SemiPreciousStone();
	
	public void startProductionShift() {
		buildJewellerWorkers();
		jewellerRotation();		//Our jewellers change each other in production
		
		int preciousOrSemiPrecious = (Math.random() < 0.5) ? 0 : 1;
			if(preciousOrSemiPrecious == 1) {
				System.out.println(" Precious gems");
				gemSorting.buildListOfPreciousGems();
				Collections.sort(gemSorting.listOfPreciousGems); //Sorting our collection by field transparency in accordance with condition
				gemSorting.headerPrint();
				gemSorting.showAllPreciousStone(gemSorting.listOfPreciousGems);
			} else {
				System.out.println(" Semi-precious gems");
				gemSorting.buildListOfSemiPreciousGems();
				Collections.sort(gemSorting.listOfSemiPreciousGems); //Sorting our collection by field transparency in accordance with condition
				gemSorting.headerPrint();
				gemSorting.showAllSemiPreciousStone(gemSorting.listOfSemiPreciousGems);
			}
	}

	/**
	 * Implements rotation production shift between two jewellers.
	 */
	private void jewellerRotation() {
		int randIndex = (Math.random() < 0.5) ? 0 : 1;
		if(randIndex == 0) {
			System.out.println(jewellers.get(0).getName() + " " + jewellers.get(0).getSurname() + " is at work upon " + getRandWorkOption());
			System.out.print(jewellers.get(0).getSurname() + " considers it done out of");
		} else {
			System.out.println(jewellers.get(1).getName() + " " + jewellers.get(1).getSurname() + " is at work upon " + getRandWorkOption());
			System.out.print(jewellers.get(0).getSurname() + " considers it done out of");
		}
	}

	/**
	 * Filling "ArrayList jewellers" with our Jewellers
	 */
	public void buildJewellerWorkers() {
		Jeweller jewellerOne = new Jeweller("Kristoff", "Kovalskiy");
		jewellers.add(jewellerOne);
		Jeweller jewellerTwo = new Jeweller("Madur", "Rosovsky");
		jewellers.add(jewellerTwo);
	}
	
	//Rendering a decision about, what kind of jewelry to produce out of array
	public String getRandWorkOption() {
		Random random = new Random();
		int randNumber = random.nextInt(4) + 1; 
		workOption = jewelryVariety[randNumber];
		return jewelryVariety[randNumber];
	}

			
}
	
