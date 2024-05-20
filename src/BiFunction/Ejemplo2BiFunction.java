package BiFunction;

import java.util.function.BiFunction;

public class Ejemplo2BiFunction {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> calcularPrecioConImpuestos = (precioBase, tasaImpuesto) -> precioBase + (precioBase * tasaImpuesto / 100);

        Double precioBase = 100.0;
        Double tasaImpuesto = 21.0;
        Double precioTotal = calcularPrecioConImpuestos.apply(precioBase, tasaImpuesto);

        System.out.println("El precio total con impuestos es: " + precioTotal);
    }
}

