import java.util.Scanner;

public class Ejer8Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Animal
        Animal miAnimal = new Animal();

        // Pedir datos al usuario
        System.out.print("Ingrese el nombre del animal:");
        miAnimal.setNombre(scanner.nextLine());

        System.out.print("Ingrese el orden del animal: ");
        miAnimal.setOrden(scanner.nextLine());

        System.out.print("Ingrese el número de extremidades del animal: ");
        miAnimal.setExtremidades(scanner.nextInt());

        // Mostrar información del animal
        System.out.println("\nInformación del animal:");
        System.out.println("Nombre: " + miAnimal.getNombre());
        System.out.println("Orden: " + miAnimal.getOrden());
        System.out.println("Extremidades: " + miAnimal.getExtremidades());

        scanner.close();
    }
}

// Clase Animal (encapsulada)
class Animal {
    private String nombre;
    private String orden;
    private int extremidades;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }
}
