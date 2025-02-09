import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(new Persona("Jose", "Martinez Granda", 55));
        listaPersonas.add(new Persona("Katy", "Ruiz Gomez", 24));
        listaPersonas.add(new Persona("Jose Manuel", "Blanco Garrido", 18));
        listaPersonas.add(new Persona("Jose Luis", "Rodriguez Vázquez", 72));
        listaPersonas.add(new Persona("Borja", "López López", 11));
        listaPersonas.add(new Persona("Lourdes", "Neira Arias", 62));
        listaPersonas.add(new Persona("Josefa", "Martinez Seoane", 57));
        // llamada al método de obtener personas cuyo nombre comience por 'J'
        listaPersonas=Persona.filtrar(listaPersonas, 'J');
        // Llamada al método de obtener personas con edad menor a 60 años
        Persona.filtrarEdad(listaPersonas, 60);
        // Impresión de las Personas restantes en la lista por medio de un foreach y
        for (Persona persona: listaPersonas){
            System.out.println(persona.toString());
        }
        // utilización del toString()

    }
}
