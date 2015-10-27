package oop_2;

public abstract class NaturalStone extends Fossil {
	
	private double length;
	private double width;
	private double height;
	
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

	//public NaturalStone(String name,)
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getHardness() {
		// TODO Auto-generated method stub
		return super.getHardness();
	}

	@Override
	public void setHardness(int hardness) {
		// TODO Auto-generated method stub
		super.setHardness(hardness);
	}

	public NaturalStone() {
	}
	
	public NaturalStone(String name) {
		
	}
	
}
