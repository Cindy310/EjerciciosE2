package Ejer11;

public class Main {
 public static void main(String[] args) {

        Persona empleado = new Empleado("Cindy Recinos", 30, 1500.00, 300.00);
        Persona consultor = new Sueldo("Kelvin Martinez", 28, 50.00, 120);

        empleado.registrar();
        System.out.println("Sueldo total del empleado: $" + empleado.calcularSueldo());

        consultor.registrar();
        System.out.println("Sueldo total del consultor: $" + consultor.calcularSueldo());
    }
}

