/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import becker.robots.*;

/**
 *
 * @author FAMILIA
 */
public class Ladrillos {

    private City unal;
    private Thing ladrillo;
    private Robot joe;
    private Wall muro;
    int entradaX = 0;
    int entradaY = 0;
    int salidaX = 0;
    int salidaY = 0;
    boolean hayLadrillos = true;

    public Ladrillos() {
        this.unal = new City(15, 15);
        for (int i = 0; i < 4; i++) {
            this.muro = new Wall(unal, 13, (i + 2), Direction.SOUTH);
        }
        for (int i = 0; i < 5; i++) {
            this.muro = new Wall(unal, (i + 9), 5, Direction.EAST);
        }
        for (int i = 0; i < 5; i++) {
            this.muro = new Wall(unal, 9, (i + 1), Direction.NORTH);
        }
        for (int i = 0; i < 5; i++) {
            this.muro = new Wall(unal, (i + 9), 1, Direction.WEST);
        }
        for (int i = 0; i < 4; i++) {
            this.muro = new Wall(unal, 10, (i + 8), Direction.SOUTH);
        }
        for (int i = 0; i < 5; i++) {
            this.muro = new Wall(unal, (i + 6), 11, Direction.EAST);
        }
        for (int i = 0; i < 5; i++) {
            this.muro = new Wall(unal, 6, (i + 7), Direction.NORTH);
        }
        for (int i = 0; i < 5; i++) {
            this.muro = new Wall(unal, (i + 6), 7, Direction.WEST);
        }
        this.ladrillo = new Thing(unal, 13, 2);
        this.ladrillo = new Thing(unal, 12, 1);
        this.ladrillo = new Thing(unal, 10, 1);
        this.ladrillo = new Thing(unal, 9, 2);
        this.ladrillo = new Thing(unal, 9, 4);
        this.ladrillo = new Thing(unal, 10, 5);
        this.ladrillo = new Thing(unal, 12, 5);
        this.ladrillo = new Thing(unal, 13, 4);
        this.ladrillo = new Thing(unal, 11, 8);
        this.ladrillo = new Thing(unal, 11, 2);
        this.ladrillo = new Thing(unal, 11, 4);
        this.ladrillo = new Thing(unal, 10, 3);
        this.ladrillo = new Thing(unal, 12, 3);
        this.ladrillo = new Thing(unal, 13, 3);
        this.joe = new Robot(unal, 14, 1, Direction.NORTH);
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
    
    public void atras(){
        joe.turnLeft();
        joe.turnLeft();
    }
    
    public void transportar() {
        while (joe.canPickThing() == false && joe.countThingsInBackpack() != 1 && hayLadrillos == true) {
            advance(1);
            if (joe.frontIsClear() == false) {
                if (joe.getDirection() == Direction.NORTH && joe.canPickThing() == false) {
                    turnRight();
                    if (joe.frontIsClear() == false) {
                        hayLadrillos = false;
                    } else {
                        advance(1);
                        turnRight();
                    }
                } else if (joe.getDirection() == Direction.SOUTH && joe.canPickThing() == false) {
                    joe.turnLeft();
                    advance(1);
                    joe.turnLeft();
                }
            }

        }
        if (hayLadrillos == true) {

            joe.pickThing();
            entradaX = joe.getStreet();
            entradaY = joe.getAvenue();
            salidaX = joe.getStreet() - 3;
            salidaY = joe.getAvenue() + 6;

            if (joe.getDirection() == Direction.NORTH) {
                if (joe.getAvenue() > 1) {
                    joe.turnLeft();
                    while (joe.getAvenue() > 1) {
                        advance(1);
                    }
                    turnRight();
                }
                atras();
//            while (joe.getAvenue() > 1){
//                
//            }
                while (joe.getStreet() < 14) {
                    advance(1);
                }
            } else if (joe.getDirection() == Direction.SOUTH) {
                turnRight();
                while (joe.getAvenue() > 1) {
                    advance(1);
                }
                joe.turnLeft();
                while (joe.getStreet() < 14) {
                    advance(1);
                }
            }
            joe.turnLeft();
            advance(6);
            joe.turnLeft();
            advance(3);
        }
    }

    public void poner() {
        if (hayLadrillos == true) {

            while (joe.getStreet() > salidaX) {
                advance(1);
            }
            if (joe.getAvenue() < salidaY) {
                turnRight();
                while (joe.getAvenue() < salidaY) {
                    advance(1);
                }
                turnRight();
            }
            joe.putThing();
            if (joe.getDirection() == Direction.NORTH) {
                atras();
                while (joe.getStreet() < 11) {
                    advance(1);
                }
            } else if (joe.getDirection() == Direction.SOUTH) {
                turnRight();
                while (joe.getAvenue() > 7) {
                    advance(1);
                }
                joe.turnLeft();
                while (joe.getStreet() < 11) {
                    advance(1);
                }
            }
            advance(3);
            turnRight();
            advance(6);
            turnRight();
        }
    }
    
    public void posicionFinal(){
        atras();
        while (joe.getAvenue() > 1) {            
            advance(1);
        }
        joe.turnLeft();
        while (joe.getStreet() < 14) {            
            advance(1);
        }
        joe.turnLeft();
        while (joe.getAvenue() < 8) {            
            advance(1);
        }
        joe.turnLeft();
        while (joe.getStreet() > 11) {            
            advance(1);
        }
    }
}