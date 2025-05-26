package EjercicioTrabajadores;

public class Masajista extends Persona {
     public Object concentrarse;

     public void concentrarse() {
        System.out.println(nombre + " se está concentrando.");
    }
    public void viajar() {
        System.out.println(nombre + " está viajando.");
    }

    public void darMasaje() {
        System.out.println(nombre + " está dando un masaje.");
    }
}