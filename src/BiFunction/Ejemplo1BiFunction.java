package BiFunction;

import java.util.function.BiFunction;

public class Ejemplo1BiFunction {
    public static void main(String[] args) {
        BiFunction<String, String, String> concatenarCadenas = (cadena1, cadena2) -> cadena1 + " " + cadena2;

        String resultado = concatenarCadenas.apply("Hola", "Mundo");
        System.out.println("Resultado de la concatenación: " + resultado);
    }
}
