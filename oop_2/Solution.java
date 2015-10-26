package oop_2;

public class Solution {
	public static void main(String[] args) {
		Fossil stone;
		PreciousStone preciousStone = new PreciousStone();
		stone = (NaturalStone) preciousStone;
		stone.print();
		preciousStone.print();
		SemiPreciousStone semiPreciousStone = new SemiPreciousStone();
		semiPreciousStone.Phosphoresce();
		Jeweller j = new Jeweller("Mark");
		System.out.println(j.getRandWorkOption());
	}
}
