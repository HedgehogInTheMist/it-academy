package oop_2.hierarchy;

import java.io.Serializable;
/**
 * The highest forefathers in hierarchy
 * @author Hedgehog
 *
 */
abstract public class Fossil implements Serializable{
	
	private static final long serialVersionUID = -4630494807731230796L;
	
	private String name;
	private int hardness; 

	public Fossil() {
	}
	
	public Fossil(String name, int hardness) {
		this.name = name;
		this.hardness = hardness;
	}
	
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
}
