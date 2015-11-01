package oop_2.util;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import oop_2.hierarchy.NaturalStone;

public class UserInterfaceProcessing implements Serializable {

	public static final long serialVersionUID = 7L;
	
	//ProductionShift productionShift = new ProductionShift();
	Serializator serializator = new Serializator();
	
	/**
	 * Handling FIRST entry user-interface menu. Implements general evaluation gems in carat and their value. 
	 */
	public void gemsAssessment(TreeMap<Double, String> map)  {
		//buildMapOfGemsValue(list, map);
		for(Map.Entry<Double, String> entry : map.entrySet()) {
			System.out.format("%11s: %5.3f carat%n", entry.getValue(), entry.getKey());
		}
	}
	

	/**
	 * Handling SECOND entry user-interface menu. Implements all gems cost estimation. 
	 * @param mapCarat - containds gem's weight in carat as a key and its name as a value. 
	 */
	public void totalGemsValueEstimation(TreeMap<Double, String> map) {
		Double totalJewelryValue = 0.0;
		if(map.isEmpty()) {
			System.out.println("Total value gems in jewelry hasn't been estimated yet");
			System.out.println("Choose first entry in user-interface menu for general gems estimation");
		} else {
				for(Map.Entry<Double, String> entry : map.entrySet()) {
					totalJewelryValue += entry.getKey();
				}
				System.out.format("Total value gems in jewelry: %.3f carat%n", + totalJewelryValue);
				System.out.format("For instance with a current price 1200 US dollars per carat total price for jewelry will be: %.1f US dollars%n", + totalJewelryValue * 1200);
				}
	}

	/**
	 * Handling THIRD entry user-interface menu. Implements extraction from full list of stones, gems which have higher transparency characteristic.
	 * @param map
	 */
	public ArrayList<NaturalStone> transparencyEstimation(ArrayList<NaturalStone> list, int v) {
		ArrayList<NaturalStone> localListForRange = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			if(v < list.get(i).getTransparency()) {
				localListForRange.add(list.get(i));
			}
		}
		for(NaturalStone element : localListForRange) {
			System.out.format("%-14s%-12d%-12d%-12d%-12d%-9d%n", element.getName(), element.getHardness(), element.getLength(), element.getWidth(), element.getHeight(), element.getTransparency());
		}
		return localListForRange;
	}
	
	/**
	 * Handling FOURTH entry user-interface menu. Having applied serialization coping ArrayList into the file-stream. 
	 */
	public void transferToFile(ArrayList<NaturalStone> list) {
		ArrayList<NaturalStone> listToFile = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			if(10 > list.get(i).getTransparency()) {
				listToFile.add(list.get(i));
			}
		}
			serializator.serialization(listToFile);
	}

	/**
	 * Handling FIFTH entry user-interface menu. Having applied deserialization coping and printing ArrayList from the file-stream. 
	 */
	public void transferFromFile() {
		ArrayList<NaturalStone> checkList = new ArrayList<>();
			try {
				checkList = (ArrayList<NaturalStone>)serializator.deserialization();
				} catch (InvalidObjectException e) {
					System.err.println("Error. Futile attempt to fetch object from file.");
					e.printStackTrace();
				  }
		for(NaturalStone element : checkList) {
			System.out.format("%-14s%-12d%-12d%-12d%-12d%-9d%n", element.getName(), element.getHardness(), element.getLength(), element.getWidth(), element.getHeight(), element.getTransparency());
		}
	}

	
}
