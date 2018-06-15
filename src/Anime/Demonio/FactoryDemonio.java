/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anime.Demonio;

import Anime.Alquemista.Alquemista;
import Anime.Manga;
import Anime.OnePiece.OnePiece;

/**
 *
 * @author Ricardo
 */
public class FactoryDemonio implements Manga{
    @Override
    public Demonio GetDemon() {
        return new GremoryFam();
    }

    @Override
    public Alquemista GetAlquemista() {
        return null;
    }

    @Override
    public OnePiece GetPirata() {
        return null;
    }
}
