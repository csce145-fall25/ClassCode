package university;

public class Faculty extends Employee {
	private boolean hasTenure = false;
	
	public Faculty(String name, int hireYear,int employeeNum, Department dept, boolean hasTenure) {
		super(name,hireYear,employeeNum,dept);
		setHasTenure(hasTenure);
		
	}

	public boolean isHasTenure() {
		return hasTenure;
	}

	public void setHasTenure(boolean hasTenure) {
		this.hasTenure = hasTenure;
	}
}
