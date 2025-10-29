package ch7;

public class SalesAssociate {
	private double salary;
	private String name;
	private double sales;
	
	public SalesAssociate(String name, double salary, double sales) {
		this.setName(name);
		this.setSalary(salary);
		this.setSales(sales);
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	
	
}
