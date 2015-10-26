package oop_2;

import java.util.Random;

public class Jeweller {
	
	private String name = "";
	private String workOption = ""; //for choosing work shift - first or second 
	
	public String[] jewelryVariety = {"Beads", "Pendant", "Earring", "Diadem", "Neklace"};
	
	Jeweller(String name) {
		this.name = name;
	}
	
	public String workOption() { 
		return workOption;
	}
	
	//Rendering a decision about, what kind of jewelry to produce
	public String getRandWorkOption() {
		//int randNumber = (int) Math.random() * 1;
		Random random = new Random();
		int randNumber = random.nextInt(4); 
		workOption = jewelryVariety[randNumber];
		return jewelryVariety[randNumber];
	}
	
}
