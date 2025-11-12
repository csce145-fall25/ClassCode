package com.calculator;

import java.util.Scanner;

public class Calculator {
	private double result;
	Scanner sin;
	
	public Calculator() {
		sin = new Scanner(System.in);
		setResult(0.0);
	}
	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public void doCalculation() throws TerminatingException, UnknownOpException {
		char operator = sin.next().trim().charAt(0);
		if(operator == 'e') {
			throw new TerminatingException("User terminating");
		} 
		
		double operand = Double.parseDouble(sin.nextLine());
		
		this.setResult(this.evaluate(operator, operand));
	}

	private double evaluate(char operator, double operand) throws UnknownOpException {
		double res = this.getResult();
		switch(operator) {
		case '+':
			res+=operand;
			break;
		case '-':
			res-=operand;
			break;
		case '*':
			res*=operand;
			break;
		case '/':
			res/=operand;
			break;
		case '%':
			res%=operand;
			break;
		case '^':
			res= Math.pow(result, operand);
			break;
		default:
			throw new UnknownOpException("Unknown operator "+ operator);
		}
		return res;
	}

	private static void printInstructions() {
		System.out.println("Format of each line is operator<space>number"
				+"\nFor example \"+ 3\""
				+"\nTo end, enter the letter 'e'");
	}
	
	public static void main(String[] args) {
		System.out.println("Calculator is on.");
		printInstructions();
		Calculator c = new Calculator();

		try {
			while(true) {
				try {
					System.out.println("result = "+c.getResult());
					c.doCalculation();
				} catch(UnknownOpException e) {
					System.out.println(e.getMessage());
					printInstructions();
				} catch(NumberFormatException e) {
					printInstructions();
				}
			}
		} catch(TerminatingException e) {
			
		} finally {
			System.out.println("The final result is "+c.getResult() );
			System.out.println("Calculator program ending");
		}
		

	}



}
