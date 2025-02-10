package boletin5.ejercicio3;

import java.util.ArrayList;

public class PilaArrayList implements IPila{
    ArrayList<Object> pila;
    public PilaArrayList(){
        pila = new ArrayList<>();
    }
    @Override
    public void apilar(Object objeto) {
        pila.add(objeto);
    }
    public Object desapilar(){
        return pila.remove(pila.size() - 1);
    }
    public Object cima(){
        return pila.get(pila.size() - 1);
    }
}
