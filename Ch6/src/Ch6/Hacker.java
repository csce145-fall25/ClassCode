package Ch6;

public class Hacker {
	public static void runHackerSim(PetPair pp) {
		Pet replace = pp.getPets()[0];
		replace.setName("Dominion Spy");
		replace.setAge(1200);
		replace.setWeight(500);
	}
}
