package Ejer10;

public class Carro {
    private String marca;
    private String modelo;
    private String color;

    public Carro() {
    }
    public Carro(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void mover() {
        System.out.println("El vehículo se está moviendo por la carretera los chorros.");
}
}