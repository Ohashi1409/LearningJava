package curso_dev;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int gas = 0;
		int diesel = 0;
		
		int code = 0;
		while(code != 4) {
			code = sc.nextInt();
			if (code == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool: %d\n", alcool);
				System.out.printf("Gasolina: %d\n", gas);
				System.out.printf("Diesel: %d\n", diesel);
			}
			else if (code == 1) { alcool++; }
			else if (code == 2) { gas++; }
			else if (code == 3) { diesel++; }
		}
		
		sc.close();
	}

}
