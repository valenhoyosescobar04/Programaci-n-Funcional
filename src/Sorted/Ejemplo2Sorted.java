package Sorted;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Ejemplo2Sorted {
        public static void main(String[] args) {
            List<Empleado> empleados = Arrays.asList(
                    new Empleado(1, "Juan", 5000),
                    new Empleado(2, "María", 4800),
                    new Empleado(3, "Pedro", 5500),
                    new Empleado(4, "Laura", 5200)
            );

            // Ordenar los empleados por salario (de mayor a menor)
            empleados.stream()
                    .sorted(Comparator.comparing(Empleado::getSalario).reversed())
                    .forEach(System.out::println);
        }

        static class Empleado {
            private int id;
            private String nombre;
            private double salario;

            public Empleado(int id, String nombre, double salario) {
                this.id = id;
                this.nombre = nombre;
                this.salario = salario;
            }

            public int getId() {
                return id;
            }

            public String getNombre() {
                return nombre;
            }

            public double getSalario() {
                return salario;
            }

            @Override
            public String toString() {
                return "Empleado{" +
                        "id=" + id +
                        ", nombre='" + nombre + '\'' +
                        ", salario=" + salario +
                        '}';
            }
        }
    }
