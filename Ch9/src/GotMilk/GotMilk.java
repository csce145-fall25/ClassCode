package GotMilk;

import java.util.Scanner;

public class GotMilk {
	
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter a number of donuts");
		int n_donuts = Integer.parseInt(sin.nextLine());
		System.out.println("Enter number of ");
		int n_glasses = Integer.parseInt(sin.nextLine());
		if(n_glasses ==0) {
			System.out.println("No milk!\n"
					+ "Go buy some milk.");
		} else {
			System.out.println("You have "
					+((double)n_donuts/n_glasses)
					+" of donuts per glass of milk.");
		}
		
		System.out.println("End of program.");
		
	}
}
