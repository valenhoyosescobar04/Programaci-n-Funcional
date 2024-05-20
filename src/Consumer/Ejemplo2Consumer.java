package Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ejemplo2Consumer {

        public static void main(String[] args) {
            List<String> nombres = new ArrayList<>();
            nombres.add("Carlos");
            nombres.add("Ana");
            nombres.add("Luis");

            Consumer<String> consumer = nombre -> System.out.println(nombre + "!");

            // Utilizando forEach para procesar todos los elementos
            nombres.forEach(consumer);

            // Utilizando accept() directamente para procesar un solo elemento
            System.out.println("Procesando un solo nombre:");
            consumer.accept("Roberto");
        }
    }

