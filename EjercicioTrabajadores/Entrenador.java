package EjercicioTrabajadores;

public class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " (entrenador) se está concentrando con el equipo.");
    }

    public void dirigirPartido() {
        System.out.println(getNombre() + " está dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " está dirigiendo un entrenamiento.");
    }
}