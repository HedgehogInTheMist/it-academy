package oop_2;

public class PreciousStone extends NaturalStone implements Fluorescent, Dichroism {
	
	private boolean luminescence = true; //
	
	public boolean isLuminescence() {
		return luminescence;
	}

	public boolean setLuminescence(boolean luminescence) {
		this.luminescence = luminescence;
		return luminescence;
	}
	
	@Override
	public void Phosphoresce() {
		if(setLuminescence(true)) {
			System.out.println("I glow");
		} else {
			System.out.println("I never glow from PreciousStone class");
		}
		
	}

	

	

}
