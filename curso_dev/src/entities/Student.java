package entities;

public class Student {

	private double n1, n2, n3;
	
	public Student(double n1, double n2, double n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public double finalGrade() {
		return n1+n2+n3;
	}
	
	public String approved() {
		if (this.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60-this.finalGrade());
			return "";
		}
		else { return "PASS"; }
	}
}
