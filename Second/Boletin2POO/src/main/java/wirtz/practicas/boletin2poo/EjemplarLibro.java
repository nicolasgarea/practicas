/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wirtz.practicas.boletin2poo;
import java.time.LocalDate;
/**
 *
 * @author nicolas.gareacidre
 */
public class EjemplarLibro {
    private String titulo;
    private LocalDate fecha;
    private int numeroEjemplar;
    private boolean prestado=false;
    
    public EjemplarLibro(String titulo){
        this.titulo = titulo;
        fecha = LocalDate.now();
        numeroEjemplar = 1;
        prestado = false;
    }
    
    public EjemplarLibro (EjemplarLibro libro){
        titulo = libro.titulo;
        fecha = libro.fecha;
        numeroEjemplar = libro.numeroEjemplar + 1;
        prestado = libro.prestado;
    }
    
    public boolean prestar(){
        if (prestado){
            prestado = true;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean devolver(){
        if (prestado){
            prestado = false;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        return titulo + "("+fecha+")"+"["+numeroEjemplar+"]";
    }
    
    
    
}
