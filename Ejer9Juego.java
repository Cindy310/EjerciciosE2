import java.util.Scanner;
public class Ejer9Juego {
public static void main(String[] args) {
    Scanner IDK = new Scanner(System.in);
    int puntajeTotal = 0;

    // Nivel 1
    System.out.println(" NIVEL 1 ");
    puntajeTotal += hacerPregunta(IDK, "¿Cuál es el río más largo del mundo?\n a) Amazonas\n b) Nilo\n c) Yangtsé", 'a', 10, -5);
    puntajeTotal += hacerPregunta(IDK, "¿Qué país ganó la Copa Mundial de Fútbol 2018?\n a) Alemania\n b) Brasil\n c) Francia", 'c', 10, -5);
    puntajeTotal += hacerPregunta(IDK, "¿Cuántos continentes hay en el mundo?\n a) 5\n b) 6\n c) 7", 'c', 10, -5);

    // Nivel 2
    System.out.println("\n NIVEL 2 ");
    puntajeTotal += hacerPregunta(IDK, "¿Quién pintó La Última Cena?\n a) Miguel Ángel\n b) Leonardo da Vinci\n c) Rafael", 'b', 20, -10);
    puntajeTotal += hacerPregunta(IDK, "¿En qué año llegó el hombre a la Luna?\n a) 1965\n b) 1969\n c) 1972", 'b', 20, -10);
    puntajeTotal += hacerPregunta(IDK, "¿Cuál es el idioma más hablado del mundo?\n a) Inglés\n b) Español\n c) Chino mandarín", 'c', 20, -10);
    puntajeTotal += hacerPregunta(IDK, "¿Qué científico propuso la teoría de la relatividad?\n a) Newton\n b) Einstein\n c) Galileo", 'b', 20, -10);

    // Resultado final
    System.out.println("\nPuntaje total acumulado: " + puntajeTotal + " puntos");
    IDK.close();
}

// Método para realizar una pregunta
public static int hacerPregunta(Scanner scanner, String pregunta, char respuestaCorrecta, int puntosCorrecta, int puntosIncorrecta) {
    System.out.println(pregunta);
    System.out.print("Tu respuesta: ");
    char respuesta = scanner.next().toLowerCase().charAt(0);

    if (respuesta == respuestaCorrecta) {
        System.out.println("¡Correcto! +" + puntosCorrecta + " puntos\n");
        return puntosCorrecta;
    } else {
        System.out.println("Incorrecto. -" + Math.abs(puntosIncorrecta) + " puntos\n");
        return puntosIncorrecta;
    }
}

}
