/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Futbol;
import becker.robots.*;
/**
 *
 * @author FAMILIA
 */
public class Futbol {
    private Robot joe;
    private City unal;
    private Thing balon;
    
    public Futbol(){
        this.unal = new City(10, 10);
        this.balon = new Thing(unal, 9, 9);
        this.joe = new Robot(unal, 9, 9, Direction.WEST);
    }
    public void advance(int i){
        joe.pickThing();
        for (int j = 0; j < i; j++) {
            this.joe.move();
        }
        joe.putThing();
    }
    
    public void advanceLeft(){
        this.joe.turnLeft();
    }
    
    public void advanceRight(){
        this.joe.turnLeft();
        this.joe.turnLeft();
        this.joe.turnLeft();
    }
}