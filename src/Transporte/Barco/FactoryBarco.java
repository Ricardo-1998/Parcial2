/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte.Barco;

import Transporte.Carro.Carro;
import Transporte.Helicoptero.Helicoptero;
import Transporte.Transporte;

/**
 *
 * @author Ricardo
 */
public class FactoryBarco implements Transporte{
    @Override
    public Barco getBarco() {
        return new BarcoTerminado();
    }

    @Override
    public Carro getCarro() {
        return null;
    }

    @Override
    public Helicoptero getHelicoptero() {
        return null;
    }
}
