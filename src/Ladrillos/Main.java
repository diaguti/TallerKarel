/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ladrillos;

/**
 *
 * @author FAMILIA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ladrillos ladrillos = new Ladrillos();
        while (ladrillos.hayLadrillos == true) {
            ladrillos.transportar();
            ladrillos.poner();
        }
        ladrillos.posicionFinal();

    }

}
