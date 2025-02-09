/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wirtz.practicas.boletin3poo;

/**
 *
 * @author nicolas.gareacidre
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String tipo1 = "Coche";
        final String tipo2 = "Camion";
        Coche coche = new Coche("7821GCS", tipo1, 200, 5);
        Conductor conductor = new Conductor("46784332K", "Juan Pelayo");
        Remolque remolque = new Remolque();
        Camion camion = new Camion ("4552GSL", tipo2,100, remolque);
        camion.setAltura(10);
        coche.setConductor(conductor);
        coche.mostrarDatos();
        camion.mostrarDatos();
        Conductor conductor2 = new Conductor("43212221K", "Izan Alvarez");
        Vehiculo camion2 = new Camion ("43212223J", tipo2, 100, remolque);
        impresionPolimorfismo(camion2);
        mostrarRemolque(camion);
        Camion camion3 = new Camion ("3233232Z", tipo2, 200, 3);
        Camion camion4 = new Camion();
        Remolque remolque4 = new Remolque();
        camion4.setRemolque(remolque4);
        Remolque remolque3 = new Remolque();
        camion3.setRemolque(remolque3);
        camion3.mostrarDatos();
        camion4.mostrarDatos();
                
    }
    
    public static void impresionPolimorfismo(Vehiculo vehiculo){
        vehiculo.mostrarDatos();
        
    }
    
    public static void mostrarRemolque(Vehiculo camion1){
        if (camion1 instanceof Camion camion) {
        System.out.println(camion.getRemolque());
    }
    }
    
}
