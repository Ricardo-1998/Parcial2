/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anime;

import Anime.Alquemista.Central;
import Anime.Demonio.FactoryDemonio;
import Anime.OnePiece.NuevoMundo;


/**
 *
 * @author Ricardo
 */
public class MangaProducer {
    public static Manga getFactory(String Type){
        switch(Type){
            case "Onepiece":
                return new NuevoMundo();
            case "Alquemista":
                return new Central();
            case "Demonio":
                return new FactoryDemonio();
        }
        return null;
    }
}
