package boletin5.ejercicio5;

public class BucleDoWhile implements IBucle{


    public static void main(String[] args) {
        BucleDoWhile bucleDoWhile = new BucleDoWhile();
        bucleDoWhile.mostrar(5);
        bucleDoWhile.mostrar(5,10);
    }
    @Override
    public void mostrar(int valorHasta) {
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=valorHasta);
    }
    @Override
    public void mostrar(int valorDesde, int valorHasta) {
        int i=valorDesde;
        do{
            System.out.println(i);
            i++;
        }while(i<=valorHasta);
    }
}
