package EjercicioTrabajadores;

public class Main {
 public static void main(String[] args) {
        Futbolista jugador = new Futbolista();
        jugador.nombre = "Messi";
        jugador.concentrarse();
        jugador.viajar();
        jugador.jugarPartido();
        jugador.concentrarse();

        Entrenador tecnico = new Entrenador();
        tecnico.nombre = "Julio";
        tecnico.concentrarse();
        tecnico.viajar();
        tecnico.dirigirPartido();
        tecnico.dirigirEntrenamiento();
        
        

        Masajista masajista = new Masajista();
        masajista.nombre = "Cindy";
        masajista.concentrarse();
        masajista.viajar();
        masajista.darMasaje();
    }
}