/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercito;

import Ejercito.GrupoTropas.FactoryTG;
import Ejercito.Individuales.FactoryTI;

/**
 *
 * @author Ricardo
 */
public class ProductorTropas {
    public static EjercitoCuartel getFactory(String Type){
        switch(Type){
            case "Escuadron":
                return new FactoryTG();
            case "Especialista":
                return new FactoryTI();
            
        }
        return null;
    }
}
