package oop_2.gemsProduction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import oop_2.hierarchy.PreciousStone;
import oop_2.hierarchy.SemiPreciousStone;
/**
 * Implements gems storage and sorting methods
 * @author Hedgehog
 */
public class GemSorting implements Serializable {
	
	public static final long serialVersionUID = 7L;
	
	boolean preciousOrSemiPrecious;
	
	public ArrayList<PreciousStone> listOfPreciousGems = new ArrayList<>();
	public ArrayList<SemiPreciousStone> listOfSemiPreciousGems = new ArrayList<>();
	
	private String[] jewelryVariety = {"Beads", "Pendants", "Earrings", "Diadems", "Neklaces"};
	protected String[] preciousStoneVariety = {"Diamond", "Corund", "Ruby", "Sapphire", "Beryl", "Aquamarine", "Alexandrite", "Pearl"};
	protected String[] semiPreciousStoneVariety = {"Apatite", "Turquoise", "Onychite", "Greenstone", "Jasper", "Malachite", "Amber"};
	
	Random random = new Random();
	
	public String[] getJewelryVariety() {
		return jewelryVariety;
	}
	
	public void setJewelryVariety(String[] jewelryVariety) {
		this.jewelryVariety = jewelryVariety;
	}
	
	/**
	 * Prints list of Precious gems
	 * @param list - full list of Precious stones in production
	 */
	public void showAllPreciousStone(ArrayList<PreciousStone> list) {
		
		for(PreciousStone element : list) {
			if(element != null) {	
				System.out.format("%-14s%-12d%-12d%-12d%-12d%-9d%n", element.getName(), element.getHardness(), element.getLength(), element.getWidth(), element.getHeight(), element.getTransparency());
			}
		}
		System.out.println();
	}
	
	/**
	 * Creates list with Semi-precious stones and prints it
	 * @param list - full list of Semi-precious stones in production
	 */
	public void showAllSemiPreciousStone(ArrayList<SemiPreciousStone> list) {
		
		for(SemiPreciousStone element : list) {
			if(element !=null) {
			System.out.format("%-14s%-12d%-12d%-12d%-12d%-9d%n", element.getName(), element.getHardness(), element.getLength(), element.getWidth(), element.getHeight(), element.getTransparency());
			}
		}
		System.out.println();
	}
	
	/**
	 * Prints header of informational table
	 */
	public void headerPrint(ResourceBundle bundle) {
		System.out.format("%-14s%-12s%-12s%-12s%-12s%-19s%n", bundle.getString("list"), bundle.getString("length"), bundle.getString("width"), bundle.getString("height"), bundle.getString("hardness"), bundle.getString("transparency"));
	}
	
	/**
	 * Creates 10 objects of Precious Gems for production. All params randomly generated.
	 */
	public void buildListOfPreciousGems() {
		for(int i = 0; i < 10; i++) {
			String n = preciousStoneVariety[random.nextInt(preciousStoneVariety.length)];
			int l = random.nextInt(22) + 3;
			int w = random.nextInt(22) + 3;
			int hi = random.nextInt(8) + 3;
			int ha = random.nextInt(22) + 3;
			int t = random.nextInt(24) + 1;
			listOfPreciousGems.add(new PreciousStone(n, l, w, hi, ha, t));
		}
	}
	
	/**
	 * Creates 10 objects of Semi-precious Gems for production. All params randomly generated.  
	 */
	public void buildListOfSemiPreciousGems() {
		for(int i = 0; i < 10; i++) {
			String n = semiPreciousStoneVariety[random.nextInt(semiPreciousStoneVariety.length)];
			int l = random.nextInt(12) + 3;
			int w = random.nextInt(12) + 3;
			int hi = random.nextInt(6) + 3;
			int ha = random.nextInt(22) + 3;
			int t = random.nextInt(24) + 1;
			listOfSemiPreciousGems.add(new SemiPreciousStone(n, l, w, hi, ha, t));
		}
	}
	
	
}
