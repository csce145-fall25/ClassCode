package Ch6;

public class PetPair {
	private Pet pet1;
	private Pet pet2;
	
	public PetPair(Pet pet1,Pet pet2) {
		this.pet1 = pet1;
		this.pet2 = pet2;
	}
	
	public Pet[] getPets() {
		
		return new Pet[] {pet1,pet2};
	}
	
	public void printPets() {
		System.out.println("First pet in the pair:");
		pet1.writeOutput();
		System.out.println("Second pet in the pair:");
		pet2.writeOutput();
	}
	
	
}
