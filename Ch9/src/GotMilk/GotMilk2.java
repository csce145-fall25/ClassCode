package GotMilk;

import java.util.Scanner;

public class GotMilk2 {
	
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		try {
			System.out.println("Enter a number of donuts");
			int n_donuts = Integer.parseInt(sin.nextLine());
			System.out.println("Enter number of ");
			int n_glasses = Integer.parseInt(sin.nextLine());
			
			System.out.println("You have "
					+((double)n_donuts/n_glasses)
					+" of donuts per glass of milk.");
		} catch(Exception e) {
			System.out.println(e.getClass()+e.getMessage());
			
			System.out.println("Maybe (?) No milk!");
		}


		
		System.out.println("End of program.");
		
	}
}
