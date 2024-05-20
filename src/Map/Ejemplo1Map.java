package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo1Map {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "mary", "alice", "andrea");

        // Convertir los nombres a mayúsculas
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Imprimir los nombres en mayúsculas
        System.out.println(upperCaseNames);
    }
}
