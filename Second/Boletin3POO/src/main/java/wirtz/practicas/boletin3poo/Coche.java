/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wirtz.practicas.boletin3poo;

/**
 *
 * @author nicolas.gareacidre
 */
public class Coche extends Vehiculo {
    private int numeroPlazas;
    public Coche(String matricula, String tipo, int vMaxima, int numPlazas){
        this.matricula = matricula;
        this.tipo = tipo;
        this.velocidadMaxima = vMaxima;
        this.numeroPlazas = numPlazas;
    }
    public int getNumeroPlazas(){
        return numeroPlazas;
    }
    public void setNumeroPlazas(int numeroPlazas){
        this.numeroPlazas = numeroPlazas;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Numero de plazas: "+numeroPlazas);
    }
}
