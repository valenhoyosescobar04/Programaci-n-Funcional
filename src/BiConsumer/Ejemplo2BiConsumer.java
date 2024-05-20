package BiConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Ejemplo2BiConsumer {
    public static void main(String[] args) {
        List<String> marcas = Arrays.asList("Apple", "Dell", "HP");
        List<String> modelos = Arrays.asList("MacBook Pro", "Lenovo", "MSI");

        List<String> resultado = new ArrayList<>();

        BiConsumer<String, String> biConsumer = (marca, modelo) -> resultado.add(marca + " " + modelo);

        // Combina las dos listas utilizando el BiConsumer
        for (int i = 0; i < marcas.size(); i++) {
            biConsumer.accept(marcas.get(i), modelos.get(i));
        }

        System.out.println(resultado); // [Apple MacBook Pro, Dell XPS 13, HP Pavilion]
    }
}
