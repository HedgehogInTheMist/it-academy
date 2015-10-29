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
	
	private String[] jewelryVariety = {"Beads", "Pendants", "Earrings", "Diadems", "Neklaces"};
	protected String[] preciousStoneVariety = {"Diamond", "Corund", "Ruby", "Sapphire", "Beryl", "Aquamarine", "Alexandrite", "Pearl"};
	protected String[] semiPreciousStoneVariety = {"Apatite", "Turquoise", "Onychite", "Greenstone", "Jasper", "Malachite", "Amber"};
	
	HashMap<String, Double> stonesHardness = new HashMap<>(); //Отражение формы драгоценного камня к его твердости

	Random random = new Random();
	
	public String[] getJewelryVariety() {
		return jewelryVariety;
	}
	
	public void setJewelryVariety(String[] jewelryVariety) {
		this.jewelryVariety = jewelryVariety;
	}

	/**
	 * 
	 */
	public void showAllPreciousStone(ArrayList<PreciousStone> list) {
		
		for(PreciousStone element : list) {
			if(element != null) {	
				System.out.format("%-14s%-12d%-12d%-12d%-12d%-9d%n", element.getName(), element.getHardness(), element.getLength(), element.getWidth(), element.getHeight(), element.getTransparency());
			}
		}
		System.out.println();
	}
	
	public void showAllSemiPreciousStone(ArrayList<SemiPreciousStone> listOfSemiPreciousStones) {
		
		for(SemiPreciousStone element : listOfSemiPreciousGems) {
			System.out.format("%-14s%-12d%-12d%-12d%-12d%-9d%n", element.getName(), element.getHardness(), element.getLength(), element.getWidth(), element.getHeight(), element.getTransparency());
		}
		System.out.println();
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
			int l = random.nextInt(22) + 3;
			int w = random.nextInt(22) + 3;
			int hi = random.nextInt(22) + 3;
			int ha = random.nextInt(22) + 3;
			int t = random.nextInt(24) + 1;
			listOfSemiPreciousGems.add(new SemiPreciousStone(n, l, w, hi, ha, t));
		}
	}
	
	
}
