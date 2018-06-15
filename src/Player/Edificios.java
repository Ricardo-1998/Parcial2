/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import Construcciones.AbstractFactoryConstrucciones;
import Construcciones.CentroComando.CentroComando;
import Construcciones.Cuartel.Cuartel;
import Construcciones.ExtractorRecurso3.ExtractorRecurso3;
import Construcciones.ExtractorRecursos1.ExtractorRecurso1;
import Construcciones.ExtractorRecursos2.ExtractorRecurso2;
import Construcciones.FactoryProducerConstrucciones;
import Construcciones.Taller.Taller;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Edificios {

    Opciones opciones = new Opciones();
    AbstractFactoryConstrucciones edificio;

    public void setOpciones(Opciones opciones) {
        this.opciones = opciones;
    }

    public void setEdificio(AbstractFactoryConstrucciones edificio) {
        this.edificio = edificio;
    }

    public void setNivelCM(int nivelCM) {
        this.nivelCM = nivelCM;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setCostoRecurso1(int costoRecurso1) {
        this.costoRecurso1 = costoRecurso1;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    public void setMaxRecurso1(int MaxRecurso1) {
        this.MaxRecurso1 = MaxRecurso1;
    }

    public void setMaxRecurso2(int MaxRecurso2) {
        this.MaxRecurso2 = MaxRecurso2;
    }

    public void setMaxRecurso3(int MaxRecurso3) {
        this.MaxRecurso3 = MaxRecurso3;
    }

    public void setCantidadRecurso1(int cantidadRecurso1) {
        this.cantidadRecurso1 = cantidadRecurso1;
    }

    public void setCantidadRecurso2(int cantidadRecurso2) {
        this.cantidadRecurso2 = cantidadRecurso2;
    }

    public void setCantidadRecurso3(int cantidadRecurso3) {
        this.cantidadRecurso3 = cantidadRecurso3;
    }

    public void setCostoRecurso2(int costoRecurso2) {
        this.costoRecurso2 = costoRecurso2;
    }

    public void setCostoRecurso3(int costoRecurso3) {
        this.costoRecurso3 = costoRecurso3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSoldado(ArrayList<Ejercito> soldado) {
        this.soldado = soldado;
    }

    public void setVehiculo(ArrayList<Vehiculos> vehiculo) {
        this.vehiculo = vehiculo;
    }
    private int nivelCM = 0, vida, velocidad, costoRecurso1, especialidad, MaxRecurso1, MaxRecurso2, MaxRecurso3;

    public int getNivelCM() {
        return nivelCM;
    }
    private int cantidadRecurso1, cantidadRecurso2, cantidadRecurso3, costoRecurso2, costoRecurso3;
    private String nombre;
    ArrayList<Ejercito> soldado = new ArrayList<>();
    ArrayList<Vehiculos> vehiculo = new ArrayList<>();

    public AbstractFactoryConstrucciones getEdificio() {
        return edificio;
    }

    public int getVida() {
        return vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getCostoRecurso1() {
        return costoRecurso1;
    }

    public int getCostoRecurso2() {
        return costoRecurso2;
    }

    public int getCostoRecurso3() {
        return costoRecurso3;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public int getMaxRecurso1() {
        return MaxRecurso1;
    }

    public int getMaxRecurso2() {
        return MaxRecurso2;
    }

    public int getMaxRecurso3() {
        return MaxRecurso3;
    }

    public int getCantidadRecurso1() {
        return cantidadRecurso1;
    }

    public int getCantidadRecurso2() {
        return cantidadRecurso2;
    }

    public int getCantidadRecurso3() {
        return cantidadRecurso3;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Ejercito> getSoldado() {
        return soldado;
    }

    public ArrayList<Vehiculos> getVehiculo() {
        return vehiculo;
    }

    public Edificios() {
    }

    public int CrearEdiicio(int cantR1, int costo) {
        String opc;
        Scanner leer = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            switch (opciones.OpcionesEdificios()) {
                case 1:

                    edificio = FactoryProducerConstrucciones.getFactory("Cuartel");
                    Cuartel ct = edificio.GetCuartel();
                    this.costoRecurso1 = ct.getCostoR1();
                    costo= this.costoRecurso1;
                    
                    if (this.costoRecurso1 <= cantR1 ) {
                        this.nombre = "Cuartel";
                        this.velocidad = ct.getTiempo();
                        this.vida = ct.getVida();
                        this.especialidad = ct.getTipo();
                        ct.Mensaje();
                        return costo;
                    } else {
                        System.out.println("No te alcanzan los recursos:c");
                        System.out.println("Tienes " + cantidadRecurso1 + "de madera");
                        System.out.println("Necesitas " + this.costoRecurso1);
                        

                    }
                    break;

                case 2:
                    edificio = FactoryProducerConstrucciones.getFactory("Taller");
                    Taller cv = edificio.GetTaller();
                    this.costoRecurso1 = cv.getCostoR1();
                    costo = this.costoRecurso1;
                    
                    
                    if (this.costoRecurso1 <= cantR1) {
                        this.nombre = "Taller";
                        this.velocidad = cv.getTiempo();
                        this.vida = cv.getVida();
                        this.especialidad = cv.getCantMax();
                        cv.Mensaje();
                        return costo;
                    } else {
                        System.out.println("No te alcanzan los recursos:c");
                        System.out.println("Tienes " + cantidadRecurso1 + "de madera");
                        System.out.println("Necesitas " + this.costoRecurso1);
                        
                        

                    }
                    break;
                case 3:
                    edificio = FactoryProducerConstrucciones.getFactory("Recurso1");
                    ExtractorRecurso1 ex1 = edificio.GetExtractorRecursos1();
                    this.costoRecurso1 = ex1.getCostoR1();
                    costo = this.costoRecurso1;
                    
                    if (this.costoRecurso1 <= cantR1) {
                        this.nombre = "Extractor recurso 1";
                        this.velocidad = ex1.getTiempo();
                        this.vida = ex1.getVida();

                        ex1.Mensaje();
                        return costo;
                    } else {
                        System.out.println("No te alcanzan los recursos:c");
                        System.out.println("Tienes " + cantidadRecurso1 + "de madera");
                        System.out.println("Necesitas " + this.costoRecurso1);
                        
                        

                    }
                    break;
                case 4:
                    edificio = FactoryProducerConstrucciones.getFactory("Recurso2");
                    ExtractorRecurso2 ex2 = edificio.GetExtractorRecursos2();
                    this.costoRecurso1 = ex2.getCostoR1();
                   
                    costo = this.costoRecurso1;
                    if (this.costoRecurso1 <= cantR1) {
                        this.nombre = "Extractor recurso 2";
                        this.velocidad = ex2.getTiempo();
                        this.vida = ex2.getVida();

                        ex2.Mensaje();
                        return costo;
                    } else {
                        System.out.println("No te alcanzan los recursos:c");
                        System.out.println("Tienes " + cantidadRecurso1 + "de madera");
                        System.out.println("Necesitas " + this.costoRecurso1);
                        

                    }
                    break;
                case 5:
                    edificio = FactoryProducerConstrucciones.getFactory("Recurso3");
                    ExtractorRecurso3 ex3 = edificio.GetExtractorRecursos3();
                    this.costoRecurso1 = ex3.getCostoR1();
                    costo = this.costoRecurso1;
                    
                    if (this.costoRecurso1 <= cantR1) {
                        this.nombre = "Extractor recurso 3";
                        this.velocidad = ex3.getTiempo();
                        this.vida = ex3.getVida();

                        ex3.Mensaje();
                        return costo;
                    } else {
                        System.out.println("No te alcanzan los recursos:c");
                        System.out.println("Tienes " + cantidadRecurso1 + "de madera");
                        System.out.println("Necesitas " + this.costoRecurso1);
                        

                    }
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Esa opcion no existe :c");
                    break;

            }

        }
        return 0;
        

    }

    public void CentroMando() {
        edificio = FactoryProducerConstrucciones.getFactory("Centro de comando");
        CentroComando cm = edificio.GetCentroComando();
        this.nombre = "Centro de Mando";
        this.MaxRecurso1 = cm.getTotRecurso1();
        this.MaxRecurso2 = cm.getTotRecurso2();
        this.MaxRecurso3 = cm.getTotRecurso3();
        this.nivelCM = cm.getNivel();
        this.vida = cm.getVida();
        this.cantidadRecurso1 = cm.getCantidadRecurso1();
        this.cantidadRecurso2 = cm.getCantidadRecurso2();
        this.cantidadRecurso3 = cm.getCantidadRecurso3();

    }

    public void MejorarCentroMando() {
        int costoR, costo1, costo2, costo3;
        if (this.nivelCM <= 3) {
            this.nivelCM++;
            switch (this.nivelCM) {
                case 1:
                    costo1 = (int) (this.MaxRecurso1 * 1.10);
                    costo2 = (int) (this.MaxRecurso2 * 1.10);
                    costo3 = (int) (this.MaxRecurso3 * 1.10);
                    costoR = (int) (0.25 * (costo1 + costo2 + costo3)) / 3;
                    if (AlcanzanRecursos(costoR)) {
                        this.MaxRecurso1 = (int) (this.MaxRecurso1 * 1.10);
                        this.MaxRecurso2 = (int) (this.MaxRecurso2 * 1.10);
                        this.MaxRecurso3 = (int) (this.MaxRecurso3 * 1.10);
                        System.out.println("Tu centro de mando ahora es nivel 1");
                        System.out.println("Capacidad nueva piedra: " + this.MaxRecurso1);
                        System.out.println("Capacidad nueva madera: " + this.MaxRecurso2);
                        System.out.println("Capacidad nueva carne: " + this.MaxRecurso3);

                    } else {
                        this.nivelCM--;
                        System.out.println("No tienes Recursos suficientes");
                    }
                    break;
                case 2:
                    costo1 = (int) (this.MaxRecurso1 * 1.30);
                    costo2 = (int) (this.MaxRecurso2 * 1.30);
                    costo3 = (int) (this.MaxRecurso3 * 1.30);
                    costoR = (int) (0.25 * (costo1 + costo2 + costo3)) / 3;
                    if (AlcanzanRecursos(costoR)) {
                        this.MaxRecurso1 = (int) (this.MaxRecurso1 * 1.30);
                        this.MaxRecurso2 = (int) (this.MaxRecurso2 * 1.30);
                        this.MaxRecurso3 = (int) (this.MaxRecurso3 * 1.30);
                        System.out.println("Tu centro de mando ahora es nivel 2");
                        System.out.println("Capacidad nueva piedra: " + this.MaxRecurso1);
                        System.out.println("Capacidad nueva madera: " + this.MaxRecurso2);
                        System.out.println("Capacidad nueva carne: " + this.MaxRecurso3);

                    } else {
                        this.nivelCM--;
                        System.out.println("No tienes Recursos suficientes");
                    }
                    break;

                case 3:
                    costo1 = (int) (this.MaxRecurso1 * 1.50);
                    costo2 = (int) (this.MaxRecurso2 * 1.50);
                    costo3 = (int) (this.MaxRecurso3 * 1.50);
                    costoR = (int) (0.25 * (costo1 + costo2 + costo3)) / 3;
                    if (AlcanzanRecursos(costoR)) {
                        this.MaxRecurso1 = (int) (this.MaxRecurso1 * 1.50);
                        this.MaxRecurso2 = (int) (this.MaxRecurso2 * 1.50);
                        this.MaxRecurso3 = (int) (this.MaxRecurso3 * 1.50);

                        System.out.println("Tu centro de mando ahora es nivel 3");
                        System.out.println("Capacidad nueva piedra: " + this.MaxRecurso1);
                        System.out.println("Capacidad nueva madera: " + this.MaxRecurso2);
                        System.out.println("Capacidad nueva carne: " + this.MaxRecurso3);

                    } else {
                        this.nivelCM--;
                        System.out.println("No tienes Recursos suficientes");
                    }
                    break;
                default:
                    System.out.println("Ya tienes maximo nivel el centro de mando");

            }
        }

    }

    public boolean AlcanzanRecursos(int costoR) {
        if (this.cantidadRecurso1 < costoR && this.cantidadRecurso2 < costoR && this.cantidadRecurso3 < costoR) {
            return true;
        }
        return false;
    }

    public int ReclutarTropa(int cantR3) {
        int costo=0;
        Ejercito n1 = new Ejercito();
        n1.Ejercito(cantR3);
        if(n1.getCostoR3() <= cantR3){
            costo = n1.getCostoR3();
            soldado.add(n1);
            return costo;
        }
        else{
            System.out.println("No te alcanza los materiales.");
            System.out.println("Costo de adera: " + n1.getCostoR3());
            System.out.println("Te hace falta: " + (n1.getCostoR3()-cantR3));
            
        }
        return costo;
    }

    public int MontarVehiculo(int cantR2, int costo) {
        Vehiculos n = new Vehiculos();
        n.CrearTransporte();
        if(n.getCostoR2() <= cantR2){
            
            costo=n.getCostoR2();
            vehiculo.add(n);
            return costo;
        }
        else{
            System.out.println("No te alcanza los materiales.");
            System.out.println("Costo de piedra: " + n.getCostoR2());
            System.out.println("Te hace falta: " + (n.getCostoR2()-cantR2));
        }
        return costo;
    }
}
