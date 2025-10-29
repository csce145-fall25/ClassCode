package university;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1   = new Person("Bob");
		Student s1 = new Student("James",51423);
		Undergraduate ug = new Undergraduate("Ken",65433,2);
		Undergraduate ug2 = new Undergraduate("Lee",16523,3);
//		Graduate      g   = new Graduate("Mike",53241,false);
		
		Person[] people = {p1,s1,ug,ug2};
		
		for(Person p : people) {
			p.writeOutput();
		}
		

	}

}
