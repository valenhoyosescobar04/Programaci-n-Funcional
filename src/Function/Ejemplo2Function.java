package Function;

import java.util.function.Function;

public class Ejemplo2Function {
    public static void main(String[] args) {
        Function<Double, Double> calcularAreaCirculo = radio -> Math.PI * Math.pow(radio, 2);

        Double radio = 5.0;
        Double area = calcularAreaCirculo.apply(radio);

        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
}
