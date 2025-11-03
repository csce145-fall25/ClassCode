package university;

public class Staff extends Employee {
	private boolean isFullTime;
	private String title;
	
	public Staff(String name, int hireYear,int employeeNum, Department dept, 
			boolean isFullTime, String title) {
		super(name,hireYear,employeeNum,dept);
		setFullTime(isFullTime);
		setTitle(title);
	}
	
	public boolean getFullTime() {
		return isFullTime;
	}
	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
