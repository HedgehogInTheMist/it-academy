package oop_2;

public class SemiPreciousStone extends NaturalStone implements Fluorescent, Dichroism {

	private boolean luminescence = false;
	
	@Override
	public void Phosphoresce() {
		if(luminescence = true) {
			System.out.println("I glow");
		} else {
			System.out.println("I never glow from SemiPreciousStone class");
		}
	}
}
