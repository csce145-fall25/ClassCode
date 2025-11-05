package divByZero;

public class TriesExhaustedException extends Exception {

	public TriesExhaustedException(String message) {
		super(message);
	}
	
	public TriesExhaustedException() {
		this("Ran out of tries");
	}
	
}
