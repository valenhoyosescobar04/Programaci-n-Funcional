package Predicate;

import java.util.function.Predicate;

public class Ejemplo1Predicate {
    public static void main(String[] args) {
        Predicate<String> isEmpty = String::isEmpty;

        String cadena1 = "";
        String cadena2 = "Hola";

        System.out.println("¿La cadena1 está vacía? " + isEmpty.test(cadena1));
        System.out.println("¿La cadena2 está vacía? " + isEmpty.test(cadena2));
    }
}
