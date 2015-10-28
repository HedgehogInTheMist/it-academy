package oop_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
/**
 * Implements gems storage and sorting methods
 * @author Hedgehog
 */
public class GemSorting {
	boolean preciousOrSemiPrecious;
	
	public ArrayList<PreciousStone> listOfPreciousGems = new ArrayList<>();
	public ArrayList<SemiPreciousStone> listOfSemiPreciousGems = new ArrayList<>();
	//public static HashMap<String, Integer> hardnessRate = new HashMap<>();
	private String[] jewelryVariety = {"Beads", "Pendants", "Earrings", "Diadems", "Neklaces"};
	protected String[] preciousStoneVariety = {"Diamond", "Corund", "Ruby", "Sapphire", "Beryl", "Aquamarine", "Alexandrite", "Pearl"};
	protected String[] semiPreciousStoneVariety = {"Apatite", "Turquoise", "Onychite", "Greenstone", "Jasper", "Malachite", "Amber"};
	//protected Double[] stonesHardness = {}
	
	HashMap<String, Double> stonesHardness = new HashMap<>(); //Отражение формы драгоценного камня к его твердости

	//public void hardnessAndShape();
	
	Random random = new Random();
	
	public String[] getJewelryVariety() {
		return jewelryVariety;
	}


	/**
	 * 
	 */
	public void buildMapOfHardnessAndShape() {
		stonesHardness.put("Sphere", 0.0018);
		stonesHardness.put("Ellipse", 0.0020);
		stonesHardness.put("Octagon", 0.00245);
		stonesHardness.put("Square", 0.0023);
		stonesHardness.put("Pear", 0.00175);
	}


	public void setJewelryVariety(String[] jewelryVariety) {
		this.jewelryVariety = jewelryVariety;
	}


	/**
	 * 
	 */
	public void showAllPreciousStone(ArrayList<PreciousStone> listOfPreciousStones) {
		
		for(PreciousStone element : listOfPreciousGems) {
			//if(element instanceof PreciousStone) 
			if(element != null) {	
				System.out.format("%-14s%-12d%-12d%-12d%-12d%-9d%n", element.getName(), element.getHardness(), element.getLength(), element.getWidth(), element.getHeight(), element.getTransparency());
			}
		}
		listOfPreciousStones.clear();
	}
	
	public void showAllSemiPreciousStone(ArrayList<SemiPreciousStone> listOfSemiPreciousStones) {
		
		for(SemiPreciousStone element : listOfSemiPreciousGems) {
			//if(element instanceof SemiPreciousStone) {
			System.out.format("%-14s%-12d%-12d%-12d%-12d%-9d%n", element.getName(), element.getHardness(), element.getLength(), element.getWidth(), element.getHeight(), element.getTransparency());
			//}
		}
	}
	
	public void headerPrint() {
		System.out.format("%-14s%-12s%-12s%-12s%-12s%-19s%n", "List Of Gems", "Length (mm)", "Width (mm)", "Height (mm)", "Hardness", "Transparency" );
	}

	public void buildListOfPreciousGems() {
		for(int i = 0; i < 10; i++) {
			String n = preciousStoneVariety[random.nextInt(preciousStoneVariety.length)];
			int l = random.nextInt(22) + 3;
			int w = random.nextInt(22) + 3;
			int hi = random.nextInt(22) + 3;
			int ha = random.nextInt(22) + 3;
			int t = random.nextInt(24) + 1;
			listOfPreciousGems.add(new PreciousStone(n, l, w, hi, ha, t));
		}
	}
	
	public void buildListOfSemiPreciousGems() {
		for(int i = 0; i < 10; i++) {
			String n = semiPreciousStoneVariety[random.nextInt(semiPreciousStoneVariety.length)];
			int l = random.nextInt(22);
			int w = random.nextInt(22) + 3;
			int hi = random.nextInt(22) + 3;
			int ha = random.nextInt(22) + 3;
			int t = random.nextInt(24) + 1;
			listOfSemiPreciousGems.add(new SemiPreciousStone(n, l, w, hi, ha, t));
		}
	}
	
	
}
