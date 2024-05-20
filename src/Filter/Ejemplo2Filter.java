package Filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo2Filter {

        public static void main(String[] args) {
            List<Empleado> empleados = Arrays.asList(
                    new Empleado(1, "Juan", 5000, "Desarrollo"),
                    new Empleado(2, "María", 4800, "Ventas"),
                    new Empleado(3, "Pedro", 5500, "Desarrollo"),
                    new Empleado(4, "Laura", 5200, "Recursos Humanos")
            );

            // Definimos el salario mínimo deseado
            int salarioMinimo = 5000;

            // Filtrar empleados con salario superior al mínimo
            List<Empleado> empleadosConSalarioSuperior = empleados.stream()
                    .filter(e -> e.getSalario() > salarioMinimo)
                    .collect(Collectors.toList());

            // Imprimir empleados con salario superior al mínimo
            empleadosConSalarioSuperior.forEach(System.out::println);
        }

        static class Empleado {
            private int id;
            private String nombre;
            private double salario;
            private String departamento;

            public Empleado(int id, String nombre, double salario, String departamento) {
                this.id = id;
                this.nombre = nombre;
                this.salario = salario;
                this.departamento = departamento;
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

            public String getDepartamento() {
                return departamento;
            }

            @Override
            public String toString() {
                return "Empleado{" +
                        "id=" + id +
                        ", nombre='" + nombre + '\'' +
                        ", salario=" + salario +
                        ", departamento='" + departamento + '\'' +
                        '}';
            }
        }
    }



