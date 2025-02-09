package boletin5.ejercicio2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private TipoCombustible tipoCombustible;

    public Vehiculo(String marca, String modelo, TipoCombustible tipoCombustible){
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
    }

    // Métodos getter
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    // Método para imprimir la información del automóvil
    public void imprimir() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Tipo de Combustible: " + tipoCombustible);
    }
}
