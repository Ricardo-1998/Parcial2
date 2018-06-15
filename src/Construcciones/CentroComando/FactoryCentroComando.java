/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcciones.CentroComando;

import Construcciones.AbstractFactoryConstrucciones;
import Construcciones.Cuartel.Cuartel;
import Construcciones.ExtractorRecurso3.ExtractorRecurso3;
import Construcciones.ExtractorRecursos1.ExtractorRecurso1;
import Construcciones.ExtractorRecursos2.ExtractorRecurso2;
import Construcciones.Taller.Taller;

/**
 *
 * @author Ricardo
 */
public class FactoryCentroComando implements AbstractFactoryConstrucciones{

    @Override
    public CentroComando GetCentroComando() {
        return new EdificioCentroComando();
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
        return null;
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
