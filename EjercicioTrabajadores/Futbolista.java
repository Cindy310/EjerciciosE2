package EjercicioTrabajadores;

public class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " (futbolista) se está concentrando para el partido.");
    }

    public void jugarPartido() {
        System.out.println(getNombre() + " está jugando un partido.");
    }

    public void entrenar() {
        System.out.println(getNombre() + " está entrenando.");
    }
}