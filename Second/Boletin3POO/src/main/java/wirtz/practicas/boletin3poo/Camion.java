/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wirtz.practicas.boletin3poo;

/**
 *
 * @author nicolas.gareacidre
 */
public class Camion extends Vehiculo {
    private int altura;
    private Remolque remolque;
    public Camion (String matricula, String tipo, int vMaxima, Remolque remolque){
        this.matricula = matricula;
        this.tipo = tipo;
        this.velocidadMaxima = vMaxima;
        this.remolque = remolque;
    } 
    public Camion (){
        super();
    }
    public Camion (String matricula, String tipo, int vMaxima, int altura){
        this.matricula = matricula;
        this.tipo = tipo;
        this.velocidadMaxima = vMaxima;
        this.altura = altura;
    }
    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Altura: "+altura);
        System.out.println("Remolque: "+remolque.toString());
    }
    
    public Remolque getRemolque(){
        return remolque;
    }
    
    public void setRemolque (Remolque remolque){
        this.remolque = remolque;
    }
}
