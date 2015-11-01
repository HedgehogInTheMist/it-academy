package oop_2.hierarchy;

import java.io.Serializable;

import oop_2.interfaces.Dichromatism;

public class SemiPreciousStone extends NaturalStone implements Dichromatism, Serializable {

	public static final long serialVersionUID = 7L;
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
	public int getLength() {
		return super.getLength();
	}

	@Override
	public void setLength(int length) {
		super.setLength(length);
	}

	@Override
	public int getWidth() {
		return super.getWidth();
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
	}

	@Override
	public int getHeight() {
		return super.getHeight();
	}

	@Override
	public void setHeight(int height) {
		super.setHeight(height);
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

	public boolean isDichroism() {
		return dichroism;
	}

	public void setDichroism(boolean dichroism) {
		this.dichroism = dichroism;
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



