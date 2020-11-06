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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        Double cMinutos;
        Double mConsumidos;
        Double total;
        System.out.println("Ingrese el costo por minutos");
        cMinutos= entrada.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos");
        mConsumidos= entrada.nextDouble();
        total= cMinutos * mConsumidos;
        System.out.println("El costo total al final del mes es;\n" +total);
    }
}
