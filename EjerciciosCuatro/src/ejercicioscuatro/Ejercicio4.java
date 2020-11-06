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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        Double pCPU;
        Double pTeclado;
        Double pPantalla;
        Double pRaton;
        Double total;
        System.out.println("Ingrese el precio del CPU");
        pCPU= entrada.nextDouble();
        System.out.println("Ingrese el precio del teclado");
        pTeclado= entrada.nextDouble();
        System.out.println("Ingrese el precio de la pantalla");
        pPantalla= entrada.nextDouble();
        System.out.println("Ingrese el precio del raton");
        pRaton= entrada.nextDouble();
        total= pCPU + pTeclado + pPantalla + pRaton;
        System.out.println("El precio total es:\n " +total);
        
    }
    
}
