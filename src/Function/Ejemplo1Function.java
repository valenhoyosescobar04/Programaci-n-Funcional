package Function;

import java.util.function.Function;

public class Ejemplo1Function {
    public static void main(String[] args) {
        Function<String, Integer> stringToInteger = Integer::parseInt;

        String numeroComoCadena = "123";
        Integer numero = stringToInteger.apply(numeroComoCadena);

        System.out.println("El número es: " + numero);
    }
}
