
package Paso_2_Variables;
import java.util.ArrayList;

public class Paso_2_variables_Envoltorio {

// 🔷 CLASE PADRE (SUPERCLASE)
class Empleado {
    // Atributos protegidos para que los hijos los vean
    protected String nombre;
    protected Integer edad;      // Usamos Integer (envoltorio) para poder poner null si no se sabe
    protected Double salario;    // Double envoltorio

    // Constructor
    public Empleado(String nombre, Integer edad, Double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Método que puede ser sobrescrito
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | Edad: " + (edad != null ? edad : "?") + " | Salario: " + salario);
    }

    // Getter del salario (por si acaso)
    public Double getSalario() {
        return salario;
    }
}

// 🔶 CLASE HIJA 1
class Gerente extends Empleado {
    private Double bono;   // Bono extra, también envoltorio

    public Gerente(String nombre, Integer edad, Double salario, Double bono) {
        super(nombre, edad, salario);  // Llamada al constructor del padre
        this.bono = bono;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("👔 Gerente: " + nombre + " | Edad: " + (edad != null ? edad : "?") 
                         + " | Salario base: " + salario + " | Bono: " + bono);
    }

    public Double calcularPagoTotal() {
        // Cuidado con los null (autoboxing no evita NullPointerException)
        if (salario == null || bono == null) {
            System.out.println("⚠️ No se puede calcular el total: salario o bono son null");
            return 0.0;
        }
        return salario + bono;  // Aquí Java hace unboxing automático (Double -> double)
    }
}

// 🔶 CLASE HIJA 2
    class Programador extends Empleado {
    private String lenguaje;

    public Programador(String nombre, Integer edad, Double salario, String lenguaje) {
        super(nombre, edad, salario);
        this.lenguaje = lenguaje;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("💻 Programador: " + nombre + " | Edad: " + (edad != null ? edad : "?") 
                         + " | Salario: " + salario + " | Lenguaje: " + lenguaje);
    }
}

// 🧪 CLASE PRINCIPAL PARA PROBAR TODO
    public class Main {
        public static void main(String[] args) {
        
        // 🔹 USANDO ENVOLTORIOS EN COLECCIONES
        // No podemos hacer ArrayList<int> pero sí ArrayList<Integer>
        ArrayList<Integer> idsEmpleados = new ArrayList<>();
        idsEmpleados.add(101);   // autoboxing: int -> Integer
        idsEmpleados.add(102);
        idsEmpleados.add(103);
        
        System.out.println("IDs de empleados (colección con envoltorios): " + idsEmpleados);
        
        // Unboxing manual para operar
        int primerId = idsEmpleados.get(0);  // unboxing automático: Integer -> int
        System.out.println("Primer ID como int primitivo: " + primerId);
        
        System.out.println("\n--- Herencia en acción ---");
        
        // 🔹 CREANDO OBJETOS CON HERENCIA
        Empleado emp1 = new Gerente("Ana", 35, 3500.0, 800.0);
        Empleado emp2 = new Programador("Luis", 28, 2800.0, "Java");
        
        // 🔹 POLIMORFISMO: el método mostrarInfo cambia según el tipo real
        emp1.mostrarInfo();   // Llama al método de Gerente
        emp2.mostrarInfo();   // Llama al método de Programador
        
        System.out.println("\n--- Cosas con envoltorios que dan problemas (para que aprendas) ---");
        
        // ❌ CUIDADO 1: Comparar envoltorios con ==
        Integer a = new Integer(100);
        Integer b = new Integer(100);
        System.out.println("a == b? " + (a == b));  // false (son objetos diferentes)
        System.out.println("a.equals(b)? " + a.equals(b));  // true (compara valor)
        
        // ❌ CUIDADO 2: NullPointerException con unboxing
        Integer posibleNulo = null;
        // int valor = posibleNulo;  // Esto petaría (descomentar para ver el error)
        System.out.println("No ejecutamos la línea de null porque explota. Lo has evitado. Bien.");
        
        // 🔹 USO PRÁCTICO: métodos útiles de los envoltorios
        String numeroTexto = "123";
        int numeroConvertido = Integer.parseInt(numeroTexto);  // ¡Método de envoltorio!
        System.out.println("\nConvirtiendo texto a número: " + numeroConvertido);
        
        // 🔹 BONUS: calcular pago total del gerente (con cuidado de null)
        if (emp1 instanceof Gerente) {
            Gerente gerente = (Gerente) emp1;  // casting
            Double total = gerente.calcularPagoTotal();
            System.out.println("Pago total de " + gerente.nombre + ": " + total);
        }
    }
}
