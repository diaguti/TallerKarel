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
//    private City unal;
    private Robot molde;
//    private Robot joe;
//    private Robot sam;
//    private Robot tex;
//    private Robot mac;
//    private Robot tom;
    private Thing punto;
    
    public Letras(City mapa, int x, int y){
//        this.unal = new City(10, 20);
        this.molde = new Robot(mapa, x, y, Direction.NORTH, 12);
//        Robot[] robots = new Robot[5];
//        robots[1] = new Robot(unal, 5, 1, Direction.NORTH, 12);
//        this.sam = new Robot(unal, 9, 10, Direction.NORTH, 12);        
    }
    
    public Letras(){
        
    }
    
    public void avanzar(int a){
        for (int i = 0; i < a; i++) {
            molde.move();
        }
    }
    
    public void turnRigth(){
        for (int i = 0; i < 3; i++) {
            molde.turnLeft();
//            joe.
        }      
    }
    
    public void letraH(){
        for (int i = 0; i < 5; i++) {
            avanzar(1);
            molde.putThing();
            
        }
        molde.turnLeft();
        molde.turnLeft();
        avanzar(2);
        molde.turnLeft();
        for (int i = 0; i < 2; i++) {
            avanzar(1);
            molde.putThing();
        }
        molde.turnLeft();
        avanzar(2);
        molde.turnLeft();
        molde.turnLeft();
        for (int i = 0; i < 5; i++) {
            molde.putThing();
            avanzar(1);            
        }
    }
    
    public void letraE(){
        for (int i = 0; i < 5; i++) {
            avanzar(1);
            molde.putThing();
        }
        turnRigth();
        for (int i = 0; i < 2; i++) {
            avanzar(1);
            molde.putThing();
        }
        molde.turnLeft();
        molde.turnLeft();
        avanzar(2);
        molde.turnLeft();
        avanzar(2);
        molde.turnLeft();
        for (int i = 0; i < 2; i++) {
            avanzar(1);
            molde.putThing();
        }
        molde.turnLeft();
        molde.turnLeft();
        avanzar(2);
        molde.turnLeft();
        avanzar(2);
        molde.turnLeft();
        for (int i = 0; i < 2; i++) {
            avanzar(1);
            molde.putThing();            
        }
        turnRigth();
        avanzar(1);
    }
    
    public void letraL(){
        for (int i = 0; i < 5; i++) {
            avanzar(1);
            molde.putThing();
        }
        molde.turnLeft();
        molde.turnLeft();
        avanzar(4);
        molde.turnLeft();
        for (int i = 0; i < 2; i++) {
            avanzar(1);
            molde.putThing();            
        }
        turnRigth();
        avanzar(1);
    }
    
    public void letraO(){
        avanzar(1);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                avanzar(1);
                molde.putThing();
            }
            turnRigth();
            for (int j = 0; j < 2; j++) {
                avanzar(1);
                molde.putThing();
            }
            turnRigth();
        }
        turnRigth();
        turnRigth();
        avanzar(1);
    }
}
