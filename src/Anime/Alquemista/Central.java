/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anime.Alquemista;


import Anime.Demonio.Demonio;
import Anime.Manga;
import Anime.OnePiece.OnePiece;

/**
 *
 * @author Ricardo
 */
public class Central implements Manga {

    @Override
    public Demonio GetDemon() {
        return null;
    }

    @Override
    public Alquemista GetAlquemista() {
        return new AlquemistaEstatal();
    }

    @Override
    public OnePiece GetPirata() {
        return null;
    }
    
}
