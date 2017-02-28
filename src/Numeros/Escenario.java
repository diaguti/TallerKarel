/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros;

import becker.robots.*;
public class Escenario {
    private City unal;
    private Robot joe;    
    private Thing punto;
    private Wall pared;
    
    public Escenario(){
        this.unal = new City(9, 12);
        this.joe = new Robot(unal, 6, 2, Direction.NORTH);
        for (int i = 1; i < 6; i++) {
            this.pared = new Wall(unal, i, 1, Direction.WEST);
        }
        for (int i = 1; i < 6; i++) {
            this.pared = new Wall(unal, i, 4, Direction.WEST);
        }
        for (int i = 1; i < 6; i++) {
            this.pared = new Wall(unal, i, 7, Direction.WEST);
        }
        for (int i = 1; i < 6; i++) {
            this.pared = new Wall(unal, i, 9, Direction.EAST);
        }
        for (int i = 1; i < 10; i++) {
            this.pared = new Wall(unal, 1, i, Direction.NORTH);
        }
        this.pared = new Wall(unal, 5, 1, Direction.SOUTH);
        this.pared = new Wall(unal, 5, 3, Direction.SOUTH);
        this.pared = new Wall(unal, 5, 4, Direction.SOUTH);
        this.pared = new Wall(unal, 5, 6, Direction.SOUTH);
        this.pared = new Wall(unal, 5, 7, Direction.SOUTH);
        this.pared = new Wall(unal, 5, 9, Direction.SOUTH); 
        this.punto = new Thing(unal, 1, 1);
        this.punto = new Thing(unal, 1, 2);
        this.punto = new Thing(unal, 1, 3);
        this.punto = new Thing(unal, 2, 3);
        this.punto = new Thing(unal, 3, 3);
        this.punto = new Thing(unal, 4, 3);
        this.punto = new Thing(unal, 5, 3);
        this.punto = new Thing(unal, 1, 4);
        this.punto = new Thing(unal, 1, 5);
        this.punto = new Thing(unal, 1, 6);
        this.punto = new Thing(unal, 2, 6);
        this.punto = new Thing(unal, 3, 6);
        this.punto = new Thing(unal, 3, 5);
        this.punto = new Thing(unal, 3, 4);
        this.punto = new Thing(unal, 2, 4);
        this.punto = new Thing(unal, 4, 6);
        this.punto = new Thing(unal, 5, 6);
        this.punto = new Thing(unal, 5, 5);
        this.punto = new Thing(unal, 4, 4);
        this.punto = new Thing(unal, 5, 4);
        this.punto = new Thing(unal, 1, 7);
        this.punto = new Thing(unal, 1, 8);
        this.punto = new Thing(unal, 1, 9);
        this.punto = new Thing(unal, 2, 9);
        this.punto = new Thing(unal, 3, 9);
        this.punto = new Thing(unal, 4, 9);
        this.punto = new Thing(unal, 5, 9);
        this.punto = new Thing(unal, 5, 8);
        this.punto = new Thing(unal, 5, 7);
        this.punto = new Thing(unal, 3, 8);
        this.punto = new Thing(unal, 2, 7);
        this.punto = new Thing(unal, 3, 7);       
       }
    
    public void turnRight(){
        for (int i = 0; i < 3; i++) {
            joe.turnLeft();            
        }
    }
    
    public void advance(int i){
        for (int j = 0; j < i; j++) {
            joe.move();
        }
    }
    
    public void buscarNumero(){
        int j=0;
        boolean[] numeros = new boolean[10];
        for (int i = 0; i < 10; i++) {
          numeros[i] = true;  
        }
        advance(1);
        if (joe.canPickThing() == true) {
            numeros[1] = false;
            numeros[4] = false;
            numeros[7] = false;
        }else{
            numeros[0] = false;
            numeros[2] = false;
            numeros[3] = false;
            numeros[5] = false;
            numeros[6] = false;
            numeros[8] = false;
            numeros[9] = false;   
        }
        joe.turnLeft();
        advance(1);
        turnRight();
        advance(1);
        if (joe.canPickThing() == true) {
            numeros[3] = false;
            numeros[5] = false;
            numeros[9] = false;
        }else{
            numeros[2] = false;
        }
        advance(2);
        if (joe.canPickThing() == true) {
            numeros[1] = false;
            numeros[2] = false;
            numeros[3] = false;
        }else{
            numeros[4] = false;
        }
        advance(1);
        turnRight();
        advance(1);
        if (joe.canPickThing() == false) {
            numeros[7] = false;            
        }else{
            numeros[1] =false;
        }
        advance(1);
        turnRight();
        advance(1);
        if (joe.canPickThing() == true) {
            numeros[6] = false;
            numeros[5] = false;
        }
        advance(1);
        turnRight();
        advance(1);
        if (joe.canPickThing() == true) {
            numeros[0] = false;
            if (numeros[9] == true) {
                numeros[8] = false;
            }
        }        
        while (numeros[j] == false) {
//            numeros[j] = true;            
            j++;            
        }
        System.out.print(j);     
    }
    
    public void cambioSala(){
        joe.turnLeft();
        advance(3);
        joe.turnLeft();
        advance(3);
        joe.turnLeft();
    }
    
}