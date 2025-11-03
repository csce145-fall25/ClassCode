package university;

public class Graduate extends Student {
	private boolean isCandidate;
	
	public Graduate(String name,int studNumber,boolean isCandidate) {
		super(name,studNumber);
		this.isCandidate=isCandidate;
	}

	public boolean isCandidate() {
		return isCandidate;
	}

	public void setCandidate(boolean isCandidate) {
		this.isCandidate = isCandidate;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Is candidate: "+isCandidate);
	}
	
	@Override
	public boolean equals(Object o) {
		return this.getClass()==o.getClass() 
				&& super.equals((Student)o) 
				&& ((Graduate) o).isCandidate() == this.isCandidate();  
	}
	
}
