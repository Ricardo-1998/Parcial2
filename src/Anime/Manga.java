/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anime;

import Anime.Alquemista.Alquemista;
import Anime.Demonio.Demonio;
import Anime.OnePiece.OnePiece;

/**
 *
 * @author Ricardo
 */
public interface Manga {
    Demonio GetDemon();
    Alquemista GetAlquemista();
    OnePiece GetPirata();
}
