package Ch6;

import java.util.Scanner;

enum Suit{CLUBS, DIAMONDS, HEARTS, SPADES};

public class Driver {

	public static void main(String[] args) {
		Pet p1 = new Pet();
		p1.setName("Fido");
		p1.writeOutput();
//		
//		Pet p2 = new Pet(4.5);
//		p2.writeOutput();
//		
//		Pet p3 = new Pet("Spot");
//		p3.writeOutput();
//		
//		Pet p4 = new Pet(5);
//		p4.writeOutput();
		
		Scanner sin = new Scanner(System.in);
		
//		
//		
//		double wt=0.0;
//		System.out.println("What is the weight");
//		boolean notDone = true;
//		do {
//			try {
//				wt = Double.parseDouble(sin.nextLine());
//				notDone = false;
//			}
//			catch(NumberFormatException e) {
//				System.out.println("Enter a number");
//			}
//		} while(notDone);
//		
//		p1.setWeight(wt);
//		
//		p1.writeOutput();
		
		
//		boolean moreDollars = true;
//		do {
//			try {
//				System.out.print("Enter a double:");
//				Dollar dollar = new Dollar(sin.nextDouble());
//				System.out.println(dollar);
//			} catch(Exception e) {
//				moreDollars = false;
//			}
//		} while (moreDollars);


		//Overload
		
//		double[] ds = {50.0,45.0,40};
//		
//		char[] cs = {'c','d','a'};
//		System.out.println( Overload.getAverage(ds));
//		System.out.println( Overload.getAverage(5));
//		System.out.println( Overload.getAverage(cs));
		
		//Hacker
//		Pet pet1 = new Pet("Faithful Guard Dog", 5 , 75.0);
//		Pet pet2 = new Pet("Loyal Companion",4,60.5);
//		PetPair pp = new PetPair(pet1,pet2);
//		pp.printPets();
//		Hacker.runHackerSim(pp);
//	    System.out.println("Our pair now:");
//	    pp.printPets();
				
		Suit club = Suit.CLUBS;
		Suit diamond = Suit.DIAMONDS;
		Suit heart = Suit.HEARTS;
		Suit spade = Suit.SPADES;
		
		Suit[] suits = { club,diamond,heart,spade};
		
		Suit club2 = Suit.CLUBS;
		Suit diamond2 = Suit.DIAMONDS;
		Suit heart2 = Suit.HEARTS;
		Suit spade2 = Suit.SPADES;
		
		Suit[] suits2 = { club2,diamond2,heart2,spade2};
		
		System.out.println(" ");
		for(Suit s:suits) {
			
			for(Suit s2:suits2) {
				printDashes(40);
				System.out.println("For "+ s.toString()+" and "+s2.toString()+":");
				System.out.println(s.toString()+"=="+s2.toString()+" == "+(s.toString()==s2.toString()));
				System.out.println(s.toString()+".equals("+s2.toString()+") == "+s.equals(s2));
				System.out.println(s.toString()+".compareTo("+s2.toString()+") == "+s.compareTo(s2));
				printDashes(40);
			}
			
		}
		
		System.out.println("\n\nordinal():");
		for(Suit s:suits) {
			printDashes(40);
			System.out.println(s.toString()+".ordinal() == "+s.ordinal());
			printDashes(40);
		}
		
		String[] suitStrings = { "clubs","diamonds","hearts","spades"};
		
		System.out.println("\n\nvalueOf():");
		for(String ss:suitStrings) {
			printDashes();
//			System.out.println("Suits.valueOf("+ss+") == "+Suit.valueOf(ss));
			System.out.println("Suits.valueOf("+ss+") == "+Suit.valueOf(ss.toUpperCase()));
			printDashes();
		}
		
		
		
	}
	
	private static void printDashes() {
		printDashes(40);
	}
	
	private static void printDashes(int n) {
		for(int i = 0; i<n; ++i)
			System.out.print("-");
		System.out.println();
	}

}
