/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        Double hijo1;
        Double hijo2;
        Double hijo3;
        Double total; 
        System.out.println("Ingrese el gasto del primer hijo");
        hijo1= entrada.nextDouble();
        System.out.println("Ingrese gasto del segundo hijo");
        hijo2= entrada.nextDouble();
        System.out.println("Ingrese el gasto del tercer hijo");
        hijo3= entrada.nextDouble();
        total= hijo1+hijo2+hijo3;
        System.out.println("El gasto total de los tres hijos es:\n" +total);
    }
    
}
