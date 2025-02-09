/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wirtz.practicas.boletin2poo;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author nicolas.gareacidre
 */
public class Alumno {
    private String nombreCompleto;
    private String dni;
    private LocalDate fechaNacimiento;
    private static String nombreEscuela="IES Fernando Wirtz";
    
    public Alumno(String nombreCompleto, String dni, LocalDate fechaNacimiento){
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre(){
        return nombreCompleto;
    }
    public void setNombre(String nombre){
        this.nombreCompleto = nombreCompleto;
    }
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fecha){
        this.fechaNacimiento = fechaNacimiento;
    }
    public static String getNombreEscuela() {
        return nombreEscuela;
    }
    
    public boolean esMayorDeEdad(){
        LocalDate hoy = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, hoy);
        return edad.getYears()>18;
    }
    
    public boolean esMenor(Alumno alumno){
        LocalDate hoy = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, hoy);
        Period edad2 = Period.between(alumno.fechaNacimiento, hoy);
        return edad.getYears()<edad2.getYears();
    }
    
    public boolean esIgual(Alumno alumno){
        return this.nombreCompleto.equals(alumno.nombreCompleto) && this.dni.equals(alumno.dni) && this.fechaNacimiento.equals(alumno.fechaNacimiento);
    }
}
