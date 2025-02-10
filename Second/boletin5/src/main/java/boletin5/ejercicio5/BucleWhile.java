package boletin5.ejercicio5;

public class BucleWhile implements IBucle{

    public static void main(String[] args) {
        BucleWhile bucleWhile = new BucleWhile();
        bucleWhile.mostrar(5);
        bucleWhile.mostrar(5, 10);
    }
    @Override
    public void mostrar(int valorHasta) {
        int i=0;
        while (i<=valorHasta){
            System.out.print(i);
            i++;
        }
    }
    @Override
    public void mostrar(int valorDesde, int valorHasta) {
        int i=valorDesde;
        while (i<=valorHasta){
            System.out.print(i);
            i++;
        }
    }
}
