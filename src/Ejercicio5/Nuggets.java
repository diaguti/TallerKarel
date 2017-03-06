/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import becker.robots.*;
        

/**
 *
 * @author FAMILIA
 */
public class Nuggets {
    private City unal;
    private Robot joe;
    private Wall pared;
    private Thing nugget;
    
    public Nuggets(){
        this.unal = new City(15, 20);
        this.pared = new Wall(unal, 9, 15, Direction.SOUTH);
        this.pared = new Wall(unal,9, 15, Direction.EAST);
        this.pared = new Wall(unal,8, 16, Direction.SOUTH);
        for (int i = 0; i < 3; i++) {
            this.pared = new Wall(unal, (i+6), 16, Direction.EAST);
        }
        for(int i = 0; i < 2 ; i++){
            this.pared = new Wall(unal, (i+4), (i+14), Direction.EAST);
            this.pared = new Wall(unal, (i+5), (i+15), Direction.NORTH);
        }
        for (int i = 0; i < 4; i++) {
            this.pared = new Wall(unal, 4, (i+11), Direction.NORTH);
        }
         this.pared = new Wall(unal,4, 11, Direction.WEST);
         this.pared = new Wall(unal,5, 11, Direction.WEST);
         this.pared = new Wall(unal,6, 10, Direction.NORTH);
         this.pared = new Wall(unal,6, 10, Direction.WEST);
         this.pared = new Wall(unal,7, 9, Direction.NORTH);
         this.pared = new Wall(unal,7, 9, Direction.WEST);
         this.pared = new Wall(unal,8, 9, Direction.WEST);
         this.pared = new Wall(unal,8, 9, Direction.SOUTH);
         this.pared = new Wall(unal,9, 10, Direction.WEST);
         this.pared = new Wall(unal,9, 10, Direction.SOUTH);
         this.pared = new Wall(unal,9, 11, Direction.SOUTH);
         this.pared = new Wall(unal,9, 11, Direction.EAST);
         this.pared = new Wall(unal,8, 11, Direction.EAST);
         this.pared = new Wall(unal,7, 12, Direction.SOUTH);
         this.pared = new Wall(unal,7, 12, Direction.EAST);
         this.pared = new Wall(unal,6, 12, Direction.EAST);
         this.pared = new Wall(unal,6, 13, Direction.SOUTH);
         for (int i = 0; i < 2; i++) {
            this.pared = new Wall(unal, (i + 5), (i + 14), Direction.WEST);
            this.pared = new Wall(unal, (i + 5), (i + 14), Direction.SOUTH);
        }
        this.pared = new Wall(unal, 5, 13, Direction.NORTH);
        this.pared = new Wall(unal, 5, 12, Direction.NORTH);
        this.pared = new Wall(unal, 5, 12, Direction.WEST);
        this.pared = new Wall(unal, 6, 12, Direction.WEST);
        this.pared = new Wall(unal, 7, 11, Direction.NORTH);
        this.pared = new Wall(unal, 7, 11, Direction.WEST);
        this.pared = new Wall(unal, 8, 11, Direction.WEST);
        this.pared = new Wall(unal, 8, 10, Direction.NORTH);
        this.pared = new Wall(unal, 9, 13, Direction.WEST);
        this.pared = new Wall(unal, 9, 13, Direction.NORTH);
        this.pared = new Wall(unal, 8, 14, Direction.WEST);
        this.pared = new Wall(unal, 8, 14, Direction.NORTH);
        this.pared = new Wall(unal, 8, 15, Direction.NORTH);
        this.pared = new Wall(unal, 9, 15, Direction.WEST);
        this.pared = new Wall(unal, 8, 15, Direction.WEST);
        this.joe = new Robot(unal, 9, 15, Direction.NORTH);
        this.nugget = new Thing(unal, 5, 15);
        this.nugget = new Thing(unal, 6, 13);
        this.nugget = new Thing(unal, 8, 12);
        this.nugget = new Thing(unal, 10, 12);
    }
    
    public void turnRight(){
        for (int i = 0; i < 3; i++) {
            joe.turnLeft();
        }
    }
    
    public void atras(){
        joe.turnLeft();
        joe.turnLeft();
    }
    public void buscarCasa(){
//        while (joe.countThingsInBackpack() != 4) {            
            while (joe.frontIsClear() == true && (joe.getAvenue() != 12 || joe.getStreet() != 10)) {                
                joe.move();
                if (joe.canPickThing() == true) {
                    joe.pickThing();
                }
                if (joe.frontIsClear() == false) {
                    turnRight();
                    if (joe.frontIsClear() == false) {
                        atras();
                    }
                }
            }
//        }
    }
}
