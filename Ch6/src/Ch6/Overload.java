package Ch6;

import java.util.Scanner;

public class Overload {
	public static double getAverage(double[] ns) {
		double sum = 0.0;
		for(int i = 0; i< ns.length;++i) {
			sum+=ns[i];
		}
		return sum/ns.length;
	}
	
	public static double getAverage(int n) {
		System.out.println("Enter "+n+" numbers.");
		Scanner sin = new Scanner(System.in);
		double sum = 0.0;
		for(int i = 0; i< n;++i) {
			sum+=sin.nextDouble();
			sin.nextLine();
		}
		return sum/n;
	}
	
	public static char getAverage(char[] cs) {
		int sum = 0;
		for(int i = 0; i< cs.length;++i) {
			sum+=(int)cs[i];
		}
		return (char)(sum/cs.length);
	}
}
