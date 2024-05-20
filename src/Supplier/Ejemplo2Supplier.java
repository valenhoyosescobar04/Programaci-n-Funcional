package Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Ejemplo2Supplier {
    public static void main(String[] args) {
        Supplier<Date> currentDateSupplier = Date::new;

        // Genera y muestra la fecha y hora actuales
        System.out.println("Fecha y hora actual: " + currentDateSupplier.get());

        // Espera 1 segundo y muestra la fecha y hora actuales nuevamente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fecha y hora actual después de 1 segundo: " + currentDateSupplier.get());
    }
}

