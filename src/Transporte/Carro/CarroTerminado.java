/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte.Carro;

/**
 *
 * @author Ricardo
 */
public class CarroTerminado implements Carro{

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
    int vida = 100,  Velocidad = 1, capacidadMax = 5,tiempo = 5, costoR2 = 500;
}
