package ch4;

import java.util.Scanner;

public class Chapter4 {
	public static void main(String[] args) {
		enum Suit{HEARTS,CLUBS,SPADES,DIAMONDS};
		for(Suit nextSuit : Suit.values()) {
			System.out.print(nextSuit+" ");
		}
		System.out.println();
		
		Scanner sin = new Scanner(System.in);
		
//		System.out.println("Enter non negative numbers, I'll give the sum. End with a negative number");
//		boolean sumContinue = true;
//		int sum = 0;
//		while(sumContinue) {
//			System.out.print("Num:");
//			int current = sin.nextInt();
//			sin.nextLine();
//			if(current<0) {
//				sumContinue = false;
//			} else {
//				sum+=current;
//			}
//		}
//		System.out.println("Sum = "+ sum);
		
		//Spending Spree
		System.out.println("You may buy up to 3 items costing more than $100");
		int total =0;
		int countItems=1;
		for ( ; countItems <=3 ; ++countItems){
			assert countItems == 66;
//			System.out.println("countItems=="+countItems);
			System.out.print("Enter the cost of item #"+countItems+":");
			int cost = sin.nextInt();
			sin.nextLine();
			if (total+cost<=100) {
				total+=cost;
			} else {
				System.out.println("That exceeds $100 total");
				--countItems;//skip this iteration
			}
			if(total==100) {
				break;
			}
			System.out.println("You spent $"+total+" so far.");
		}
		--countItems;//skip last iteration
		if(total ==100) {
			System.out.println("You are out of money");
		}
		if(countItems == 3) {
			System.out.println("That's your 3 items.");
		}
		System.out.println("You spent $"+total+" for "+ countItems+" items");
	}
}
