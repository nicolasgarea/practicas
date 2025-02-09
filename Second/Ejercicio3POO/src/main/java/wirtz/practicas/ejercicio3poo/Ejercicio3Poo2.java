/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wirtz.practicas.ejercicio3poo;

import java.util.Scanner;

/**
 *
 * @author nicolas.gareacidre
 */
public class Ejercicio3Poo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el IBAN: ");
            String iban = sc.nextLine();
            System.out.println("Introduce el porcentaje de comision: ");
            double comision = sc.nextDouble();
            sc.nextLine();
            CuentaCorriente2 cuenta = new CuentaCorriente2(iban);

            System.out.println("Introduce el IBAN: ");
            String iban2 = sc.nextLine();
            System.out.println("Introduce el porcentaje de comision: ");
            double comision2 = sc.nextDouble();
            sc.nextLine();

            CuentaCorriente2 cuenta2 = new CuentaCorriente2(iban2);
            CuentaCorriente2 cuentaActiva = cuenta;
            int opcion;
             do {
                System.out.println("\n----- Menú -----");
                System.out.println("1. Ingresar dinero");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Consultar saldo");
                System.out.println("4. Cambiar comisión");
                System.out.println("5. Cambiar de cuenta activa");
                System.out.println("6. Salir");
                System.out.print("Selecciona una opción: ");
                
                opcion = sc.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el importe: ");
                        double importeIngreso = sc.nextDouble();
                        cuentaActiva.ingresar(importeIngreso);
                        break;
                    case 2:
                        System.out.println("Introduce el dinero a retirar: ");
                        double importeRetiro = sc.nextDouble();
                        cuentaActiva.retirar(importeRetiro);
                        break;
                    case 3:
                        double saldo=cuentaActiva.getSaldo();
                        System.out.println("Este es tu saldo: "+saldo);

                        break;
                    case 4: 
                        System.out.println("Introduce que comision desea usar: ");
                        comision=sc.nextDouble();
                        CuentaCorriente2.setComision(comision);
                        break;
                    case 5:
                        System.out.println("Introduce que cuenta quieres usar: (1 o 2)");
                        int cuentaSeleccionada = sc.nextInt();
                        if (cuentaSeleccionada == 1) {
                            cuentaActiva = cuenta;
                        }
                        else{
                            cuentaActiva = cuenta2;
                        }
                        break;
                    case 6:
                        break;

                }
            }while(opcion != 6);
    }
    
}
