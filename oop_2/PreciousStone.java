package oop_2;

public class PreciousStone extends Stone implements Naturalness{

	@Override
	public String isNatural() {
		String isNatural = "Stone is natural by default";
		return isNatural;
	}

}
