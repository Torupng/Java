/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.actividadmusica;

import cl.duoc.actividadmusica.models.Cancion;

/**
 *
 * @author Cetecom
 */
public class ActividadMusica {

    public static void main(String[] args) {
        Cancion musica1 = new Cancion();
        
        System.out.println(musica1);
        
        Cancion musica2 = new Cancion();
        
        musica2.setTitulo("Unconditionally");
        musica2.setArtista("Katy Perry");
        musica2.setDuracion(6, 20);
        musica2.Adelantar(20);
        musica2.Retroceder(12);
        musica2.setFavorita(true);
        musica2.setDescarga(true);
        
        
        
        System.out.println(musica2);
    }
}
