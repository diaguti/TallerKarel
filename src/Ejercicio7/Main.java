/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import becker.robots.*;
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
        int cantidad;
        do {     
            System.out.print("Ingrese la cantidad de columnas: ");
            cantidad = sc.nextInt();
        } while (cantidad > 10 || cantidad < 1);        
        int[] columnas = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            do {
                System.out.print("Ingrese el tamaño de la columna " + (i + 1) + ": ");
                columnas[i] = sc.nextInt();
            } while (columnas[i] > 10 || columnas[i] < 1);
        }
        City unal = new City(11, 11);
        Ordenar ordenar = new Ordenar(unal);
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < columnas[i]; j++) {
                Thing bola = new Thing(unal,((10-columnas[i])+(j+1)), (i+1));
            }
        }
        ordenar.ordenarMatrices(columnas);
        
        
    }
    
}
