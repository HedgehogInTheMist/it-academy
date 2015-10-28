package oop_2;

public class SemiPreciousStone extends NaturalStone implements Dichromatism {

	private boolean dichroism = true;
	private int transparency; // gradation from 1 up to 24 from transparent to
								// opaque (nontransparent)
	
	public SemiPreciousStone() {
	}
	
	public SemiPreciousStone(String name, int length, int width, int height, int hardness, int transparency) {
		super.setName(name);
		super.setLength(length);
		super.setWidth(width);
		super.setHeight(height);
		super.setHardness(hardness);
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return super.getLength();
	}

	@Override
	public void setLength(int length) {
		// TODO Auto-generated method stub
		super.setLength(length);
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return super.getWidth();
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		super.setWidth(width);
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return super.getHeight();
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		super.setHeight(height);
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
