/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wirtz.practicas.poo;
import java.time.LocalDate;
/**
 *
 * @author nicolas.gareacidre
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jose", "Rodriguez Mata", LocalDate.of(1945,01,15), 165);
        Persona persona2 = new Persona("Maria", "Sanchez Gomez", LocalDate.of(1980,12,26), 170);
        Persona persona3 = new Persona("Alejandro", "Gomez Gomez", LocalDate.of(2001,11,01), 190);
        Persona persona4 = new Persona("Jose Manuel", "Perez Pons", LocalDate.of(2010,05,01), 127);
        Persona persona5 = new Persona("Lorena", "Remeseiro Neira", 25);
        Persona persona6 = new Persona("Patricia", "Seoane Alvarez", 62);
        Persona personaarray[] = {persona1, persona2, persona3};
        Persona persona10=mayorEdad(personaarray);
    }
    
     public static Persona mayorEdad(Persona personaarray[]){
        Persona mayor = null;
        for (Persona i: personaarray){
            if (mayor.obtenerEdad()<i.obtenerEdad()){
                mayor = i;
            }
        }
        return mayor;
    }
    
}
