package Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ejemplo1Consumer {

        public static void main(String[] args) {
            List<Integer> numeros = new ArrayList<>();
            numeros.add(1);
            numeros.add(2);
            numeros.add(3);
            numeros.add(4);
            numeros.add(5);

            Consumer<Integer> consumer = numero -> {
                int resultado = numero * 2;
                System.out.println("El doble de " + numero + " es " + resultado);
            };

            numeros.forEach(consumer);
        }
    }


