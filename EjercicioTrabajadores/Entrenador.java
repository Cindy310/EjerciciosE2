package EjercicioTrabajadores;

public class Entrenador extends Persona {
    public void concentrarse() {
        System.out.println(nombre + " se está concentrando.");
    }
    public void viajar() {
        System.out.println(nombre + " está viajando.");
    }
    public void dirigirPartido() {
        System.out.println(nombre + " está dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " está dirigiendo un entrenamiento.");
    }
}