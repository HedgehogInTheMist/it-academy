package oop_2;

public class SemiPreciousStone extends NaturalStone implements Dichromatism {

	private boolean dichroism = true; 
	private double length;
	private double width;
	private double height;
	private int transparency; //gradation from 1 up to 24 from transparent to opaque (nontransparent)
	
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getTransparency() {
		return transparency;
	}

	public void setTransparency(int transparency) {
		this.transparency = transparency;
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

	Jeweller jeweller;
	
	@Override
	void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("I print out from SemiPreciousStone");
	}

	@Override
	public boolean changeVisibleColor() {
		if(dichroism = true) {
			System.out.println("It's possible for this jewelry to change visible color");
			return true;
		} else {
			System.out.println("It's seems for this jewelry isn't possible to change visible color");
		}
		return false;
	}

	
}
