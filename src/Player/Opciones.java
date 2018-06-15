/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Opciones {
    
    

    Scanner leer = new Scanner(System.in);
    

    public int OpcionesJugador() {
        int opc;
        System.out.println("*************************************************");
        System.out.println("***********************Elecciones**************************");
        System.out.println("");
        System.out.println("1. Crear edificio");
        System.out.println("2. Mejorar centro de mando");
        System.out.println("3. Mandar al taller un vehiculo");
        System.out.println("4. Entrenar tu ejercito");
        System.out.println("5. Mostrar recursos disponibles");
        System.out.println("6. Recolectar piedra");
        System.out.println("7. Recolectar madera");
        System.out.println("8. Recolectar carne");
        System.out.println("9. Edificios ya disponibles");
        System.out.println("10. Volver");
        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        
        opc = leer.nextInt();
        leer.nextLine();
        return opc;
    }

    public int OpcionesEdificios() {
        int opc;
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        System.out.println("Que edificio le gustaria construir?");
        System.out.println("1-Cuartel(crea tropas)");
        System.out.println("2-Taller(crea vehiculos)");
        System.out.println("3-Extractor Recurso1");
        System.out.println("4-Extractor Recurso2");
        System.out.println("5-Extractor Recurso3");
        System.out.println("6-Salir");
        opc = leer.nextInt();
        leer.nextLine();
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        return opc;
    }

    public int OpcionesTropas() {
        int opc;
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        System.out.println("Que Tropa le gustaria entrenar?");
        System.out.println("1-Especialista");
        System.out.println("2-Escuadron");
        System.out.println("3-Informacion de las tropas");
        System.out.println("4-Salir");
        opc = leer.nextInt();
        leer.nextLine();
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        return opc;
    }

    public int OpcionesVehiculos() {
        int opc;
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        System.out.println("Que vehiculo le gustaria entrenar?");
        System.out.println("1-Barco");
        System.out.println("2-Carro");
        System.out.println("3-Helioptero");
        System.out.println("4-Informacion vehiculos");
        System.out.println("5- Salir");
        opc = leer.nextInt();
        leer.nextLine();
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        return opc;
    }

    public int OpcionInicio() {
        int opc;
        System.out.println("************************Bienvenido A*************************");
        System.out.println("********************RicardoVilledaWorlds*****************************");
        System.out.println("Que mundo de anime le gustaria escoger?");
        System.out.println("1-One piece");
        System.out.println("2-FullMetal Alquemist");
        System.out.println("3-HighSchool DxD");
        System.out.println("4- Salir");
        opc = leer.nextInt();
        leer.nextLine();
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        return opc;

    }

    public int OpcionesAtacarDefiende() {
        int opc;
        System.out.println("Que quieres hacer?");
        System.out.println("1. Atacar");
        System.out.println("2. Defender");
        System.out.println("3. Volver");
        opc = leer.nextInt();
        leer.nextLine();
        return opc;

    }

    public int OpcionesAtacar() {
        int opc;
        System.out.println("***********Atacar***************");
        System.out.println("1. Elegir soldado");
        System.out.println("2. Mandar vehiculo");
        System.out.println("3. Mostrar ejercito disponible");
        System.out.println("4. Mostrar transporte disponible");
        System.out.println("5. Salir");
        opc = leer.nextInt();
        leer.nextLine();
        return opc;
    }

    public int OpcionesDefender() {
        int opc;
        System.out.println("***********Atacar***************");
        System.out.println("1. Defender");
        System.out.println("2. Mostrar ejercito disponible");

        System.out.println("3. Salir");
        opc = leer.nextInt();
        leer.nextLine();
        return opc;
    }

    public int opcionesTarget() {
        int opc;
        System.out.println("Que le gustaria atacar?");
        System.out.println("1. Centro de mando");
        System.out.println("2. Extractor madera");
        System.out.println("3. Extractor piedra");
        System.out.println("4. Extractor carme");
        System.out.println("5. Taller");
        System.out.println("6. Cuartel");
        opc = leer.nextInt();
        leer.nextLine();

        return opc;
    }

    public int mandarVehiculo() {
        int opc;
        System.out.println("Que le gustaria enviar al lado del oponente?");
        System.out.println("1. Barco");
        System.out.println("2. Carro");
        System.out.println("3. Helicoptero");
        System.out.println("4. salir");
        opc = leer.nextInt();
        leer.nextLine();

        return opc;

    }

}
