package boletin5.ejercicio5;


public class BucleFor implements IBucle {
    public static void main(String[] args) {
        BucleFor bucle = new BucleFor();
        bucle.mostrar(4);
        System.out.println("                                              ");
        bucle.mostrar(2, 15);
    }   
    
    @Override
    public void mostrar(int valorHasta) {
        for (int i=0; i<=valorHasta; i++){
            System.out.print(i);
        }
    }

    @Override
    public void mostrar(int valorDesde, int valorHasta){
        for (int i=valorDesde; i<=valorHasta; i++){
            System.out.print(i);
        }
    }
}

