package curso_dev;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class POOTest2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Employee emp = new Employee(name, grossSalary, tax);
		
		System.out.println();
		System.out.printf("Employee : %s, $ %.2f\n\n", emp.getName(), emp.netSalary());
		
		System.out.print("Which percentage to increase salary ? ");
		double increase  = sc.nextDouble();
		emp.increaseSalary(increase);
		
		System.out.println();
		System.out.printf("Updated data: %s, $ %.2f", emp.getName(), emp.netSalary());
		
		sc.close();
	}

}
