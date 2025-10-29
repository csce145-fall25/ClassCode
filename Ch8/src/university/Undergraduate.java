package university;

public class Undergraduate extends Student{
	private int level;

	public Undergraduate(String name, int studentNumber, int level) {
		super(name,studentNumber);
		setLevel(level);
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Level:"+getLevel());
	}
	
	public boolean equals(Undergraduate ug) {
		return super.equals(ug)&& ug.getLevel() == this.getLevel();
	}
	
	
	
	
}
