package Ch6;

public class Dollar {
	private double amount;
	
	public Dollar(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		boolean negative = amount < 0.0;
		double val = amount;
		if (negative) {
			val*= -1;
		}
		long dollars = (long) val;
		double cval = val - dollars;
		cval = Math.round(cval*100);
		long cents = (long) cval;
		return (negative?"-$":"$")+dollars+"."+(cents<10?"0"+cents:""+cents);
	}
}
