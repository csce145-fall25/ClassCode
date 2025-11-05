package divByZero;

public class DivideByZeroException extends Exception {
	public DivideByZeroException() {
		super("You attempted to divide by 0 on an integral type");
	}
}
