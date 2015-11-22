package oop_2.util;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;

import oop_2.gemsProduction.GemSorting;
import oop_2.hierarchy.NaturalStone;

public class UserInterfaceProcessing implements Serializable {

	private static final long serialVersionUID = -3593317735343496996L;
	
	GemSorting gemSorting = new GemSorting();
	
	Serializator serializator = new Serializator();
	
	/**
	 * Handling FIRST entry user-interface menu. Implements general evaluation gems in carat and their value. 
	 */
	public void gemsAssessment(TreeMap<Double, String> map, ResourceBundle bundle) {
		for(Map.Entry<Double, String> entry : map.entrySet()) {
			System.out.format("%11s: %5.3f ", entry.getValue(), entry.getKey());
			System.out.println(bundle.getString("carat"));
		}
	}

	/**
	 * Handling SECOND entry user-interface menu. Implements all gems cost estimation. 
	 * @param mapCarat - containds gem's weight in carat as a key and its name as a value. 
	 */
	public void totalGemsValueEstimation(TreeMap<Double, String> map, ResourceBundle bundle) {
		Double totalJewelryValue = 0.0;
		if(map.isEmpty()) {
			System.out.println(bundle.getString("gemEstimation1"));
			System.out.println(bundle.getString("gemEstimation2"));
		} else {
				for(Map.Entry<Double, String> entry : map.entrySet()) {
					totalJewelryValue += entry.getKey();
				}
				System.out.print(bundle.getString("gemEstimation3"));
				System.out.format(" %.3f ", + totalJewelryValue);
				System.out.println(bundle.getString("carat"));
				System.out.print(bundle.getString("gemEstimation4"));
				System.out.format(" %.1f ", + totalJewelryValue * 1200);
				System.out.println(bundle.getString("USD"));
				System.out.println();
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
//		gemSorting.headerPrint(bundle);
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
