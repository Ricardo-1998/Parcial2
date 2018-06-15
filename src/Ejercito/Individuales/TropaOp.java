/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercito.Individuales;

/**
 *
 * @author Ricardo
 */
public class TropaOp implements Individuales{
    int life = 300, DañoTropas = 150, DañoEdificios = 120, speed = 4, time = 3, costoR3=250;

    @Override
    public int getcostoR3(){
        return costoR3;
    }
    @Override
    public int getLife() {
        return life;
    }

    @Override
    public int getDañoTropas() {
        return DañoTropas;
    }

    @Override
    public int getDañoEdificios() {
        return DañoEdificios;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getTime() {
        return time;
    }

}
