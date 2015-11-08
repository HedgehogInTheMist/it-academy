package oop_2.hierarchy;

import java.io.Serializable;

/**
 * Second branch in hierarchy, extends from class Fossil
 * @author Hedgehog
 *
 */
public abstract class NaturalStone extends Fossil implements Comparable<NaturalStone>, Serializable {
	
	private static final long serialVersionUID = -8374632974608181763L;
	
	private int length;
	private int width;
	private int height;
	private int transparency; // gradation from 1 up to 24 from transparent to opaque (nontransparent)
	private String color;
	
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

	public int getTransparency() {
		return transparency;
	}

	public void setTransparency(int transparency) {
		this.transparency = transparency;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int compareTo(NaturalStone obj) {
		NaturalStone tmpCompare = obj;
		if(this.transparency < tmpCompare.transparency) {
			return -1;
		} else if(this.transparency > tmpCompare.transparency) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "NaturalStone [length=" + length + ", width=" + width + ", height=" + height + ", transparency="
				+ transparency + ", color=" + color + ", getLength()=" + getLength() + ", getWidth()=" + getWidth()
				+ ", getHeight()=" + getHeight() + ", getTransparency()=" + getTransparency() + ", getName()="
				+ getName() + ", getHardness()=" + getHardness() + "]";
	}
	
	
	
}
