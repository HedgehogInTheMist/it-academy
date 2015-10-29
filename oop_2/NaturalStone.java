package oop_2;

public abstract class NaturalStone extends Fossil {
	
	private int length;
	private int width;
	private int height;
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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

	public NaturalStone() {
	}
	
	public NaturalStone(String name) {
		
	}

	public int getTransparency() {
		return (Integer) null;
	}
}
