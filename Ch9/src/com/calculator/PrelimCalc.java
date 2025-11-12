package com.calculator;

import java.util.Scanner;

public class PrelimCalc {

	public static void main(String[] args) {
		System.out.println("Calculator is on."
				+"\nFormat of each line is operator<space>number"
				+"\nFor example \"+ 3\""
				+"\nTo end, enter the letter 'e'");
		Scanner sin = new Scanner(System.in);
		double result = 0.0;
		boolean done = false;
		do {
			System.out.println("result = "+result);
			char operator = sin.next().trim().charAt(0);
			if(operator == 'e') {
				done = true;
				continue;
			} 
			double operand = Double.parseDouble(sin.nextLine());
			
			switch(operator) {
				case '+':
					result+=operand;
					break;
				case '-':
					result-=operand;
					break;
				case '*':
					result*=operand;
					break;
				case '/':
					result/=operand;
					break;
				case '%':
					result%=operand;
					break;
				case '^':
					result= Math.pow(result, operand);
					break;
				default:
					System.out.println("No such operator! closing");
					done=true;
			}
		} while( !done);
		System.out.println("The final result is "+result );
		System.out.println("Calculator program is ending.");
	}

}
