package GotMilk;

import java.util.Scanner;

public class GotMilk3 {
	
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		try {
			System.out.println("Enter a number of donuts");
			int n_donuts = Integer.parseInt(sin.nextLine());
			System.out.println("Enter number of ");
			int n_glasses = Integer.parseInt(sin.nextLine());
			if(n_glasses <=0) throw new IllegalArgumentException("No milk!");
			System.out.println("You have "
					+((double)n_donuts/n_glasses)
					+" of donuts per glass of milk.");
		} catch(NumberFormatException e) {
			System.out.println(e.getClass()+" "+e.getMessage());
		} catch(IllegalArgumentException e) {
			System.out.println("No milk!"+"\nGo get some milk");
		}


		
		System.out.println("End of program.");
		
	}
}
