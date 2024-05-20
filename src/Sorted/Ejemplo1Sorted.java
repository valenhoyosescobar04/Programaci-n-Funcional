package Sorted;
import java.util.Arrays;
import java.util.List;


public class Ejemplo1Sorted {

        public static void main(String[] args) {
            List<String> nombres = Arrays.asList("Juan", "María", "Pedro", "Ana");

            // Ordenar los nombres alfabéticamente
            nombres.stream()
                    .sorted()
                    .forEach(System.out::println);
        }
    }


