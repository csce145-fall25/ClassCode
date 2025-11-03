package university;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1   = new Person("Bob");
		Student s1 = new Student("James",51423);
		Undergraduate ug = new Undergraduate("Ken",65433,2);
		Undergraduate ug2 = new Undergraduate("Lee",16523,3);
		
		Graduate      g   = new Graduate("Mike",53241,false);
		
		Graduate      g2   = new Graduate("Mike",43121,false);
		Graduate      g3   = new Graduate("Mike",43121,true);
		Graduate      g4   = new Graduate("Mike",53241,false);
		
		Person[] grads = {p1,s1,ug,ug2,g,g2,g3,g4};
		for(Person p: grads) {
			for(Person p2 : grads) {
				if (p==p2) continue;
				
				if(p.equals(p2)) {
					System.out.println("People equal()");
					p.writeOutput();
					p2.writeOutput();
					System.out.println("----------------------");
				}
			}
		}
		
		
//		Person[] people = {p1,s1,ug,ug2,g};
//		
//		for(Person p : people) {
//			p.writeOutput();
//		}
		
		

	}

}
