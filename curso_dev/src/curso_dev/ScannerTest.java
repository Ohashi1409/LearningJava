package curso_dev;

import java.util.Locale;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem vindo a calculadora de tabuada");
		System.out.println("Digite um número e lhe mostraremos toda sua tabuada:");
		int x = sc.nextInt();
		
		System.out.printf("Aqui está a tabuada do %d\n", x);
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", x, i, x*i);
		}
		
		sc.close();
	}

}
