package Species;

import java.util.Scanner;

public class Species {
	private String name;
	private int population;
	private double growthRate;
	
	public static void main(String[] args) {
//		Species cat = new Species();
//		cat.setName("Cat");
//		cat.setPopulation(50);
//		cat.setGrowthRate(4.0);
//		
//		Species dog = new Species();
//		dog.setName("Dog");
//		dog.setPopulation(30);
//		dog.setGrowthRate(2.5);
//		
//		Species cat2 = new Species();
//		cat2.setName("Cat");
//		cat2.setPopulation(500);
//		cat2.setGrowthRate(1.5);
//		
//		System.out.println("== stuff");
//		System.out.println(cat==dog);
//		System.out.println(cat==cat2);
//		System.out.println(cat2==dog);
//		
//		System.out.println(".equals()");
//		System.out.println(cat.equals(dog));
//		System.out.println(cat.equals(cat2));
//		System.out.println(cat2.equals(dog));
		
		Species cat = new Species();
		Species dog = new Species();
		
		cat.readInput();
		dog.readInput();
		
		cat.writeOutput();
		dog.writeOutput();
		
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getGrowthRate() {
		return growthRate;
	}

	public void setGrowthRate(double growthRate) {
		this.growthRate = growthRate;
	}
	
	public boolean equals(Species s2) {
		return this.name.equals(s2.name);
	}
	
	public void readInput() {
		Scanner sin = new Scanner(System.in);
		System.out.print("Enter name:");
		this.name = sin.nextLine();
		System.out.print("Enter population:");
		this.population = sin.nextInt();
		sin.nextLine();
		System.out.print("Enter growth rate:");
		this.growthRate = sin.nextDouble();
		sin.nextLine();
		sin.close();
	}
	
	public void writeOutput() {
		System.out.println("Name= "+name);
		System.out.println("Population= "+this.population);
		System.out.println("Growth Rate = "+this.growthRate);
	}
	
}
