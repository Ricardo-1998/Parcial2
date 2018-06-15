/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercito;

import Ejercito.GrupoTropas.Escuadron;
import Ejercito.Individuales.Individuales;

/**
 *
 * @author Ricardo
 */
public interface EjercitoCuartel {
    Escuadron getGrupoTropas();
    Individuales getTropaInvidivual();
}
