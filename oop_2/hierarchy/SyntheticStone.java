package oop_2.hierarchy;
/**
 * Second branch in hierarchy, extends from class Fossil
 * @author Hedgehog
 *
 */
public abstract class SyntheticStone extends Fossil {
	
	private static final long serialVersionUID = 529378475236628538L;
	
	private int length;
	private int width;
	private int height;
	private String color;
	private int transparency; // gradation from 1 up to 24 from transparent to opaque (nontransparent)

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTransparency() {
		return transparency;
	}

	public void setTransparency(int transparency) {
		this.transparency = transparency;
	}
}
