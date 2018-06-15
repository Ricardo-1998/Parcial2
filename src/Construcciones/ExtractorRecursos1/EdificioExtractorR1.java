/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcciones.ExtractorRecursos1;

/**
 *
 * @author Ricardo
 */
public class EdificioExtractorR1 implements ExtractorRecurso1{
    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getProduccion() {
        return produccion;
    }

    @Override
    public int getTiempo() {
        return tiempo;
    }
    
    @Override
    public int getCostoR1() {
        return costoR1;
    }

    
    
    @Override
    public void Mensaje(){
        System.out.println("Se creo recolector de piedra");
        System.out.println("Vida:" + vida);
        System.out.println("Produce por turno: " + produccion );
    }
    int vida = 150, produccion = 200, tiempo = 2, costoR1 = 300;

    
}
