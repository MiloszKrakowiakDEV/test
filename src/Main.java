import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(12);
        int a = 12;
        int b = 235;
        System.out.println("To jest fajny wynik czyli " + a + b);
        System.out.println(a + b + " jest to.");
        System.out.println( (double) b/ a);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę \n");
        double number1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę \n");
        double number2 = scanner.nextDouble();
        System.out.println(number1 + number2);
        double result = number1 * number2;
        System.out.println("Wynik mnożenia to: " + result);
        System.out.printf("Wynik mnożenia to: %.2f", result);
    }
}