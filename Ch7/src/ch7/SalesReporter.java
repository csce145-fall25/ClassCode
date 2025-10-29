package ch7;

import java.util.Scanner;

public class SalesReporter {
	private double highestSales;
	private double averageSales;
	private SalesAssociate[] team;
	private int numberOfAssociates;
	
	public void getData(Scanner sin) {
		System.out.print("Enter number of associates:");
		numberOfAssociates = sin.nextInt();
		sin.nextLine();
		team = new SalesAssociate[numberOfAssociates];
		for(int i = 0; i<numberOfAssociates;++i) {
			System.out.print("Associate Name:");
			String name = sin.nextLine();
			System.out.print("Associate Salary:");
			double salary = sin.nextDouble();
			sin.nextLine();
			System.out.print("Associate Sales:");
			double sales = sin.nextDouble();
			sin.nextLine();
			team[i] = new SalesAssociate(name,salary,sales);
		}
	}
	
	public void computeStats() {
		double sum = 0.0;
		highestSales = 0.0;
		for(int i = 0;i<numberOfAssociates;++i) {
			double sales = team[i].getSales(); 
			sum+=sales;
			if (sales>highestSales) {
				highestSales = sales;
			}
		}
		this.averageSales=sum/numberOfAssociates;
	}
	
	private void printNameSalesAndCompare(SalesAssociate sa) {
		System.out.println("Name: "+sa.getName());
		System.out.println("Sales: $"+sa.getSales());
		double diff = sa.getSales()-averageSales;
		if(diff>=0.0) {
			System.out.println("$"+diff+" above the average");
		} else {
			System.out.println("$"+(-1*diff)+" below the average.");
		}
		
	}
	
	public void displayResults() {
		System.out.println("Average sales per associate $"+this.averageSales);
		System.out.println("The highest sales figure is $"+this.highestSales);
		System.out.println("The following had the highest sales:");
		for(int i = 0; i<numberOfAssociates; ++i) {
			if(team[i].getSales()==highestSales) {
				this.printNameSalesAndCompare(team[i]);;
			}
		}
		System.out.println("The rest performed as follows:");
		for(int i = 0; i<numberOfAssociates; ++i) {
			if(team[i].getSales()<highestSales) {
				this.printNameSalesAndCompare(team[i]);;
			}
		}
	}
}
