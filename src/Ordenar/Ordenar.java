/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenar;
import becker.robots.*;
import java.util.Scanner;
/**
 *
 * @author FAMILIA
 */
public class Ordenar {
    private Robot joe;
    private City unal;
    private Thing bola;
    Scanner sc = new Scanner(System.in);
    int matrizX, matrizY;
    


    public Ordenar(City unal){
        this.joe = new Robot(unal, 10, 1, Direction.NORTH);
//        this.unal = new City(11, 11);
//        int cantidad;
//        do {            
//            System.out.print("Ingrese la cantidad de columnas: ");
//            cantidad = sc.nextInt();
//        } while (cantidad > 10);        
//        int[] columnas = new int[cantidad];
//        for (int i = 0; i < cantidad; i++) {
//            do {
//                System.out.print("Ingrese el tamaño de la columna " + (i + 1) + ": ");
//                columnas[i] = sc.nextInt();
//            } while (columnas[i] > 10);
//        }
//        for (int i = 0; i < cantidad; i++) {
//            for (int j = 0; j < columnas[i]; j++) {
//                this.bola = new Thing(unal,((10-columnas[i])+(j+1)), (i+1));
//            }
//        }
//        ordenarMatrices(columnas);
    }
    
    public void turnRight() {
        for (int i = 0; i < 3; i++) {
            joe.turnLeft();
        }
    }

    public void advance(int a) {
        for (int i = 0; i < a; i++) {
            joe.move();
        }
    }
    
    public void ordenarMatrices(int matriz[]){
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i] < matriz[j]) {
                    aux = matriz[j];
                    matriz[j] = matriz[i];
                    matriz[i] = aux;
                }
            }
        }
        matrizOrganizada(matriz);
    }
    
    public void matrizOrganizada(int matriz[]){
        for (int i = 0; i < matriz.length; i++) {
            matrizX = joe.getStreet();
            matrizY = joe.getAvenue();
            for (int j = 0; j < matriz[i]; j++) {
                if (joe.canPickThing() == true) {
                    advance(1);
                } else if(joe.canPickThing() == false){
                    joe.putThing();
                    advance(1);
                }
            }
            while (joe.canPickThing() == true) {                
                joe.pickThing();
                advance(1);
            }
            joe.turnLeft();
            joe.turnLeft();
            while (joe.getStreet() <  matrizX) {                
                advance(1);
            }
            if (joe.getAvenue() <10) {
               joe.turnLeft();
            advance(1);
            joe.turnLeft(); 
            }
            
        }
    }
    
}
