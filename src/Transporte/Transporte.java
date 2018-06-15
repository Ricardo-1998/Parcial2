/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

import Transporte.Barco.Barco;
import Transporte.Carro.Carro;
import Transporte.Helicoptero.Helicoptero;

/**
 *
 * @author Ricardo
 */
public interface Transporte {
    Barco getBarco();
    Carro getCarro();
    Helicoptero getHelicoptero();
}
