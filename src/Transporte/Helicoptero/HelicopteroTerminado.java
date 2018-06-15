/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte.Helicoptero;

/**
 *
 * @author Ricardo
 */
public class HelicopteroTerminado implements Helicoptero{

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
    
    int vida = 100, Velocidad = 2, capacidadMax = 6,tiempo = 7, costoR2 = 800;
}
