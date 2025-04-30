package curso_dev;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class POOTest3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		Student std = new Student(nota1, nota2, nota3);
		
		System.out.printf("Olá %s, aqui está seu resultado final:\n", name);
		System.out.printf("FINAL GRADE = %.2f\n", std.finalGrade());
		System.out.println(std.approved());
		
		sc.close();
	}

}