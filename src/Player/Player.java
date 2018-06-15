/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import Anime.Alquemista.Alquemista;
import Anime.Demonio.Demonio;
import Anime.Manga;
import Anime.MangaProducer;
import Anime.OnePiece.OnePiece;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Player {

    public Manga getAnime() {
        return anime;
    }

    public void setAnime(Manga anime) {
        this.anime = anime;
    }

    public int getCrearTropa() {
        return crearTropa;
    }

    public void setCrearTropa(int crearTropa) {
        this.crearTropa = crearTropa;
    }

    public int getCrearVehiculo() {
        return crearVehiculo;
    }

    public void setCrearVehiculo(int crearVehiculo) {
        this.crearVehiculo = crearVehiculo;
    }

    public int getCrearEdificio() {
        return crearEdificio;
    }

    public void setCrearEdificio(int crearEdificio) {
        this.crearEdificio = crearEdificio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCostoTropa() {
        return costoTropa;
    }

    public void setCostoTropa(int costoTropa) {
        this.costoTropa = costoTropa;
    }

    public int getCostoV() {
        return costoV;
    }

    public void setCostoV(int costoV) {
        this.costoV = costoV;
    }

    public int getCostoE() {
        return costoE;
    }

    public void setCostoE(int costoE) {
        this.costoE = costoE;
    }

    public ArrayList<Edificios> getEdificio() {
        return edificio;
    }

    public void setEdificio(ArrayList<Edificios> edificio) {
        this.edificio = edificio;
    }

    public ArrayList<Ejercito> getTropa() {
        return Tropa;
    }

    public void setTropa(ArrayList<Ejercito> Tropa) {
        this.Tropa = Tropa;
    }

    public ArrayList<Ejercito> getTropasAlAtaque() {
        return TropasAlAtaque;
    }

    public void setTropasAlAtaque(ArrayList<Ejercito> TropasAlAtaque) {
        this.TropasAlAtaque = TropasAlAtaque;
    }

    public ArrayList<Vehiculos> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<Vehiculos> vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ArrayList<Ejercito> getTusTropas() {
        return TusTropas;
    }

    public void setTusTropas(ArrayList<Ejercito> TusTropas) {
        this.TusTropas = TusTropas;
    }

    public ArrayList<Ejercito> getTropasEnemigas() {
        return TropasEnemigas;
    }

    public void setTropasEnemigas(ArrayList<Ejercito> TropasEnemigas) {
        this.TropasEnemigas = TropasEnemigas;
    }
    int level=0;
    Manga anime;
    private int crearTropa, crearVehiculo, crearEdificio, costo;
    private int costoTropa, costoV, costoE;
    private ArrayList<Edificios> edificio = new ArrayList<>();
    private ArrayList<Ejercito> Tropa = new ArrayList<>();
    private ArrayList<Ejercito> TropasAlAtaque = new ArrayList<>();
    private ArrayList<Vehiculos> vehiculo = new ArrayList<>();
    ArrayList<Ejercito> TusTropas = new ArrayList<>();
    private ArrayList<Ejercito> TropasEnemigas = new ArrayList<>();

    Opciones opc = new Opciones();
    

    public Player() {
        //Creamos el centro de mando
        Edificios n = new Edificios();
        n.CentroMando();
        edificio.add(n);
    }

    public void start() {
        boolean flag = true;
        int o;
        
                
        while (flag) {
            o=opc.OpcionInicio();
            switch (o) {
                case 1:
                    Manga manga = MangaProducer.getFactory("Onepiece");
                    OnePiece pirata = manga.GetPirata();
                    this.crearEdificio = pirata.getCreacion1();
                    this.crearTropa = pirata.getCreacion2();
                    this.crearVehiculo = pirata.getCreacion3();

                    this.costoE = pirata.getCosto1();
                    

                    this.costoV = pirata.getCosto2();

                    this.costoTropa =pirata.getCosto3();
                    flag = false;
                    break;
                case 2:
                    Manga manga2 = MangaProducer.getFactory("Alquemista");
                    Alquemista alquemista = manga2.GetAlquemista();
                    this.crearEdificio = alquemista.getCreacion1();
                    this.crearTropa = alquemista.getCreacion2();
                    this.crearVehiculo = alquemista.getCreacion3();

                    this.costoE = alquemista.getCosto1();
                    

                    this.costoV = alquemista.getCosto2();

                    this.costoTropa =alquemista.getCosto3();
                    flag = false;
                    break;
                case 3:
                    Manga manga3 = MangaProducer.getFactory("Demonio");
                    Demonio demon = manga3.GetDemon();
                    this.crearEdificio = demon.getCreacion1();
                    this.crearTropa = demon.getCreacion2();
                    this.crearVehiculo = demon.getCreacion3();

                    this.costoE = demon.getCosto1();
                    

                    this.costoV = demon.getCosto2();

                    this.costoTropa =demon.getCosto3();
                    flag = false;
                    break;

                default:
                    System.out.println("Ha ingresado un dato invalido");

            }

        }

    }

    public void atacarDefender(int c) {
        boolean flag = true;
        while (flag) {
            switch (opc.OpcionesAtacarDefiende()) {
                case 1:
                    Ataque(c);
                    break;
                case 2:
                    Defense();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Dato invalido");
            }
        }
    }

    public void Ataque(int c) {
        boolean flag = true;
        while (flag) {
            switch (opc.OpcionesAtacar()) {
                case 1:
                    ElegirEjercito(c);
                    break;
                case 2:
                    VehiculoGo(c);
                    break;
                case 3:
                    mostrarEjercito();
                    break;
                case 4:
                    mostrarVehiculos();
                    break;
                case 5:
                    flag = false;
                    break;
            }

        }
    }

    private void ElegirEjercito(int c) {
        Scanner leer = new Scanner(System.in);
        int opc1;
        boolean flag = true;
        while (flag) {
            System.out.println("¿Que le gustaria mandar?");
            System.out.println("1. Especialista");
            System.out.println("2. Escuadron");
            System.out.println("3. Salir");
            opc1 = leer.nextInt();
            switch (opc1) {
                case 1:
                    alAtaque("Especialista", c);
                    break;
                case 2:
                    alAtaque("Escuadron", c);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("ha ingresado un dato invalido");
                    break;
            }
            leer.nextLine();
        }
    }

    private void alAtaque(String name, int c) {
        for (int x = 0; x < Tropa.size(); x++) {
            if (Tropa.get(x).isReady()) {
                Tropa.get(x).setReady(false);
                Tropa.get(x).setTarget(target(c));
                System.out.println("La tropa va en camino");
                System.out.println("faltan " + Tropa.get(x).getTime() + " para llegar al destino");
                TropasAlAtaque.add(Tropa.get(x));
                Tropa.remove(x);

            }
        }
        System.out.println(name + " no disponible");

    }
    
    private String target(int c){
        boolean flag= true;
        while(flag){
            switch(opc.opcionesTarget()){
                case 1:
                    if(c!=0){
                        System.out.println("Solo puedes atacar al centro de mando estando solo");
                    }else{return "Centro de Mando";}
                    break;
                case 2:
                    return "Extractor recurso 2";
                    
                case 3:
                    return "Extractor recurso 1";
                    
                case 4:
                    return "Extractor recurso 3";
                    
                case 5:
                    return "Taller";
                    
                case 6:
                    return "Cuartel";
                    
            }
        
        }
        return "";
    }
    
    private void mostrarVehiculos() {
        if(vehiculo.isEmpty()){
            System.out.println("No tiene ningun vehiculo disponible");
        }else{
            for(int x = 0 ; x < vehiculo.size() ; x++){
            System.out.println("Disponible: " + vehiculo.get(x).getName());
            }
        }
    }
    
    private void mostrarEjercito() {
        if(Tropa.isEmpty()){
            System.out.println("No tiene ningun soldado entrenado");
        }else{
            for(int x = 0 ; x < Tropa.size() ; x++){
            System.out.println("Disponible: " + Tropa.get(x).getName());
            }
        }
    }
        
    private void sendVehiculo(int c, String name) {
        String target;
        for (int x = 0; x < vehiculo.size();x++){
            if(vehiculo.get(x).getListo() && vehiculo.get(x).getName().equals(name)){
                vehiculo.get(x).setListo(false);
                target = target(c);
                System.out.println("Ha mandado con exito al vehiculo");
                System.out.println("fases para que llegue: " + vehiculo.get(x).getTime());
                
            }
        }
        System.out.println("No hay vehiculo "+name+" disponible");
        
    }
    
    
    private void VehiculoGo(int c) {
        boolean flag = true;
        while(flag){
            switch(opc.mandarVehiculo()){
                case 1:
                    sendVehiculo(c,"Carro");
                    break;
                case 2:
                    sendVehiculo(c,"Barco");
                    break;
                case 3:
                    sendVehiculo(c,"Helicoptero");
                    break;
                case 4:
                    flag =  false;
                    break;
                default:
                    System.out.println("ha ingresado un dato invalido");
                    break;
            }
        }
    }
    
    
    public void Defense() {
        boolean flag = true;
        if(meAtacan()){
            while(flag){
                switch(opc.OpcionesDefender()){
                    case 1:
                        defenderse();
                        break;
                    case 2:
                        mostrarEjercito();
                        break;
                    case 3:
                        flag = false;
                        break;
                    default:
                        System.out.println("Esa opcion no existe");
                        break;
                }
            }
        }
        else{
            System.out.println("Por el momento estas en paz");
        }
    }

    public boolean meAtacan(){
        return !TropasEnemigas.isEmpty();
    }
    
    public void defenderse(){
        if(!Tropa.isEmpty()){
            for (int x = 0; x < Tropa.size();x++){
                if(Tropa.get(x).isReady()){
                    int ataque = Tropa.get(x).getAtaqueT();
                    if(defendiendoDeTropasEnemigas(ataque)){
                        System.out.println("Has atacado a las tropas enemigas con exito");
                    }
                    else{
                        System.out.println("Ya no quedan unidades enemigas");
                        x = Tropa.size();
                    }
                }
            }
            
        }
        else{
            System.out.println("No puedes defenderte sin tropas:c");
        }
    }

    public boolean defendiendoDeTropasEnemigas(int a){
        for(int x = 0 ; x < TropasEnemigas.size();x++){
            TropasEnemigas.get(x).setVida(TropasEnemigas.get(x).getVida() - a);
            if(TropasEnemigas.get(x).getVida() <= 0){
                TropasEnemigas.remove(x);
                System.out.println("Una tropa enemiga ha muerto");
            }
            return true;
        } 
        return false;
    }

    public void opcionesJugador(){
        boolean flag = true;
        while(flag){
            switch(opc.OpcionesJugador()){
                case 1:
                    Edificios edi = new Edificios();
                    costoE = edi.CrearEdiicio(edificio.get(0).getCantidadRecurso1(),this.costoE);
                    if(edi.getNombre() != null){
                        edi.setVelocidad(edi.getVelocidad());
                        System.out.println("El edificio tardara " + edi.getVelocidad() + " fases en crearse.");
                        edificio.get(0).setCantidadRecurso1(edificio.get(0).getCantidadRecurso1() - costoE);
                        
                        edificio.add(edi);
                    }
                    break;
                case 2:
                    
                    edificio.get(0).MejorarCentroMando();
                    this.level=edificio.get(0).getNivelCM();
                    
                    break;                    
                case 3:
                    int cont = 0;
                    boolean full = false;
                    for(int x = 0 ;x<edificio.size(); x++){
                        //Preguntamos si es el taller y si esta creado
                        if("Taller".equals(edificio.get(x).getNombre()) && edificio.get(x).getVelocidad() == 0){
                   
                            if(edificio.get(x).getEspecialidad() > 0){
                                full = false;
                                //crear vehivulo
                                costoE = edificio.get(x).MontarVehiculo(edificio.get(0).getCantidadRecurso2(),this.costoE);
                                if(costo != 0){    
                                    edificio.get(x).setEspecialidad(edificio.get(x).getEspecialidad() - 1);
                                }
                                edificio.get(0).setCantidadRecurso1(edificio.get(0).getCantidadRecurso1() - costoE);
                                
                                
                            }
                            else{
                                full = true;
                            }
                            cont++;
                        }
                    }
                    if(cont == 0){
                        System.out.println("No tiene edificios");
                    }
                    if(full){
                        System.out.println("Se llego a la capacidad maxima de vehiculos");
                    }
                    
                    break;
                case 4:
                    
                    int cont2 = 0;
                    boolean full2 = false;
                    for(int x = 0 ;x<edificio.size(); x++){
                        if("Cuartel".equals(edificio.get(x).getNombre()) && edificio.get(x).getVelocidad() == 0){
                            if(edificio.get(x).getEspecialidad() > 0){
                                full2 = false;
                                //crear tropa
                                costo = edificio.get(x).ReclutarTropa(edificio.get(0).getCantidadRecurso3());
                                if(costo!=0){
                                    edificio.get(x).setEspecialidad(edificio.get(x).getEspecialidad() - 1);
                                }
                                edificio.get(0).setCantidadRecurso3(edificio.get(x).getCantidadRecurso3() - costoE);
                                
                            }
                            else{
                                full2 = true;
                            }
                            cont2++;
                        }
                    }
                    if(cont2 == 0){
                        System.out.println("No tiene cuartel");
                    }
                    if(full2){
                        System.out.println("Llego al maximo de tropas");
                    }
                    
                    break;
                case 5:
                    System.out.println("*****************************************************");
                    System.out.println("PIEDRA: " + edificio.get(0).getCantidadRecurso1());
                    System.out.println("MADERA: " + edificio.get(0).getCantidadRecurso2());
                    System.out.println("CARNE: " + edificio.get(0).getCantidadRecurso3());
                    System.out.println("*****************************************************");
                    break;
                case 6:
                    boolean cont3 = true;
                    
                    if(cont3){
                        for(int x = 0 ;x<edificio.size(); x++){
                            if("Extractor recurso 1".equals(edificio.get(x).getNombre()) && edificio.get(x).getVelocidad() == 0 ){
                                if(edificio.get(x).getEspecialidad() != 0){
                                    edificio.get(0).setCantidadRecurso1(edificio.get(0).getCantidadRecurso1() + edificio.get(x).getEspecialidad());
                                    if(edificio.get(0).getCantidadRecurso1() > edificio.get(0).getMaxRecurso1()){
                                        edificio.get(0).setCantidadRecurso1(edificio.get(0).getMaxRecurso1());
                                    }
                                    edificio.get(x).setEspecialidad(0);
                                    System.out.println("Recoletactes con exito la piedra");
                                    System.out.println("tienes: "+ edificio.get(0).getCantidadRecurso1()+ " de piedra");
                                }
                                else{
                                    System.out.println("No tienes mas piedra para recolectar");
                                }
                                cont3=false;
                                
                            }        
                        }
                    }
                    else{System.out.println("No tienes el edificio");}
                case 7:
                    boolean cont4 = true;
                    
                    if(cont4){
                        for(int x = 0 ;x<edificio.size(); x++){
                            if("Extractor recurso 2".equals(edificio.get(x).getNombre()) && edificio.get(x).getVelocidad() == 0 ){
                                if(edificio.get(x).getEspecialidad() != 0){
                                    edificio.get(0).setCantidadRecurso2(edificio.get(0).getCantidadRecurso2() + edificio.get(x).getEspecialidad());
                                    if(edificio.get(0).getCantidadRecurso2() > edificio.get(0).getMaxRecurso2()){
                                        edificio.get(0).setCantidadRecurso2(edificio.get(0).getMaxRecurso2());
                                    }
                                    edificio.get(x).setEspecialidad(0);
                                    System.out.println("Recoletactes con exito la piedra");
                                    System.out.println("tienes: "+ edificio.get(0).getCantidadRecurso1()+ " de piedra");
                                }
                                else{
                                    System.out.println("No tienes mas piedra para recolectar");
                                }
                                cont4=false;
                                
                            }        
                        }
                    }
                    else{System.out.println("No tienes el edificio");}
                    
                    
                    
                    break;
                case 8:
                    boolean cont5 = true;
                    
                    if(cont5){
                        for(int x = 0 ;x<edificio.size(); x++){
                            if("Extractor recurso 3".equals(edificio.get(x).getNombre()) && edificio.get(x).getVelocidad() == 0 ){
                                if(edificio.get(x).getEspecialidad() != 0){
                                    edificio.get(0).setCantidadRecurso3(edificio.get(0).getCantidadRecurso3() + edificio.get(x).getEspecialidad());
                                    if(edificio.get(0).getCantidadRecurso3() > edificio.get(0).getMaxRecurso3()){
                                        edificio.get(0).setCantidadRecurso3(edificio.get(0).getMaxRecurso3());
                                    }
                                    edificio.get(x).setEspecialidad(0);
                                    System.out.println("Recoletactes con exito la piedra");
                                    System.out.println("tienes: "+ edificio.get(0).getCantidadRecurso1()+ " de piedra");
                                }
                                else{
                                    System.out.println("No tienes mas piedra para recolectar");
                                }
                                cont5=false;
                                
                            }        
                        }
                    }
                    else{System.out.println("No tienes el edificio");}
                    
                case 9:
                    for (int i = 0;i < edificio.size();i++){
                        System.out.println((i+1) +" "+edificio.get(i).getNombre());
                        for (int x = 0; x<edificio.get(i).getSoldado().size();x++){
                            System.out.println("Tropa" + edificio.get(i).getSoldado().get(x).getName());
                        }
                    }
                    break;
                case 10:
                    flag = false;
                    break;
                
                default:
                    System.out.println("No existe la opcion");
                    break;
            
            }
        }
    
    }
    
    public void siguienteFase(){
        for(int x = 0 ; x < edificio.size() ; x++){
            //eDIFICIOS
            if(edificio.get(x).getVelocidad() != 0){
                edificio.get(x).setVelocidad(edificio.get(x).getVelocidad() - 1);
                System.out.println(edificio.get(x).getNombre() + " aun le faltan " + edificio.get(x).getVelocidad()+ " fases");
            }
            
            if(edificio.get(x).getVida() <= 0){
                System.out.println("se ha destruido el edificio: " + edificio.get(x).getNombre());
                edificio.remove(x);
            }
            //Transporte
            if(edificio.get(x).soldado.size()>0){
                
                for(int i = 0 ; i < edificio.get(x).soldado.size();i++){
                    if(edificio.get(x).soldado.get(i).getSpeed() != 0){
                        edificio.get(x).soldado.get(i).setSpeed(edificio.get(x).soldado.get(i).getSpeed() - 1); 
                    }
                    else{
                        Tropa.add(edificio.get(x).soldado.get(i));
                        edificio.get(x).soldado.remove(i);
                    }
                }
            }
            if(!edificio.get(x).vehiculo.isEmpty()){
                for(int i = 0 ; i < edificio.get(x).vehiculo.size();i++){
                    if(edificio.get(x).vehiculo.get(i).getSpeed() != 0){
                        edificio.get(x).vehiculo.get(i).setSpeed(edificio.get(x).vehiculo.get(i).getSpeed() - 1); 
                    }
                    else{
                        vehiculo.add(edificio.get(x).vehiculo.get(i));
                        edificio.get(x).vehiculo.remove(i);
                    }
                }
            }
            //EXTRACTORES
            if(edificio.get(x).getNombre().equals("Recolector de comida") || edificio.get(x).getNombre().equals("Recolector de Oro") || edificio.get(x).getNombre().equals("Recolector de materia prima")){
                edificio.get(x).setEspecialidad(edificio.get(x).getEspecialidad() + 50);
            }
            
        }
        
        //Ejercito al ataque
        for(int x = 0; x < TropasAlAtaque.size() ; x++){
            if(TropasAlAtaque.get(x).getTime() != 0){
                TropasAlAtaque.get(x).setTime(TropasAlAtaque.get(x).getTime() - 1);
                System.out.println(TropasAlAtaque.get(x).getName() + " para que llegue a la base enemiga faltan " + TropasAlAtaque.get(x).getTime() + "fases");
            }
            else{
                TusTropas.add(TusTropas.get(x));
                TusTropas.remove(x);
            }
        }
    }
    
    public int murio(){
        if(edificio.get(0).getVida() <= 0)
            return 0;
        else{return 1;}
    }

}
