package curso_dev;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class VectorTest2 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd_items = sc.nextInt();
        Product[] products = new Product[qtd_items];

        for (int i = 0; i < qtd_items; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double averace_price = 0;
        for (int i = 0; i < qtd_items; i++) {
            averace_price+=products[i].getPrice();
        }

        System.out.printf("AVERAGE PRICE: $ %.2f", averace_price/qtd_items);

        sc.close();
    }
}
