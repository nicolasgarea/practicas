/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package wirtz.practicas.boletin2poo;

/**
 *
 * @author nicolas.gareacidre
 */
public class Boletin2POO {

    public static void main(String[] args) {
        EjemplarLibro libro1 = new EjemplarLibro("El quijote");
        EjemplarLibro libro2 = new EjemplarLibro(libro1);
        EjemplarLibro libro3 = new EjemplarLibro(libro2);
        EjemplarLibro libro4 = new EjemplarLibro(libro3);
        
        libro1.prestar();
        libro4.devolver();
        String libroString1=libro1.toString();
        String libroString2=libro2.toString();
        String libroString3=libro3.toString();
        String libroString4=libro4.toString();
        System.out.println(libro1.toString());
         System.out.println(libroString2);
          System.out.println(libroString3);
           System.out.println(libroString4);
        
    }
}
