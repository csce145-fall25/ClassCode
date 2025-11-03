package university;

public class Person {
	private String name;
	
	public Person() {
		this("No Name");
	}
	
	public Person(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void writeOutput() {
		System.out.println("Name: "+getName());
	}
	
	public boolean hasSameName(Person p) {
		return getName() == p.getName();
	}
}
