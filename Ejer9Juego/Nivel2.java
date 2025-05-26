package Ejer9Juego;

import java.util.Scanner;

public class Nivel2 {
    public int puntaje;
    private String respuesta;
    private final String[] respuestas;
    private final String[] preguntas;
    private final Scanner ent;

    public Nivel2() {
        this.puntaje = 0;
        this.ent = new Scanner(System.in);

        this.preguntas = new String[] {
                "El río Amazonas es el más largo del mundo..",
                "Marte es conocido como el “planeta rojo",
                "Leonardo DiCaprio interpretó a Jack en Titanic.",
                "Microsoft desarrolló el sistema operativo Windows."
        };

        this.respuestas = new String[] {
                "Falso",
                "Verdadero",
                "Verdadero",
                "Verdadero"
        };
    }

    private void puntajeVerdadero() {
        if (respuesta.equalsIgnoreCase("Verdadero")) {
            System.out.println("Correcto, Felicidades por no ser tan estupido :)");
            System.out.println("Ganaste 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("Incorrecto, estas fallando como tu ex te fallo a ti");
            System.out.println("Incorrectoooo -10 puntos por pendejo");
            puntaje -= 10;
        }
        System.out.println();
    }

    private void puntajeFalso() {
        if (respuesta.equalsIgnoreCase("Falso")) {
            System.out.println("Correcto, Felicidades por no ser tan estupido:)");
            System.out.println("Ganaste 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("Incorrecto, estas fallando como tu ex te fallo a ti");
            System.out.println("Incorrectoooo -10 puntos por pendejo");
            puntaje -= 10;
        }
        System.out.println();
    }

    public void imprimePreguntas() {
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i]);
            System.out.print("Responde (Verdadero/Falso): ");
            respuesta = ent.nextLine();

            if (respuestas[i].equalsIgnoreCase("Verdadero")) {
                puntajeVerdadero();
            } else {
                puntajeFalso();
            }
        }
    }

}
