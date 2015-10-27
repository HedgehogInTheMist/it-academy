package oop_2;

public class PreciousStone extends NaturalStone implements Fluorescent {

	private boolean luminescence = true; 
	private int transparency; // gradation from 1 up to 24 from transparent to
								// opaque (nontransparent)

	public PreciousStone() {
	}

	public PreciousStone(String name, double length, double width, double height, int hardness, int transparency) {
		super.setName(name);
		super.setLength(length);
		super.setWidth(width);
		super.setHeight(height);
		super.setHardness(hardness);
		this.transparency = transparency;
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

	public boolean isLuminescence() {
		return luminescence;
	}

	public boolean setLuminescence(boolean luminescence) {
		this.luminescence = luminescence;
		return luminescence;
	}

	//
	Jeweller jeweller;

	// What is jeweller on the work shift
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
