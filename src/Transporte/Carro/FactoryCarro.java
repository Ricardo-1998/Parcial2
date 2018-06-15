/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte.Carro;

import Transporte.Barco.Barco;
import Transporte.Helicoptero.Helicoptero;
import Transporte.Transporte;

/**
 *
 * @author Ricardo
 */
public class FactoryCarro implements Transporte{
    @Override
    public Barco getBarco() {
        return null;
    }

    @Override
    public Carro getCarro() {
        return new CarroTerminado();
    }

    @Override
    public Helicoptero getHelicoptero() {
        return null;
    }
}
