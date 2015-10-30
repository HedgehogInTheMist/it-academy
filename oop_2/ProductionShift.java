package oop_2;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ProductionShift {

	private String workOption; //for choosing work shift - first or second 
	private String[] jewelryVariety = {"Beads", "Pendants", "Earrings", "Diadems", "Neklaces"};
	protected String[] preciousStoneVariety = {"Diamond", "Corund", "Ruby", "Sapphire", "Beryl", "Aquamarine", "Alexandrite", "Pearl"};
	private ArrayList<Jeweller> jewellers = new ArrayList<Jeweller>();
	private double[] arrayOfCoefficient = {0.0018, 0.0020, 0.00245, 0.0023, 0.00175};
	public ArrayList<NaturalStone> listForAssessment = new ArrayList<>();
						
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
		buildJewellerWorkers();	//Create two working jewellers
		jewellerRotation();		//Our jewellers change each other in production. (Either of two jewellers may work immediatly
		preciousOrSemiPrecious();	//Selection production resource (Produce jewelry either out of precious gems or semi-precious gems
		gemsAssessment(listForAssessment);
	}
	
	/**
	 * 
	 */
	public void gemsAssessment(ArrayList<NaturalStone> list)  {
		Random random = new Random();
		int length = arrayOfCoefficient.length;
		int randomIndex = random.nextInt(length - 1);
		ArrayList<Double> listOfCarrat = new ArrayList<>();
		for(NaturalStone element : list) {
			double carrat = 0;
			if(element != null) 
			carrat = (double) (element.getLength() * element.getWidth() * element.getHeight()) * arrayOfCoefficient[randomIndex] * 5;
			listOfCarrat.add(carrat);
				//System.out.format("%.3f карата " + "(" + element.getName() + ")" + "%n", carrat);
		}
		Collections.sort(listOfCarrat);
		for(Double element : listOfCarrat) {
			System.out.format("%8.3f карата%n", element);
		}
	}	
	
	/**
	 * Chooses either precious or semi-precious gems for production jewelry 
	 */
	public void preciousOrSemiPrecious() {
		int preciousOrSemiPrecious = (Math.random() < 0.5) ? 0 : 1;
			if(preciousOrSemiPrecious == 1) {
				System.out.println(" Precious gems\n\n");
				System.out.println("Here is a descriptive list of all gems sorted in ascending order of their transparency:");
				gemSorting.buildListOfPreciousGems();
				Collections.sort(gemSorting.listOfPreciousGems); //Sorting our collection by field transparency in accordance with condition
				gemSorting.headerPrint();
				gemSorting.showAllPreciousStone(gemSorting.listOfPreciousGems);
				//coping created lis of gems for future carrat and price assessment
				listForAssessment.clear();	
				for(PreciousStone element : gemSorting.listOfPreciousGems) {
					listForAssessment.add(element);
					
					String fileName = "d:\\Serialization.data";
					Serializator serializator = new Serializator();
					boolean check = serializator.serialization(element, fileName);
					
					try {
					element = (PreciousStone)serializator.deserialization(fileName);
				} catch (InvalidObjectException e) {
					System.err.println("Error");
					e.printStackTrace();
				}
				
				
				}
				
			} else {
				System.out.println(" Semi-precious gems\n\n");
				System.out.println("Here is a descriptive list of all gems sorted in ascending order of their transparency:");
				gemSorting.buildListOfSemiPreciousGems();
				Collections.sort(gemSorting.listOfSemiPreciousGems); //Sorting our collection by field transparency in accordance with condition
				gemSorting.headerPrint();
				gemSorting.showAllSemiPreciousStone(gemSorting.listOfSemiPreciousGems);
				//coping created lis of gems for future carrat and price assessment				
				listForAssessment.clear();	
				for(SemiPreciousStone element : gemSorting.listOfSemiPreciousGems) {
					listForAssessment.add(element);
				}
			}
	}

	/**
	 * Implements rotation production shift between two jewellers.
	 */
	private void jewellerRotation() {
		int randIndex = (Math.random() < 0.5) ? 0 : 1;
		if (randIndex == 0) {
			System.out.println(jewellers.get(0).getName() + " " + jewellers.get(0).getSurname() + " is at work upon " + getRandWorkOption());
			System.out.print(jewellers.get(0).getName() + " considers it done out of");
		} else {
			System.out.println(jewellers.get(1).getName() + " " + jewellers.get(1).getSurname() + " is at work upon " + getRandWorkOption());
			System.out.print(jewellers.get(1).getName() + " considers it done out of");
		}
	}

	/**
	 * Filling "ArrayList jewellers" with our Jewellers
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
}
	
