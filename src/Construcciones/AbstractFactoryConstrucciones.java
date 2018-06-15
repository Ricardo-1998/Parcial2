/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcciones;

import Construcciones.CentroComando.CentroComando;
import Construcciones.Cuartel.Cuartel;
import Construcciones.ExtractorRecurso3.ExtractorRecurso3;
import Construcciones.ExtractorRecursos1.ExtractorRecurso1;
import Construcciones.ExtractorRecursos2.ExtractorRecurso2;
import Construcciones.Taller.Taller;

/**
 *
 * @author Ricardo
 */
public interface AbstractFactoryConstrucciones {
    CentroComando GetCentroComando();
    Cuartel GetCuartel();
    Taller GetTaller();
    ExtractorRecurso1 GetExtractorRecursos1();
    ExtractorRecurso2 GetExtractorRecursos2();
    ExtractorRecurso3 GetExtractorRecursos3();
}
