package oop_2.hierarchy;

import java.io.Serializable;

import oop_2.interfaces.Fluorescent;

public class PreciousStone extends NaturalStone implements Fluorescent, Serializable {

	private static final long serialVersionUID = -5869740807963795771L;
	
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
	public boolean glow() {
		if (luminescence) {
			System.out.println("I glow");
			return true;
		} else {
			System.out.println("I never glow from PreciousStone class");
			return false;
		}
	}
}
