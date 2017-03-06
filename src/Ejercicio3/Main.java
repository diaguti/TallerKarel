/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import becker.robots.City;

/**
 *
 * @author FAMILIA
 */
public class Main {

    public static void main(String[] args) {
        City mapa = new City(6, 20);
        Letras joe = new Letras(mapa, 5,1);
        Letras max = new Letras(mapa,5,5);
        Letras tim = new Letras(mapa,5,9);
        Letras lena = new Letras(mapa,5,13);
        Letras tex = new Letras(mapa,5,17);
        joe.letraH();
        max.letraE();
        tim.letraL();
        lena.letraL();
        tex.letraO();
    }    
}
