/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.actividadmusica.models;

import java.time.LocalTime;

/**
 *
 * @author Cetecom
 */
public class Cancion {
    private String titulo;
    private String artista;
    private LocalTime duracion;
    private boolean favorita;

    public Cancion() {
        this.titulo = "Tomboy";
        this.artista = "(G)idle";
        this.duracion = LocalTime.of(0, 4, 14);
        this.favorita = false;
    }
    
    public Cancion(String titulo, String artista, LocalTime duracion, boolean favorita) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorita = favorita;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }
    
    public void setDuracion(int hora, int minuto, int segundo) {
        this.duracion = LocalTime.of(hora, minuto, segundo);
         
            if(minuto > 4){
                System.out.println("duracion larga");
            }else{
                System.out.println("duracion normal");
            }
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }
    
    @Override
    public String toString(){
        String mensaje = "titulo:"+titulo+" Artista:"+artista+" Duración:"+duracion+" favoritos:"+favorita;
        return mensaje;
    }
    
    
}
