/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcciones;

import Construcciones.CentroComando.FactoryCentroComando;
import Construcciones.Cuartel.FactoryCuartel;
import Construcciones.ExtractorRecurso3.FactoryExtractorRecurso3;
import Construcciones.ExtractorRecursos1.FactoryExtractorRecurso1;
import Construcciones.ExtractorRecursos2.FactoryExtractorRecurso2;
import Construcciones.Taller.FactoryTaller;

/**
 *
 * @author Ricardo
 */
public class FactoryProducerConstrucciones {
    public static AbstractFactoryConstrucciones getFactory(String Type){
        
        switch(Type){
            case "Centro de comando":
                return new FactoryCentroComando();
            case "Cuartel":
                return new FactoryCuartel();
            case "Taller":
                return new FactoryTaller();
            case "Recurso1":
                return new FactoryExtractorRecurso1();
            case "Recurso2":
                return new FactoryExtractorRecurso2();
            case "Recurso3":
                return new FactoryExtractorRecurso3();
        }
        return null;
    }
}
