package Ejer8Animal;

import java.util.Scanner;

public class Ejer8Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal miAnimal = new Animal();

        System.out.print("Ingrese el nombre del animal:");
        miAnimal.setNombre(scanner.nextLine());

        System.out.print("Ingrese el orden del animal: ");
        miAnimal.setOrden(scanner.nextLine());

        System.out.print("Ingrese el número de extremidades del animal: ");
        miAnimal.setExtremidades(scanner.nextInt());

        System.out.println("\nInformación del animal:");
        System.out.println("Nombre: " + miAnimal.getNombre());
        System.out.println("Orden: " + miAnimal.getOrden());
        System.out.println("Extremidades: " + miAnimal.getExtremidades());

        scanner.close();
    }
}

class Animal {
    private String nombre;
    private String orden;
    private int extremidades;

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
