/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardovilledaworld;

import Player.Player;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Menu {

    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    Player player1 = new Player();
    Player player2 = new Player();

    public void IniciarJuego() {
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        int opc;
        while (flag) {
            System.out.println("*R**********************************");
            System.out.println("**I*********************************");
            System.out.println("***C********************************");
            System.out.println("****A*******************************");
            System.out.println("1. Iniciar el juego");
            System.out.println("2. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    juego();
                    break;

                case 2:
                    flag = false;
                    break;
            }
            leer.nextLine();
        }

    }

    public int decidirOrden() {
        escogerAnime();
        int a = 0;
        int start = (int) (Math.random() * 2) + 1;
        switch (start) {
            case 1:
                a = 1;
            case 2:
                a = 2;

        }
        return a;
    }

    public void escogerAnime() {

        System.out.println("**********************Jugador1**********************");
        player1.start();

        System.out.println(" ");
        System.out.println("**********************Jugador2**********************");
        player2.start();
    }

    public void juego() {
        boolean x = false;
        int fase = 0;

        switch (decidirOrden()) {
            case 1:
                while (!x) {
                    boolean turno1 = true, turno2 = true;
                    System.out.println("Fase: " + fase);
                    System.out.println("*******************************************");
                    System.out.println("**************Turno jugador 1**************");
                    System.out.println("*******************************************");

                    while (turno1) {
                        int i;
                        Scanner leer = new Scanner(System.in);

                        System.out.println("Eliga uno de los siguientes comandos: ");
                        System.out.println("1.Edificio");
                        System.out.println("2.Atacar o Defender");
                        System.out.println("3.Terminar turno");
                        i = leer.nextInt();
                        leer.nextLine();
                        switch (i) {
                            case 1:
                                player1.opcionesJugador();
                                break;
                            case 2:
                                player1.atacarDefender(player2.getEdificio().size());
                                break;
                            case 3:
                                turno1 = false;

                            default:
                                System.out.println("No existe esa opcion");
                                break;
                        }
                    }

                    System.out.println("Fase: " + fase);
                    System.out.println("*******************************************");
                    System.out.println("**************Turno jugador 2**************");
                    System.out.println("*******************************************");
                    while (turno2) {

                        Scanner leer = new Scanner(System.in);
                        System.out.println("");
                        System.out.println("----------------------------------------------------");
                        System.out.println("Eliga uno de los siguientes comandos: ");
                        System.out.println("1.Edificios");
                        System.out.println("2.Atacar / Defender");
                        System.out.println("3.Terminar turno");
                        System.out.println("----------------------------------------------------");
                        int A;

                        A = leer.nextInt();
                        switch (A) {
                            case 1:
                                player2.opcionesJugador();
                                break;
                            case 2:
                                player2.atacarDefender(player1.getEdificio().size());
                                break;
                            case 3:
                                turno2 = false;

                            default:
                                System.out.println("No existe esa opcion");
                                break;
                        }

                        System.out.println("Jugador 1");
                        player1.siguienteFase();
                        System.out.println("Jugador 2");
                        player2.siguienteFase();
                        player2.setTropasEnemigas(player1.getTusTropas());
                        player1.setTropasEnemigas(player2.getTusTropas());
                        player1.meAtacan();
                        player2.meAtacan();
                        if (player1.murio() == 1 && player2.murio() == 0) {
                            System.out.println("El jugador 1 ha ganado la partida");
                            System.out.println("<We are champions sonando al fondo>");
                            x = true;
                        }
                        if (player1.murio() == 0 && player2.murio() == 1) {
                            System.out.println("El jugador 2 ha ganado la partida");
                            System.out.println("<We are champions sonando al fondo>");
                            x = true;
                        }

                        if (player1.murio() == 0 && player2.murio() == 0) {
                            System.out.println("Empate");
                            x = true;
                        }
                        fase++;

                    }
                }

            case 2:
                while (!x) {
                    boolean turno1 = true, turno2 = true;
                    System.out.println("Fase: " + fase);
                    System.out.println("*******************************************");
                    System.out.println("**************Turno jugador 2**************");
                    System.out.println("*******************************************");

                    while (turno1) {
                        int i;
                        Scanner leer = new Scanner(System.in);

                        System.out.println("Eliga uno de los siguientes comandos: ");
                        System.out.println("1.Edificio");
                        System.out.println("2.Atacar o Defender");
                        System.out.println("3.Terminar turno");
                        i = leer.nextInt();
                        leer.nextLine();
                        switch (i) {
                            case 1:
                                player2.opcionesJugador();
                                break;
                            case 2:
                                player2.atacarDefender(player1.getEdificio().size());
                                break;
                            case 3:
                                turno1 = false;

                            default:
                                System.out.println("No existe esa opcion");
                                break;
                        }
                    }

                    System.out.println("Fase: " + fase);
                    System.out.println("*******************************************");
                    System.out.println("**************Turno jugador 1**************");
                    System.out.println("*******************************************");
                    while (turno2) {

                        Scanner leer = new Scanner(System.in);
                        System.out.println("");
                        System.out.println("----------------------------------------------------");
                        System.out.println("Eliga uno de los siguientes comandos: ");
                        System.out.println("1.Edificios");
                        System.out.println("2.Atacar / Defender");
                        System.out.println("3.Terminar turno");
                        System.out.println("----------------------------------------------------");
                        int A;

                        A = leer.nextInt();
                        switch (A) {
                            case 1:
                                player1.opcionesJugador();
                                break;
                            case 2:
                                player1.atacarDefender(player2.getEdificio().size());
                                break;
                            case 3:
                                turno2 = false;

                            default:
                                System.out.println("No existe esa opcion");
                                break;
                        }

                        System.out.println("Jugador 1");
                        player1.siguienteFase();
                        System.out.println("Jugador 2");
                        player2.siguienteFase();
                        player2.setTropasEnemigas(player1.getTusTropas());
                        player1.setTropasEnemigas(player2.getTusTropas());
                        player1.meAtacan();
                        player2.meAtacan();
                        if (player1.murio() == 1 && player2.murio() == 0) {
                            System.out.println("El jugador 1 ha ganado la partida");
                            System.out.println("<We are champions sonando al fondo>");
                            x = true;
                        }
                        if (player1.murio() == 0 && player2.murio() == 1) {
                            System.out.println("El jugador 2 ha ganado la partida");
                            System.out.println("<We are champions sonando al fondo>");
                            x = true;
                        }

                        if (player1.murio() == 0 && player2.murio() == 0) {
                            System.out.println("Empate");
                            x = true;
                        }
                        fase++;

                    }
                }

        }

    }

}
