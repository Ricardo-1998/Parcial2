/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcciones.CentroComando;

/**
 *
 * @author Ricardo
 */
public class EdificioCentroComando implements CentroComando{

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getTotRecurso1() {
        return TotRecurso1;
    }

    @Override
    public int getTotRecurso2() {
        return TotRecurso2;
    }

    @Override
    public int getTotRecurso3() {
        return TotRecurso3;
    }

    @Override
    public int getCantidadRecurso1() {
        return cantidadRecurso1;
    }

    @Override
    public int getCantidadRecurso2() {
        return cantidadRecurso2;
    }

   
    @Override
    public int getCantidadRecurso3() {
        return cantidadRecurso3;
    }
    
    @Override
    public int getNivel() {
        return nivel;
    }
    int vida = 300, TotRecurso1 = 10000, TotRecurso2 = 5000, TotRecurso3 = 3000;
    int cantidadRecurso1 =1000,cantidadRecurso2 = 500,cantidadRecurso3 = 400;
    int nivel=0;
    

    
}
