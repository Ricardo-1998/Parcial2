/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte.Helicoptero;

import Transporte.Barco.Barco;
import Transporte.Carro.Carro;
import Transporte.Transporte;

/**
 *
 * @author Ricardo
 */
public class FactoryHelicoptero implements Transporte{

    @Override
    public Barco getBarco() {
        return null;
    }

    @Override
    public Carro getCarro() {
        return null;
    }

    @Override
    public Helicoptero getHelicoptero() {
        return new HelicopteroTerminado();
    }
    
}
