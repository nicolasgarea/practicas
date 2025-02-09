/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wirtz.practicas.ejercicio3poo;

/**
 *
 * @author nicolas.gareacidre
 */
public class CuentaCorriente {
    public String iban;
    private double saldo;
    private double porcentajeComision;
    private int contadorIngresos;
    
    public CuentaCorriente(String iban, double porcentajeComision){
        this.iban = iban;
        this.saldo = 0;
        this.porcentajeComision = porcentajeComision;
        this.contadorIngresos= 0;
    }
    
    public void ingresar(double importe){
        saldo += importe;
        contadorIngresos++;
        if (contadorIngresos==3){
            saldo += 0.7;
        }
    }
    
    public boolean retirar(double importe){

        double comision = (porcentajeComision / 100) * importe;
        double totalRetiro = importe + comision;
        if (totalRetiro>saldo){
            return false;
        }
        else{
            saldo -= totalRetiro;
            contadorIngresos=0;
            return true;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setComision(double porcentaje){
        porcentajeComision = porcentaje;
    }
    
    public double getPorcentajeComision(){
        return porcentajeComision;
    }
}
