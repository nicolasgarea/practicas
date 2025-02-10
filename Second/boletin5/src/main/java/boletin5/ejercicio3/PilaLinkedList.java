package boletin5.ejercicio3;

import java.util.LinkedList;

public class PilaLinkedList implements IPila{
    LinkedList<Object> pila;
    public PilaLinkedList(){
        this.pila = new LinkedList<>();
    }
    @Override
    public void apilar(Object objeto) {
        pila.addLast(objeto);
    }
    @Override
    public Object desapilar() {    
        return pila.remove(pila.size()-1);
    }
    @Override
    public Object cima() {
        return pila.getLast();
    }

}
