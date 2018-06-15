/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcciones.Taller;

import Construcciones.AbstractFactoryConstrucciones;
import Construcciones.CentroComando.CentroComando;
import Construcciones.Cuartel.Cuartel;
import Construcciones.ExtractorRecurso3.ExtractorRecurso3;
import Construcciones.ExtractorRecursos1.ExtractorRecurso1;
import Construcciones.ExtractorRecursos2.ExtractorRecurso2;

/**
 *
 * @author Ricardo
 */
public class FactoryTaller implements AbstractFactoryConstrucciones{

    @Override
    public CentroComando GetCentroComando() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cuartel GetCuartel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Taller GetTaller() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExtractorRecurso1 GetExtractorRecursos1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExtractorRecurso2 GetExtractorRecursos2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExtractorRecurso3 GetExtractorRecursos3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
