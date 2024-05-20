package Predicate;

import java.util.function.Predicate;

public class Ejemplo2Predicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = numero -> numero % 2 == 0;

        int numero1 = 4;
        int numero2 = 7;

        System.out.println("¿El número " + numero1 + " es par? " + isEven.test(numero1));
        System.out.println("¿El número " + numero2 + " es par? " + isEven.test(numero2));
    }
}
