package boletin5.ejercicio4;

import java.util.LinkedList;

public class ColaLinkedList implements ICola{
    public LinkedList<Object> cola;
    public ColaLinkedList(){
        this.cola = new LinkedList<>();
    }
    @Override
    public void encolar(Object objeto){
        cola.addLast(objeto);
    }
    @Override
    public Object desencolar() {
        return cola.removeFirst();
    }
    @Override
    public Object frente() {
        return cola.pollFirst();
    }
}
