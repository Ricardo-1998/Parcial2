/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercito.GrupoTropas;

import Ejercito.EjercitoCuartel;
import Ejercito.Individuales.Individuales;

/**
 *
 * @author Ricardo
 */
public class FactoryTG implements EjercitoCuartel{

    @Override
    public Escuadron getGrupoTropas() {
        return new TropaEscuadron();
    }

    @Override
    public Individuales getTropaInvidivual() {
        return null;
    }
    
}
