/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcciones.ExtractorRecurso3;

import Construcciones.ExtractorRecursos1.*;
import Construcciones.AbstractFactoryConstrucciones;
import Construcciones.CentroComando.CentroComando;
import Construcciones.Cuartel.Cuartel;
import Construcciones.ExtractorRecursos2.ExtractorRecurso2;
import Construcciones.Taller.Taller;

/**
 *
 * @author Ricardo
 */
public class FactoryExtractorRecurso3 implements AbstractFactoryConstrucciones{

    @Override
    public CentroComando GetCentroComando() {
        return null;
    }

    @Override
    public ExtractorRecurso1 GetExtractorRecursos1() {
        return null;
    }

    @Override
    public ExtractorRecurso2 GetExtractorRecursos2() {
        return null;
    }

    @Override
    public ExtractorRecurso3 GetExtractorRecursos3() {
        return new EdificioExtractorR3();
    }

    @Override
    public Cuartel GetCuartel() {
        return null;
    }

    @Override
    public Taller GetTaller() {
        return null;
    }

    
}
