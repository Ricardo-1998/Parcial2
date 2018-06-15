/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte.Barco;

/**
 *
 * @author Ricardo
 */
public class BarcoTerminado implements Barco{

    @Override
    public int getVelocidad() {
        return Velocidad;
    }

    @Override
    public int getCapacidadMax() {
        return capacidadMax;
    }

    @Override
    public int getTiempo() {
        return tiempo;
    }

   
    
    @Override
    public int getCostoR2() {
        return costoR2;
    }
    
    @Override
    public int getVida() {
        return vida;
    }
    @Override
    public int getAtaque() {
        return ataque;
    }
    int vida= 500, Velocidad = 2, capacidadMax = 10,tiempo = 10,costoR2 = 1000, ataque=300;
}
