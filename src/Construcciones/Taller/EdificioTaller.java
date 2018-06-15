/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcciones.Taller;

/**
 *
 * @author Ricardo
 */
public class EdificioTaller implements Taller{

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getCantMax() {
        return cantMax;
    }

    @Override
    public int getTiempo() {
        return Tiempo;
    }

    @Override
    public int getCostoR1() {
        return costoR1;
    }

    
    
    @Override
    public void Mensaje(){
        System.out.println("Se creo el cuartel con exito");
        System.out.println("Vida:" + vida);
        System.out.println("Tropas que puede almacenar " + cantMax);
        System.out.println("Fases en que estara lista para usar: " + Tiempo);
    
    
    }
    int vida = 250, cantMax = 4,Tiempo = 5, costoR1 = 1000;

}
