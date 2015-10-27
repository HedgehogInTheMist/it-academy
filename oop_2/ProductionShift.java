package oop_2;

import java.util.ArrayList;
import java.util.Random;

public class ProductionShift {

	private String workOption; //for choosing work shift - first or second 
	private String[] jewelryVariety = {"Beads", "Pendants", "Earrings", "Diadems", "Neklaces"};
	private static ArrayList<Jeweller> jewellers = new ArrayList<Jeweller>();
	
		public String[] getJewelryVariety() {
		return jewelryVariety;
	}

	public void setJewelryVariety(String[] jewelryVariety) {
		this.jewelryVariety = jewelryVariety;
	}

		public String getWorkOption() {
		return workOption;
	}

	public void setWorkOption(String workOption) {
		this.workOption = workOption;
	}
	
	public ProductionShift() {
	}
	
	
	//ProductionShift productionShift = new ProductionShift();
	
	PreciousStone preciousStone = new PreciousStone();
	SemiPreciousStone semiPreciousStone = new SemiPreciousStone();
	//Jeweller jeweller = new Jeweller();
	
	public void startProductionShift() {
		buildJewellerWorkers();
		
		jewellerRotation();
		
		Random random = new Random();
		ArrayList<PreciousStone> precious_stones  = new ArrayList<PreciousStone>();
		for(int i = 0; i < 10; i++) {
			precious_stones.add(new PreciousStone(getJewelryVariety()[random.nextInt(4) + 1] + " " + i, random.nextInt(8) + 1, random.nextInt(5) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(7) + 1));
		}
		
		for(PreciousStone element : precious_stones) {
			if(element instanceof PreciousStone) {
				System.out.println(element.getName() + " " + element.getHardness() + " " + element.getLength() + " " + element.getWidth() + " " + element.getHeight() + " " + element.getTransparency());
			}
		}
	}

	/**
	 * Implements rotation production shift between two jewellers.
	 */
	private void jewellerRotation() {
		int randIndex = (Math.random() < 0.5) ? 0 : 1;
		if(randIndex == 0) {
			System.out.println(jewellers.get(0).getName() + " " + jewellers.get(0).getSurname() + " is at work upon " + getRandWorkOption());
		} else {
			System.out.println(jewellers.get(1).getName() + " " + jewellers.get(1).getSurname() + " is at work upon " + getRandWorkOption());
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

/*	static ArrayList<Fossil> fossil = new ArrayList<Fossil>();
	static ArrayList<PreciousStone> precious_stones  = new ArrayList<PreciousStone>();
*/	
