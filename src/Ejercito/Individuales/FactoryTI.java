/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercito.Individuales;

import Ejercito.EjercitoCuartel;
import Ejercito.GrupoTropas.Escuadron;

/**
 *
 * @author Ricardo
 */
public class FactoryTI implements EjercitoCuartel{

    @Override
    public Escuadron getGrupoTropas() {
        return null;
    }

    @Override
    public Individuales getTropaInvidivual() {
        return new TropaOp();
    }
    
}
