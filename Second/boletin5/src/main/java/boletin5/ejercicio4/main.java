package boletin5.ejercicio4;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        ICola impCola= new ColaArrayList();
        ICola cola = new ColaLinkedList();
        impCola.encolar(10);
        impCola.encolar("Hola");
        impCola.encolar(3.14);
        cola.encolar(10);
        cola.encolar("Hola");
        cola.encolar(3.14);
        System.out.println(impCola.frente());
        System.out.println(cola.frente());
        System.out.println(impCola.desencolar());
        System.out.println(cola.desencolar());
        System.out.println("Frente de la cola: " + impCola.frente()); // Debería imprimir: Hola
        System.out.println("Frente de la cola: " + cola.frente());
        // Desencolamos otro elemento
        System.out.println("Desencolando: " + impCola.desencolar()); // Debería imprimir: Hola
        System.out.println("Desencolando: " + cola.desencolar()); // Debería imprimir: Hola

        // Mostramos el último frente de la cola
        System.out.println("Frente de la cola: " + impCola.frente()); // Debería imprimir: 3.14
        System.out.println("Frente de la cola: " + cola.frente());
    }
}
