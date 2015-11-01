package oop_2.hierarchy;
/**
 * Second branch in hierarchy, extends from class Fossil
 * @author Hedgehog
 *
 */
public abstract class SyntheticStone extends Fossil {
	
	public static final long serialVersionUID = 7L;
	
	private int length;
	private int width;
	private int height;
	private String color;
	private int transparency; // gradation from 1 up to 24 from transparent to opaque (nontransparent)
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public SyntheticStone() {
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

	public SyntheticStone(String name, int hardness) {
		setName(name);
		setHardness(hardness);
	}

	public int getTransparency() {
		return transparency;
	}

	public void setTransparency(int transparency) {
		this.transparency = transparency;
	}
}
