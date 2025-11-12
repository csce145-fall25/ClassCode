package divByZero;

import java.util.Scanner;

public class divByZeroDemo {
	
	private static int readInt(Scanner sin, String msg) 
	{
		for(;;) {
			System.out.println(msg);
			try {
				return Integer.parseInt(sin.nextLine());
			} catch(Exception e) 
			{
				System.out.println("Please enter an int");
			}
		}
	}
	
	private static int readInt(Scanner sin, String msg, int max_attempts, int min) 
		throws TriesExhaustedException
	{
		for(int i = 0; i<max_attempts; ++i) {
			System.out.println(msg);
			try {
				int input = Integer.parseInt(sin.nextLine());
				if(input < min) throw new IllegalArgumentException();
				return input;
			} catch(IllegalArgumentException e) 
			{
				System.out.println("Please enter an int >= "+min);
			} 
			catch(Exception e) 
			{
				System.out.println("Please enter an int");
			}
		}
		throw new TriesExhaustedException("You used all " + max_attempts+" tries");
	}
	
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		try {
//			int numerator = readInt(sin,"Please enter numerator:");
//			int denominator = readInt(sin,"Please enter denominator (non-zero):");
			
			int numerator = readInt(sin,"Please enter numerator:",3,0);
			int denominator = readInt(sin,"Please enter denominator (non-zero):",
				3,0);
			
			if(denominator == 0) throw new DivideByZeroException();
			
			System.out.println(numerator+"/"+denominator+"="+numerator/denominator);
		} catch(TriesExhaustedException e) {
			System.out.println(e.getMessage());
		} catch(DivideByZeroException e) {
			System.out.println("I cannot do division by zero.\n"
					+"Since I cannot do what you want\n"
					+"the program will end.");
		} catch(ArithmeticException e) {
			System.out.println("Exception: "+e.getMessage());
		}
		
	}
}
