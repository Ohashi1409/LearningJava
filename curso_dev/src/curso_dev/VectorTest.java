package curso_dev;

import java.util.Locale;
import java.util.Scanner;

public class VectorTest {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        double[] vector = new double[len];

        for (int i = 0; i < len; i++) {
            vector[i] = sc.nextDouble();
        }

        double result = 0;
        for (int i = 0; i < len; i++) {
            result+=vector[i];
        }
        System.out.printf("Average height: %.2f", result/len);

        sc.close();
    }
}
