/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wirtz.practicas.boletin3poo;

/**
 *
 * @author nicolas.gareacidre
 */
public class Conductor {
    public String dni;
    public String nombre;
    public Conductor (String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        String resultado = "Dni: "+dni+"\n Nombre: "+nombre;
        return resultado;
    }
}
