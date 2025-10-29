package university;

public class Employee extends Person {
	private int hireYear;
	private int employeeNumber;
	private Department department;
	private Employee supervisor;
	
	public Employee(String name, int hireYear,int employeeNum, Department dept) {
		super(name);
	}

	public int getHireYear() {
		return hireYear;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}


}
