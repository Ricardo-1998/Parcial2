/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anime.OnePiece;

/**
 *
 * @author Ricardo
 */

/**1 = tropas
 * 2 = vehiculo
 * 3 = edificio
 */
public class Mugiwaras implements OnePiece{
    int creacion1 = 9,creacion2 = 6,creacion3 = 2,costo1 = 3,costo2 = 5,costo3 = 7;

    
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
