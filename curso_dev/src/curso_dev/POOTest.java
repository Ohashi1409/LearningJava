package curso_dev;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class POOTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		Rectangle rec = new Rectangle(width, height);
		
		System.out.printf("AREA: %.2f\n", rec.area());
		System.out.printf("PERIMETER: %.2f\n", rec.perimeter());
		System.out.printf("DIAGONAL: %.2f\n", rec.diagonal());
		
		sc.close();
	}

}
