package EjercicioTrabajadores;

public class Main {
    public static void main(String[] args) {
        Futbolista jugador = new Futbolista(1, "Messi", "Mendez", 28, 10, "Delantero");
        Entrenador tecnico = new Entrenador(2, "Julio", "Pérez", 50, "FED123");
        Masajista masajista = new Masajista(3, "Cindy", "Martínez", 35, "Fisioterapia", 8);

        jugador.viajar();
        jugador.concentrarse();
        jugador.jugarPartido();

        tecnico.viajar();
        tecnico.concentrarse();
        tecnico.dirigirPartido();

        masajista.viajar();
        masajista.concentrarse();
        masajista.darMasaje();
    }
}