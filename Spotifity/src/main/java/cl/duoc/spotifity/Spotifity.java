/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.spotifity;

import cl.duoc.spotifity.models.Cancion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Cetecom
 */
public class Spotifity {

    public static void main(String[] args) {
        Cancion song = new Cancion();
        Cancion song2 = new Cancion();
        Cancion song3 = new Cancion();
        Cancion song4 = new Cancion();
        Cancion song5 = new Cancion();
        Cancion song6 = new Cancion();
        //----------------------------------------------------
        List<Cancion> musica = new ArrayList();
        List<Cancion> musica2 = new ArrayList();
        //----------------------------------------------------
        song.setTitulo("FAERIE SOIRÉE");
        song.setArtista("Melanie Martinez");
        song.setDuracion(2, 43);
        song.setFavorita(true);
        song.setDescarga(true);
        
        song2.setTitulo("Mona Lisa");
        song2.setArtista("Dominic Fike");
        song2.setDuracion(3, 6);
        song2.setFavorita(true);
        song2.setDescarga(true);
        
        song3.setTitulo("7 Hours");
        song3.setArtista("Dominic Fike");
        song3.setDuracion(2, 48);
        song3.setFavorita(true);
        song3.setDescarga(true);
        //---------------------------------------------------------
        song4.setTitulo("Kosmos, Cosmos");
        song4.setArtista("THE IDOLM@STER 765PRO");
        song4.setDuracion(4, 8);
        song4.setFavorita(true);
        song4.setDescarga(true);
        
        song5.setTitulo("Self Love");
        song5.setArtista("Metro Boomin - Coi Leray");
        song5.setDuracion(3, 9);
        song5.setFavorita(true);
        song5.setDescarga(true);
        
        song6.setTitulo("Bones");
        song6.setArtista("Imagine Dragons");
        song6.setDuracion(2, 45);
        song6.setFavorita(true);
        song6.setDescarga(true);
        //---------------------------------------------------------
        musica.add(song);
        musica.add(song2);
        musica.add(song3);
        //------------------------------------------------------------
        musica2.add(song4);
        musica2.add(song5);
        musica2.add(song6);
        //---------------------------------------------------------
        
        System.out.println("Menu");
        System.out.println("\nReproducir lista 1: 0, 1, 2");
        System.out.println("\nReproducir lista 2: 0, 1, 2");
        
        String opcion = JOptionPane.showInputDialog("escoja una de las opciones");
        
        /*
        if("1".equals(opcion)){
            System.out.println(musica);
        }else if("2".equals(opcion)){
            System.out.println(musica2);
        }else{
            System.out.println("Hubo un problema");
        }
        esto si solo quiero mostrar una de las listas
        */
        
        switch(opcion){
            case "1":
                System.out.println(musica);
                break;
            case "2":
                System.out.println(musica2);
                break;
            case "1,0":
                System.out.println(song);
                break;
            case "1,1":
                System.out.println(song2);
                break;
            case "1,2":
                System.out.println(song3);
                break;
            case "2,0":
                System.out.println(song4);
                break;
            case "2,1":
                System.out.println(song5);
                break;
            case "2,2":
                System.out.println(song6);
                break;
            default:
                System.out.println("Algo salio mal");
        }//switch si quiero mostrar una de las listas o elegir 1 cancion especifica
    }
}
