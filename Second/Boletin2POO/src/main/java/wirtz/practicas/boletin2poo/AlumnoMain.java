/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wirtz.practicas.boletin2poo;

import java.time.LocalDate;

/**
 *
 * @author nicolas.gareacidre
 */
public class AlumnoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Peter Garcia Lopez", "45012332Z", LocalDate.of(2004, 11, 2));

        Alumno alumno2 = new Alumno("Carla Iglesias Lopez", "44011232J", LocalDate.of(2004, 9, 2));
        
        Alumno alumno3 = new Alumno("Juan Calvo Herrero", "43499232N", LocalDate.of(2004, 9, 2));

        System.out.println(alumno1.getNombre() + " es mayor de edad: " + alumno1.esMayorDeEdad());
        System.out.println(alumno2.getNombre() + " es mayor de edad: " + alumno2.esMayorDeEdad());
        System.out.println(alumno1.getNombreEscuela());

        // Comparar edades
        System.out.println(alumno1.getNombre() + " es menor que " + alumno2.getNombre() + ": " + alumno1.esMenor(alumno2));

        // Verificar si los alumnos son duplicados
        System.out.println("¿" + alumno1.getNombre() + " es duplicado de " + alumno3.getNombre() + "? " + alumno1.esIgual(alumno3));

    }

}
