package boletin5.ejercicio4;

import java.util.ArrayList;

public class ColaArrayList implements ICola {
    public ArrayList<Object> cola;
    public ColaArrayList() {
        this.cola = new ArrayList<>();
    }

    @Override
    public void encolar(Object objeto) {
        cola.add(objeto);
    }
    @Override
    public Object desencolar() {
        return cola.remove(0);
    }
    @Override
    public Object frente(){
        return cola.get(0);
    }
}
