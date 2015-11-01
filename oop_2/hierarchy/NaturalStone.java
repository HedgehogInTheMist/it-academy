package oop_2.hierarchy;

import java.io.Serializable;

/**
 * Second branch in hierarchy, extends from class Fossil
 * @author Hedgehog
 *
 */
public abstract class NaturalStone extends Fossil implements Comparable<NaturalStone>, Serializable {
	
	public static final long serialVersionUID = 7L;
	
	private int length;
	private int width;
	private int height;
	private String color;
	private int transparency;
	
	
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




	

	

		
}
