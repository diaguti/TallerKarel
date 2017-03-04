/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Letras;

import becker.robots.City;

/**
 *
 * @author FAMILIA
 */
public class Main {

    public static void main(String[] args) {
        City mapa = new City(10, 20);
        Letras joe = new Letras(mapa, 5,1);
        Letras max = new Letras(mapa,5,5);
        Letras pedro = new Letras(mapa,5,9);
        Letras daniela = new Letras(mapa,5,13);
        Letras yo = new Letras(mapa,5,17);
        joe.letraH();
        max.letraE();
        pedro.letraL();
        daniela.letraL();
        yo.letraO();
    }    
}
