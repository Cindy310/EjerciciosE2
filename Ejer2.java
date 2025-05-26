import java.util.Scanner;

public class Ejer2 {
  public static void main(String[] args) {
    int[] numeros = new int[12];
    int suma = 0;
    double promedio;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserta los numeros enteros:");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print("numeros " + (i + 1) + ": ");
      numeros[i] = scanner.nextInt();
      suma += numeros[i];
    }
    promedio = (double) suma / numeros.length;

    System.out.println("\nEl promedio de números ingresados es 🤓☝🏻: " + promedio);
    scanner.close();
  }
}
