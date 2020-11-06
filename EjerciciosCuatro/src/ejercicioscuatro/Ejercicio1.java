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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        Double base;
        Double altura;
        Double area;
        System.out.println("Ingrese la base del triangulo");
        base= entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura= entrada.nextDouble();
        area= (base*altura)/2;
        System.out.println("El area del triangulo es:\n" +area);
    }
    
}
