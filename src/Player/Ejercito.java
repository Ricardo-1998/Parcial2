/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import Ejercito.EjercitoCuartel;
import Ejercito.GrupoTropas.Escuadron;
import Ejercito.Individuales.FactoryTI;
import Ejercito.Individuales.Individuales;
import Ejercito.ProductorTropas;

/**
 *
 * 
 * @author Ricardo
 */
public class Ejercito {

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    public int getAtaqueE() {
        return ataqueE;
    }

    public void setAtaqueE(int ataqueE) {
        this.ataqueE = ataqueE;
    }

    public int getAtaqueT() {
        return ataqueT;
    }

    public void setAtaqueT(int ataqueT) {
        this.ataqueT = ataqueT;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }

    public int getCostoR1() {
        return costoR1;
    }

    public void setCostoR1(int costoR1) {
        this.costoR1 = costoR1;
    }

    public int getCostoR3() {
        return costoR3;
    }

    public void setCostoR3(int costoR3) {
        this.costoR3 = costoR3;
    }

    public boolean isReady() {
        return Ready;
    }

    public void setReady(boolean Ready) {
        this.Ready = Ready;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTarget() {
        return Target;
    }

    public void setTarget(String Target) {
        this.Target = Target;
    }
    
    public EjercitoCuartel getTropa() {
        return tropa;
    }

    public void setTropa(EjercitoCuartel tropa) {
        this.tropa = tropa;
    }
    private int Vida,Speed,ataqueE,ataqueT,Time,costoR1,costoR3;
    private boolean Ready;
    private String Name,Target;

    
    EjercitoCuartel tropa;
    
    Opciones opciones = new Opciones();
    
    public int Ejercito(int cantR3){
        boolean flag = true;
        while(flag){
            switch(opciones.OpcionesTropas()){
                case 1:
                    tropa = ProductorTropas.getFactory("Especialista");
                    Individuales es = tropa.getTropaInvidivual();
                    this.ataqueE= es.getDañoEdificios();
                    this.ataqueT= es.getDañoTropas();
                    this.Vida= es.getLife();
                    this.Speed= es.getSpeed();
                    this.Time= es.getTime();
                    this.costoR3= es.getcostoR3();
                    this.Name = "Especialista";
                    System.out.println("************************************************");
                    System.out.println("Se ha creado: "+ this.Name);
                    System.out.println("Fases para que termine de crearse: "+ this.Speed);
                    return costoR3;
                    
                case 2:
                    tropa = ProductorTropas.getFactory("Escuadron");
                    Escuadron es1 = tropa.getGrupoTropas();
                    this.ataqueE= es1.getDañoEdificios();
                    this.ataqueT= es1.getDañoTropas();
                    this.Vida= es1.getLife();
                    this.Speed= es1.getSpeed();
                    this.Time= es1.getTime();
                    this.costoR3= es1.getCostoR3();
                    this.Name = "Escuadron";
                    System.out.println("************************************************");
                    System.out.println("Se ha creado: "+ this.Name);
                    System.out.println("Fases para que termine de crearse: "+ this.Speed);
                    return costoR3;
                case 3:
                    tropa = ProductorTropas.getFactory("Especialista");
                    Individuales es2 = tropa.getTropaInvidivual();
                    tropa = ProductorTropas.getFactory("Escuadron");
                    Escuadron es3 = tropa.getGrupoTropas();
                    System.out.println("***********Especialista**************");
                    System.out.println("Ataque edificios: " + es2.getDañoEdificios());
                    System.out.println("Ataque tropas: " + es2.getDañoTropas());
                    System.out.println("Vida: " + es2.getLife());
                    System.out.println("***********Escuadron**************");
                    System.out.println("Ataque edificios: " + es3.getDañoEdificios());
                    System.out.println("Ataque tropas: " + es3.getDañoTropas());
                    System.out.println("Vida: " + es3.getLife());
                    
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
        
        return 0;
        
    }
    
    
    
}
