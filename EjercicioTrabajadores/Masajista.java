package EjercicioTrabajadores;

public class Masajista extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " (masajista) se está concentrando");
    }

    public void darMasaje() {
        System.out.println(getNombre() + " está dando un masaje.");
    }
}