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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        Double mPrestamo;
        Double interesMensual;
        Double total;
        System.out.println("Ingrese el monto del prestamo");
        mPrestamo= entrada.nextDouble();
        System.out.println("Ingrese el interes mensual");
        interesMensual= entrada.nextDouble();
        total = (mPrestamo/12)+interesMensual;
        System.out.println("El costo al mes es:\n" +total);
    }
    
}
