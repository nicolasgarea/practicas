/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wirtz.practicas.boletin3poo;

/**
 *
 * @author nicolas.gareacidre
 */
public class Vehiculo {
    protected String matricula;
    protected String tipo;
    protected int velocidadMaxima;
    protected Conductor conductor;
    public Vehiculo (String matricula, String tipo, int velocidadMaxima){
        this.matricula = matricula;
        this.tipo = tipo;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public Vehiculo (){
        
    }
    public void mostrarDatos(){
        System.out.println("Matricula: "+matricula);
        System.out.println("Tipo: "+tipo);
        System.out.println("Velocidad Maxima: "+velocidadMaxima);
        System.out.println("Conductor: "+conductor);
    }
    
    public void setConductor(Conductor conductor){
    this.conductor = conductor;
    }
}
