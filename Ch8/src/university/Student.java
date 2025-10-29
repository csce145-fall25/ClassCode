package university;

public class Student extends Person {
	private int studentNumber;

	public Student(String name,int studentNumber) {
		super(name);
		setStudentNumber(studentNumber);
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void reset(String newName, int newStudentNumber) {
		super.setName(newName);
		this.setStudentNumber(newStudentNumber);
	}
	
	@Override
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Student Number:"+getStudentNumber());
	}
	
	public boolean equals(Student otherStudent) {
		return super.hasSameName(otherStudent)
				&&this.getStudentNumber()==otherStudent.getStudentNumber();
	}
}
