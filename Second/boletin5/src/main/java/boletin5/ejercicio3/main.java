package boletin5.ejercicio3;

public class main {
    public static void main(String[] args) {
        // Crear un objeto de tipo IPila usando la implementación PilaArrayList
        IPila impPila = new PilaArrayList();

        // Probar apilar elementos
        System.out.println("Apilando elementos...");
        impPila.apilar("Elemento 1");
        impPila.apilar("Elemento 2");
        impPila.apilar("Elemento 3");

        // Ver la cima de la pila
        System.out.println("Cima de la pila: " + impPila.cima()); // Debería mostrar "Elemento 3"

        // Desapilar un elemento
        System.out.println("Desapilando: " + impPila.desapilar()); // Debería mostrar "Elemento 3"
        System.out.println("Cima de la pila después de desapilar: " + impPila.cima()); // Debería mostrar "Elemento 2"

        // Desapilar el siguiente elemento
        System.out.println("Desapilando: " + impPila.desapilar()); // Debería mostrar "Elemento 2"
        System.out.println("Cima de la pila después de desapilar: " + impPila.cima()); // Debería mostrar "Elemento 1"

        // Desapilar el último elemento
        System.out.println("Desapilando: " + impPila.desapilar()); // Debería mostrar "Elemento 1"
    }
}