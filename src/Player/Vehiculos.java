/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import Transporte.Barco.Barco;
import Transporte.Carro.Carro;
import Transporte.Helicoptero.Helicoptero;
import Transporte.ProductorTransporte;
import Transporte.Transporte;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Vehiculos {
    
    public Vehiculos(){}
    
    public Transporte getTrans() {
        return trans;
    }

    public void setTrans(Transporte trans) {
        this.trans = trans;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCostoR1() {
        return costoR1;
    }

    public void setCostoR1(int costoR1) {
        this.costoR1 = costoR1;
    }

    public int getCostoR2() {
        return costoR2;
    }

    public void setCostoR2(int costoR2) {
        this.costoR2 = costoR2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getListo() {
        return listo;
    }

    public void setListo(boolean listo) {
        this.listo = listo;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    
    Transporte trans;
    private int speed,cant,time,costoR1, costoR2,vida;
    private String name;
    private boolean listo;
    Opciones op = new Opciones();
    
    public int CrearTransporte(){
        int costo;
        String opc;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        
        while(flag){
            switch(op.OpcionesVehiculos()){
                
                case 1:
                    trans =  ProductorTransporte.getFactory("Barco");
                    Barco barco = trans.getBarco();
                    
                    this.costoR2 = barco.getCostoR2();
                    costo=this.costoR2;
                    this.name = "Barco";
                    this.cant = barco.getCapacidadMax();
                    this.time = barco.getTiempo();
                    this.speed = barco.getVelocidad();
                    this.vida = barco.getVida();
                    return costo;
                case 2:
                    trans =  ProductorTransporte.getFactory("Carro");
                    Carro carro = trans.getCarro();
                    
                    this.costoR2 = carro.getCostoR2();
                    costo=this.costoR2;
                    this.name = "Carro";
                    this.cant = carro.getCapacidadMax();
                    this.time = carro.getTiempo();
                    this.speed = carro.getVelocidad();
                    this.vida = carro.getVida();
                    
                    return costo;
                case 3:
                    trans =  ProductorTransporte.getFactory("Helicoptero");
                    Helicoptero heli = trans.getHelicoptero();
                    this.costoR1 = heli.getCostoR2();
                    
                    costo=this.costoR2;
                    this.name = "Heli";
                    this.cant = heli.getCapacidadMax();
                    this.time = heli.getTiempo();
                    this.speed = heli.getVelocidad();
                    this.vida = heli.getVida();
                    
                    return costo;
                case 4:
                    trans =  ProductorTransporte.getFactory("Barco");
                    Barco barco1 = trans.getBarco();
                    System.out.println("************BARCO******************");
                    System.out.println("Vida: " + barco1.getVida());
                    System.out.println("Capacidad maxima: " + barco1.getCapacidadMax());
                    
                    trans =  ProductorTransporte.getFactory("Carro");
                    Carro carro1 = trans.getCarro();
                    System.out.println("************CARRO******************");
                    System.out.println("Vida: " + carro1.getVida());
                    System.out.println("Capacidad maxima: " + carro1.getCapacidadMax());
                    
                    trans =  ProductorTransporte.getFactory("Helicoptero");
                    Helicoptero heli1 = trans.getHelicoptero();
                    System.out.println("************HELICOPTERO******************");
                    System.out.println("Vida: " + heli1.getVida());
                    System.out.println("Capacidad maxima: " + heli1.getCapacidadMax());
                default:
                    System.out.println("Opcion incorrecta");
            }   
        }
    
    return 0;
    }
}
