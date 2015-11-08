package oop_2.hierarchy;

import java.io.Serializable;

import oop_2.interfaces.Dichromatism;

public class SemiPreciousStone extends NaturalStone implements Dichromatism, Serializable {

	private static final long serialVersionUID = -6555535887704902355L;

	protected boolean dichroism = true;

	public SemiPreciousStone() {
	}
	
	public SemiPreciousStone(String name, int length, int width, int height, int hardness, int transparency) {
		super.setName(name);
		super.setLength(length);
		super.setWidth(width);
		super.setHeight(height);
		super.setHardness(hardness);
		super.setTransparency(transparency); // gradation from 1 up to 24 from transparent to opaque (nontransparent)
	}
	
	@Override
	public boolean changeVisibleColor() {
		if (dichroism = true) {
			System.out.println("It's possible for this jewelry to change visible color");
			return true;
		} else {
			System.out.println("It's seems for this jewelry isn't possible to change visible color");
		}
		return false;
	}
}



