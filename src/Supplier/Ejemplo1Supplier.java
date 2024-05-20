package Supplier;

import java.util.function.Supplier;
import java.util.Random;

public class Ejemplo1Supplier {
    public static void main(String[] args) {
        Supplier<String> randomStringSupplier = () -> {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            StringBuilder stringBuilder = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                stringBuilder.append(characters.charAt(random.nextInt(characters.length())));
            }
            return stringBuilder.toString();
        };

        // Genera y muestra 5 cadenas aleatorias
        for (int i = 0; i < 5; i++) {
            System.out.println(randomStringSupplier.get());
        }
    }
}

