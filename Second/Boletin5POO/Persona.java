import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }// Persona

    public String getNombre() {
        return nombre;
    }// getNombre

    public String getApellidos() {
        return apellidos;
    }// getApellidos

    public int getEdad() {
        return edad;
    }// getEdad


    public static ArrayList<Persona> filtrar(ArrayList<Persona> arrayList, char letra){
        ArrayList<Persona> result = new ArrayList<>();
        for (Persona persona: arrayList){
            if(persona.getNombre().charAt(0) == letra){
                result.add(persona);
            }
        }
        return result;
    }

    public static void filtrarEdad(ArrayList<Persona> arrayList, int edad){
        for (int i=arrayList.size()-1; i>=0; i--){
            if (arrayList.get(i).getEdad()>edad){
                arrayList.remove(i);
            }
        }
    }

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+" Edad: "+getEdad();
    }
    
}// class