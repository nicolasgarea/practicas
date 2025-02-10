package boletin5.ejercicio5;

public class BucleWhile implements IBucle{
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
