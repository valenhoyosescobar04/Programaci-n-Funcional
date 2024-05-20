package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo2Map {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Calcular el cuadrado de cada número
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Imprimir los números al cuadrado
        System.out.println(squaredNumbers);
    }
}

