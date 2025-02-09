/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wirtz.practicas.poo;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
/**
 *
 * @author nicolas.gareacidre
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaDeNacimiento;
    private int estatura;
    
    
    
    public Persona(String nombre, String apellidos, LocalDate fechaDeNacimiento, int estatura){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.estatura=estatura;
    }
    
    public Persona(String nombre, String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaDeNacimiento=LocalDate.now().minusYears(edad);
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Fecha de Nacimiento: "+fechaDeNacimiento);
        System.out.println("Estatura: "+estatura);
    }
    
    public int obtenerEdad(){
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaDeNacimiento, hoy);
        return periodo.getYears();
    }
    
   
}
