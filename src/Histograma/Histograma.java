/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Histograma;
import becker.robots.*;
import java.util.Scanner;

/**
 *
 * @author FAMILIA
 */
public class Histograma {
    private City unal;
    private Robot joe;
    private Thing bolita;
    Scanner sc = new Scanner(System.in);
    
    public Histograma(int a, int b, int c, int d){
        this.unal = new City(6, 6);
        this.joe = new Robot(unal, 0, 1, Direction.SOUTH);
//        Thing[] histograma = new Thing[4];        
        for (int j = 0; j < a; j++) {
            this.bolita = new Thing(unal, 1, 1);
        }
        for (int j = 0; j < b; j++) {
            this.bolita = new Thing(unal, 2, 1);
        }
        for (int j = 0; j < c; j++) {
            this.bolita = new Thing(unal, 3, 1);
        }
        for (int j = 0; j < d; j++) {
            this.bolita = new Thing(unal, 4, 1);
        }
    unal.showThingCounts(true);
    }
    
    public void advance(int avanz){
        for (int i = 0; i < avanz; i++) {
            joe.move();
        }
    }
    
}
