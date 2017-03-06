/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author FAMILIA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer valor: ");
        int c = sc.nextInt();
        System.out.print("Ingrese el cuarto valor: ");
        int d = sc.nextInt();
        Histograma histograma = new Histograma(a, b , c, d);
        histograma.evaluarHistograma();
    }
    
    
}
