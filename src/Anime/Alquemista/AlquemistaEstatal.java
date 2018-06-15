/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anime.Alquemista;



/**
 *
 * @author Ricardo
 */
public class AlquemistaEstatal implements Alquemista {

    int creacion1 = 2, creacion2 = 3, creacion3 = 4, costo1 = 3, costo2 = 5, costo3 = 7;

    @Override
    public int getCreacion1() {
        return creacion1;
    }

    @Override
    public int getCreacion2() {
        return creacion2;
    }

    @Override
    public int getCreacion3() {
        return creacion3;
    }

    @Override
    public int getCosto1() {
        return costo1;
    }

    @Override
    public int getCosto2() {
        return costo2;
    }

    @Override
    public int getCosto3() {
        return costo3;
    }

    

}
