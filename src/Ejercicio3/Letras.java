/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;
import becker.robots.*;
/**
 *
 * @author FAMILIA
 */
public class Letras {
    private Robot molde;

    private Thing punto;
    
    public Letras(City mapa, int x, int y){
        this.molde = new Robot(mapa, x, y, Direction.NORTH, 12);        
    }
    
    public void avanzar(int a){
        for (int i = 0; i < a; i++) {
            molde.move();
        }
    }
    
    public void turnRigth(){
        for (int i = 0; i < 3; i++) {
            molde.turnLeft();
        }      
    }
    
    public void atras(){
        molde.turnLeft();
        molde.turnLeft();
    }
    
    public void letraH(){
        for (int i = 0; i < 5; i++) {
            avanzar(1);
            molde.putThing();
            
        }
        atras();
        avanzar(2);
        molde.turnLeft();
        for (int i = 0; i < 2; i++) {
            avanzar(1);
            molde.putThing();
        }
        molde.turnLeft();
        avanzar(2);
        atras();
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
        atras();
        avanzar(2);
        molde.turnLeft();
        avanzar(2);
        molde.turnLeft();
        for (int i = 0; i < 2; i++) {
            avanzar(1);
            molde.putThing();
        }
        atras();
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
        atras();
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
        atras();
        avanzar(1);
    }
}
