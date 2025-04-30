package entities;

public class Employee {

	private String name;
	private double grossSalary;
	private double tax;
	
	public Employee(String name, double grossSalary, double tax) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public String getName() { return this.name; }
			
	public double netSalary() { return this.grossSalary - this.tax; }
	
	public void increaseSalary(double percent) {
		this.grossSalary += this.grossSalary*percent/100;
	}
}
