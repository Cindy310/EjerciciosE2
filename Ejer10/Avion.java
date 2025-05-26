package Ejer10;

public class Avion extends Carro {
        public Avion(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public void mover() {
        System.out.println("El avión vuela en el aire destino El Salvador.");
    }
}