package curso_dev;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class POOTest4 {
    public static void main(String[] args) {
     
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount ba;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n) ? ");
        char ch = sc.next().charAt(0);

        if (ch == 'y') {
            System.out.print("Enter initial deposit value : ");
            double initial_dep = sc.nextDouble();
            ba = new BankAccount(number, holder, initial_dep);
        }
        else {
            ba = new BankAccount(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n\n", ba.getNumber(), ba.getHolder(), ba.getBalance());

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        ba.deposit(deposit);
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n\n", ba.getNumber(), ba.getHolder(), ba.getBalance());
        
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        ba.withdraw(withdraw);
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n\n", ba.getNumber(), ba.getHolder(), ba.getBalance());

        sc.close();
    }
}
