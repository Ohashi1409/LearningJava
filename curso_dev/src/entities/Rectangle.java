package entities;

public class Rectangle {

	private double width, height;
	
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}	
	
	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return 2*width + 2*height;
	}
	
	public double diagonal() {
		double diagonalpow2 = Math.pow(width, 2) + Math.pow(height, 2);
		return Math.sqrt(diagonalpow2);
	}
}
