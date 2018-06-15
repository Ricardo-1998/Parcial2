/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

import Transporte.Barco.FactoryBarco;
import Transporte.Carro.FactoryCarro;
import Transporte.Helicoptero.FactoryHelicoptero;


/**
 *
 * @author Ricardo
 */
public class ProductorTransporte {
    public static Transporte getFactory(String Type){
        switch(Type){
            case "Barco":
                return new FactoryBarco();
            case "Carro":
                return new FactoryCarro();
            case "Helicoptero":
                return new FactoryHelicoptero();
            
        }
        return null;
    }
}
