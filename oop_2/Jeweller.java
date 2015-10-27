package oop_2;

import java.util.Random;

public class Jeweller {
	
	private String surname = "";
	private String name = "";
	private String workOption = ""; //for choosing work shift - first or second 
	
	public String[] jewelryVariety = {"Beads", "Pendant", "Earring", "Diadem", "Neklace"};
	
	Jeweller () {
		
	}
	
	Jeweller(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String workOption() { 
		return workOption;
	}
	
	
	public String getWorkOption() {
		return workOption;
	}

	public void setWorkOption(String workOption) {
		this.workOption = workOption;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
