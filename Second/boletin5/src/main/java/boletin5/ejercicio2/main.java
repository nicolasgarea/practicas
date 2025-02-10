package boletin5.ejercicio2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("Toyota", "Corolla", TipoCombustible.DIESEL));
        vehiculos.add(new Vehiculo("Honda", "Civic", TipoCombustible.GASOLINA));
        vehiculos.add(new Vehiculo("Tesla", "Model 3", TipoCombustible.ELECTRICO));
        vehiculos.add(new Vehiculo("Ford", "Focus", TipoCombustible.DIESEL));

        imprime(vehiculos);
    }
    
    public static void imprime(ArrayList<Vehiculo> Vehiculo){
        for (Vehiculo vehiculo: Vehiculo){
            if (vehiculo.getTipoCombustible() == TipoCombustible.DIESEL){
                vehiculo.imprimir();
            }
        }
    }
}
