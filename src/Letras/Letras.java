/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Letras;
import becker.robots.*;
/**
 *
 * @author FAMILIA
 */
public class Letras {
    private City unal;
    private Robot joe;
    private Robot sam;
    private Robot tex;
    private Robot mac;
    private Robot tom;
    private Thing punto;
    
    public Letras(){
        this.unal = new City(10, 20);
        this.joe = new Robot(unal, 9, 1, Direction.NORTH, 12);
        this.sam = new Robot(unal, 9, 10, Direction.NORTH, 12);
        
    }
    
    public void avanzar(int a){
        for (int i = 0; i < a; i++) {
            joe.move();
        }
    }
    
    public void turnRigth(){
        for (int i = 0; i < 3; i++) {
            joe.turnLeft();
//            joe.
        }      
    }
    
    public void letraH(){
        for (int i = 0; i < 5; i++) {
            avanzar(1);
            joe.putThing();
        }
        joe.turnLeft();
        joe.turnLeft();
        avanzar(2);
        joe.turnLeft();
        for (int i = 0; i < 2; i++) {
            avanzar(1);
            joe.putThing();
        }
        joe.turnLeft();
        avanzar(2);
        joe.turnLeft();
        joe.turnLeft();
        for (int i = 0; i < 5; i++) {
            joe.putThing();
            avanzar(1);            
        }
    }
    
    public void letraE(){
        for (int i = 0; i < 5; i++) {
            avanzar(1);
            joe.putThing();
        }
        turnRigth();
        for (int i = 0; i < 2; i++) {
            avanzar(1);
            joe.putThing();
        }
        joe.turnLeft();
        joe.turnLeft();
        avanzar(2);
        joe.turnLeft();
        avanzar(2);
        joe.turnLeft();
        for (int i = 0; i < 2; i++) {
            avanzar(1);
            joe.putThing();
        }
        joe.turnLeft();
        joe.turnLeft();
        avanzar(2);
        joe.turnLeft();
        avanzar(2);
        joe.turnLeft();
        for (int i = 0; i < 2; i++) {
            joe.putThing();
            avanzar(1);
        }
    }
    
}
