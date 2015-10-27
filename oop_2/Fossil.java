package oop_2;

abstract public class Fossil {
	
	private String name;
	private int hardness; 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHardness() {
		return hardness;
	}

	public void setHardness(int hardness) {
		this.hardness = hardness;
	}

	public Fossil() {
		
	}
	public Fossil(String name, int hardness) {
		this.name = name;
		this.hardness = hardness;
	}
	void print() {
		System.out.println("I print from Fossil");
	}
}
