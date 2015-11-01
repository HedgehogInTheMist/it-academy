package oop_2.hierarchy;

import java.io.Serializable;

import oop_2.gemsProduction.Jeweller;
import oop_2.interfaces.Fluorescent;

public class PreciousStone extends NaturalStone implements Fluorescent, Serializable {

	public static final long serialVersionUID = 7L; 
	
	private boolean luminescence = true; 

	public PreciousStone() {
	}

	public PreciousStone(String name, int length, int width, int height, int hardness, int transparency) {
		super.setName(name);
		super.setLength(length);
		super.setWidth(width);
		super.setHeight(height);
		super.setHardness(hardness);
		super.setTransparency(transparency); // gradation from 1 up to 24 from transparent to opaque (nontransparent)
	}

	@Override
	public int getTransparency() {
		return super.getTransparency();
	}

	@Override
	public void setTransparency(int transparency) {
		super.setTransparency(transparency);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public int getHardness() {
		return super.getHardness();
	}

	@Override
	public void setHardness(int hardness) {
		super.setHardness(hardness);
	}

	public boolean isLuminescence() {
		return luminescence;
	}

	public boolean setLuminescence(boolean luminescence) {
		this.luminescence = luminescence;
		return luminescence;
	}

	Jeweller jeweller;

	// Which jeweller is on the work shift
	public Jeweller getJeweller() {
		return jeweller;
	}

	@Override
	public boolean glow() {
		if (setLuminescence(true)) {
			System.out.println("I glow");
			return true;
		} else {
			System.out.println("I never glow from PreciousStone class");
			return false;
		}
	}
}
