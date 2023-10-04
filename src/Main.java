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
        System.out.printf("Wynik mnożenia liczby %.2f i liczby %.2f to: %.2f \n", number1, number2, result);
        String tekst = "kociak";
        System.out.println("Wynik mnożenia liczby " + number1 + " oraz liczby " + number2 + " to " + result);
        System.out.println("Czy numer pierwszy jest większy od 0? " + (number1 > 0) + "!");
        boolean warunek = number1 == number2;
        System.out.printf("Czy numer pierwszy jest równy numerowi drugiemu? %B!\n", warunek);
        System.out.printf("Najlepsza liczba to %d, a świadczy o tym fakt, że jest to po prostu %b. Jeszcze lepszą liczbą" +
                " jest %f, ponieważ ma tyle samo miejsc po przecinkuy co liter ma %s.", a, warunek, number1, tekst);
    }
}