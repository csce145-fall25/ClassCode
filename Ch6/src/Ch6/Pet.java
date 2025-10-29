package Ch6;

public class Pet {
	private String name;
	private int age;
	private double weight;
	
	public Pet(String name,int age,double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public Pet() {
		this("Unknown",0,0.0); //can/should use constructor
	}
	
	public Pet(double weight) {
		this();
		this.setWeight(weight);
	}
	
	public Pet(int age) {
		this("PetWAge",age,0.0);
	}
	
	public Pet(String name) {
		this(name,0,0.0);//wrong
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	void setPet(String newName, int newAge, double newWeight) {
		setName(newName);
		setAge(newAge);
		setWeight(newWeight);
	}
	void writeOutput() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+this.age);
		System.out.println("weight: "+this.weight);
	}
}
