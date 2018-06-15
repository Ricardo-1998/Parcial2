/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcciones.Cuartel;

/**
 *
 * @author Ricardo 
 */
public class EdificioCuartel implements Cuartel{

    @Override
    public int getVida() {
        return vida;
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
    public String getName(){
        return name;
    }
    int vida = 300, tipo = 5, tiempo =4, costoR1 = 400;
    String name = "Cuartel";

    
    

    @Override
    public int getTipo() {
        return tipo;
    }
    
    @Override
    public void Mensaje(){
        System.out.println("Se creo el cuartel con exito");
        System.out.println("Vida:" + vida);
        System.out.println("Tropas que puede almacenar " + tipo);
        System.out.println("Fases en que estara lista para usar: " + tiempo);
    
    }
}
