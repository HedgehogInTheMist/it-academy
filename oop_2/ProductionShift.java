package oop_2;

public class ProductionShift {

	Jeweller[] jewellers = new Jeweller[2];
	
	PreciousStone preciousStone = new PreciousStone();
	SemiPreciousStone semiPreciousStone = new SemiPreciousStone();
	
	Jeweller jeweller = new Jeweller();
	ProductionShift(String firstName, String firstSurname, String secondName, String secondSurname) {
		jewellers[0] = new Jeweller(jeweller.getName(), jeweller.getSurname());
		jewellers[1] = new Jeweller(jeweller.getName(), jeweller.getSurname());
	}
	
	public void startProductionShift() {
		int randIndex = (Math.random() < 0.5) ? 0 : 1;
		String jewellerOnSchedule = jewellers[randIndex].getRandWorkOption();
		int opponentsIndex = (randIndex == 0) ? 1 : 0;
		
		jewellers[opponentsIndex].setWorkOption(jewellerOnSchedule);
	}
	
	
}

/*	static ArrayList<Fossil> fossil = new ArrayList<Fossil>();
	static ArrayList<PreciousStone> precious_stones  = new ArrayList<PreciousStone>();
*/	
//	public static void main(String[] args) {
		//Fossil stone;
		//PreciousStone preciousStone = new PreciousStone();
		
/*		stone = (NaturalStone) preciousStone;
		stone.print();
		
		System.out.println();
		
		PreciousStone exampleFull = new PreciousStone("Алмазная руда", 8, 6, 3.9, 4);
		System.out.println(exampleFull.getName());
		
		
		Jeweller j = new Jeweller("Mark", "Rosovsky");
		String pieceOfJewelry = j.getRandWorkOption();
		System.out.println("I'm " + j.getName() + " " + j.getSurname() + " going to produce " + pieceOfJewelry);
		System.out.println(pieceOfJewelry + " will be made out of ");
*/		
	
//	}

