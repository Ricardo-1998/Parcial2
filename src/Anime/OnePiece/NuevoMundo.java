/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anime.OnePiece;

import Anime.Alquemista.Alquemista;
import Anime.Demonio.Demonio;

import Anime.Manga;

/**
 *
 * @author Ricardo
 */
public class NuevoMundo implements Manga{
    @Override
    public Demonio GetDemon() {
        return null;
    }

    @Override
    public Alquemista GetAlquemista() {
        return null;
    }

    @Override
    public OnePiece GetPirata() {
        return new Mugiwaras();
    }
}
